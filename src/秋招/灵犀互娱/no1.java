package 秋招.灵犀互娱;

import java.util.*;

/**
 * @ClassName: no1
 * @Description:
 * @Author: JoshLee
 * @Date: 2023/8/26 10:31
 * @Version: V1
 */
public class no1 {
    public static void main(String[] args) {
        String[] numbers = {"9999", "9998", "1000"};
        String target = "1001";
        int result = openLock(numbers, target);
        System.out.println(result);
    }
    public static int openLock(String[] deadends, String target) {
        //对于这道题的分析我们可以通过图的算法来解决，首先如果要运用图的算法就先要抽象出图的节点和边，我们将密码的状态当做一个节点，将密码状态的一个转换当做一条边，找到最少的变换次数开锁也就是说我们需要在这样一个无权图中寻找一个最短路径，使用广度优先搜索再合适不过了，因为广度优先搜索的特点在于先寻找本节点距离为1的节点在接着递增步长寻找节点。这样当我们第一次寻找到目标节点就一定是距离本节点的距离最短的情况。
        //首先需要创建一个集合用于存储所有的死锁状态，这是为了以O（1）的复杂度来检索死锁
        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        //先判断0000也就是初始状态和target是否存在死锁的状态中，存在则说明它们不可达直接就不需要判断了
        String start = "0000";
        if(dead.contains(start) || dead.contains(target)){
            return -1;
        }
        //创建两个队列逐层广度搜索，queue1用于保存当前搜索的队列初始值为0000，queue2用于保存下一次应该搜索的状态，当每次queue1为空就说明一层搜索完毕需要将queue2赋值给queue1继续搜素，这时搜索的层数就该加上1了
        Queue<String> queue1 = new LinkedList<>();
        queue1.offer(start);
        visited.add(start);
        Queue<String> queue2 = new LinkedList<>();
        //定义当前搜索是那一层
        int step = 0;
        //开始广度优先搜索
        while(!queue1.isEmpty()){
            //首先取出队列中的一个节点
            String cur = queue1.poll();
            //查看这个节点是不是我们要1寻找的节点如果是直接放回当前的步长
            if(cur.equals(target)){
                return step;
            }
            //计算出该节点所有未访问过的相邻状态，并且如果该状态是死锁状态就直接不用理会此路不通
            List<String> neighbors = getNeighbor(cur);
            for(String neighbor : neighbors){
                if(!dead.contains(neighbor) && !visited.contains(neighbor)){
                    queue2.offer(neighbor);
                    visited.add(neighbor);
                }
            }
            //如果queue1为空则说明当前的层已经遍历完毕准备遍历下一层
            if(queue1.isEmpty()){
                queue1 = queue2;
                queue2 = new LinkedList<>();
                step++;
            }
        }
        //当所有的节点都已经搜索完毕也无法查找到节点说明已经找不到了
        return -1;
    }

    //用于查找所有的相邻节点
    private static List<String> getNeighbor(String cur){
        List<String> neighbors = new LinkedList<>();
        //遍历cur的每一个位置，对改位置+-1找到八个相邻的位置，需要注意9 + 1 = 0;0 - 1 = 9
        for(int i = 0;i < cur.length();i++){
            //取出当前位置
            char curChar = cur.charAt(i);
            //对当前位置加一
            char ch = curChar == '9' ? '0' : (char)(curChar + 1);
            StringBuilder buffer = new StringBuilder(cur);
            buffer.setCharAt(i,ch);
            neighbors.add(buffer.toString());
            ch = curChar == '0' ? '9' : (char)(curChar - 1);
            buffer.setCharAt(i,ch);
            neighbors.add(buffer.toString());
        }
        return neighbors;
    }

}

