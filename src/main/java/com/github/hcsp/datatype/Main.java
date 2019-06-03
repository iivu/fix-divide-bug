package com.github.hcsp.datatype;

public class Main {
    // 我们希望实现一个除法，但是这里的结果有明显的错误
    // 例如 2/1 == 1.0
    // 请修复此问题，让2/1的结果为正确的0.5
    // 不要修改方法的参数类型
    public static double divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("2/1=" + divide(2, 1));
    }
}