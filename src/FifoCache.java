import java.util.*;

public class FifoCache<K, V> {
    private final int maxSize;
    private final Queue<K> keyQueue;
    private final Map<K, V> cache;
    public FifoCache(int maxSize) {
        this.maxSize = maxSize;
        this.keyQueue = new LinkedList<>();
        this.cache = new HashMap<>();
    }
    public synchronized void put(K key, V value) {
        if (cache.size() >= maxSize) {
            // 缓存已满，需要移除最早放入的元素
            K oldestKey = keyQueue.poll();
            cache.remove(oldestKey);
        }
        keyQueue.offer(key);
        cache.put(key, value);
    }
    public synchronized V get(K key) {
        return cache.get(key);
    }
    public synchronized boolean containsKey(K key) {
        return cache.containsKey(key);
    }
    public synchronized void clear() {
        keyQueue.clear();
        cache.clear();
    }
    public synchronized int size() {
        return cache.size();
    }
    public static void main(String[] args) {
        FifoCache<String, Integer> cache = new FifoCache<>(10);
        // 模拟向缓存中添加学生成绩
        for (int i = 1; i <= 108; i++) {
            String studentId = "Student" + i;
            int score = (int) (Math.random() * 101); // 随机生成成绩
            cache.put(studentId, score);
        }
        // 从缓存中读取学生成绩
        String studentIdToRetrieve = "Student5"; // 例如要获取学生5的成绩
        if (cache.containsKey(studentIdToRetrieve)) {
            int score = cache.get(studentIdToRetrieve);
            System.out.println(studentIdToRetrieve + "的成绩为：" + score);
        } else {
            System.out.println("缓存中没有找到学生" + studentIdToRetrieve + "的成绩");
        }
    }
}
