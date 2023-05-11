package test.理想汽车;

import java.util.*;

/**
 * @ClassName: test03
 * @Description: TODO
 * @Author: lww
 * @Date: 2023/4/20 14:24
 * @Version: V1
 **/
public class test03 {
    public static void main(String[] args) {
        // 假设四个点的坐标值分别为(x1, y1), (x2, y2), (x3, y3), (x4, y4)
        double x1 = 3.0, y1 = 0.0;
        double x2 = 0.0, y2 = 1.0;
        double x3 = 1.0, y3 = 1.0;
        double x4 = 1.0, y4 = 0.0;
        // 计算四边形的边长和对角线长度
        double a = distance(x1, y1, x2, y2);
        double b = distance(x2, y2, x3, y3);
        double c = distance(x3, y3, x4, y4);
        double d = distance(x4, y4, x1, y1);
        double e = distance(x1, y1, x3, y3);
        // 判断四边形的类型，并计算出四边形的面积
        double area = 0.0;
        if (a == c && b == d && a != b) {
            // 矩形
            area = a * b;
        } else if (a == c && b == d && a == b) {
            // 正方形
            area = a * a;
        } else if (a == c && b != d) {
            // 平行四边形
            area = b * e;
        } else if (a == d && b != c) {
            // 平行四边形
            area = b * e;
        } else if (b == c && a != d) {
            // 平行四边形
            area = a * e;
        } else if (b == d && a != c) {
            // 平行四边形
            area = a * e;
        } else {
            // 梯形
            double s = (a + c + e) / 2.0;
            double h = 2.0 / e * Math.sqrt(s * (s - a) * (s - c) * (s - e));
            area = 0.5 * (a + c) * h;
        }
        System.out.println("四边形的面积为：" + area);
    }
    // 计算两点之间的距离
    private static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}


/*


 */