package test.面试;

/**
 * @ClassName: Water
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/4 11:35
 * @Version: V1
 **/

public class Water {

    public static boolean canMeasureWater(int x, int y, int z) {
        if(x == 0 && y == 0) return z == 0;
        return z == 0 || (z % gcd(x,y) == 0 && x + y >= z);
    }
    static int gcd(int x,int y){
        if(y == 0) return x;
        int r = x % y;
        return gcd(y,r);
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 1;
        boolean b = canMeasureWater(x, y, z);
        System.out.println(b);
    }
}