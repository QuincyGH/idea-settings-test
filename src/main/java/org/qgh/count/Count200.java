package org.qgh.count;

public class Count200 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 200; i++) {
            sum += i;
        }
        // 打印计算结果
        System.out.println("sum = " + sum);
    }
}
