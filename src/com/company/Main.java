package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1)); //false because not equal 1
        System.out.println(hasEqualSum(1,1,2)); //true because equal 2
        System.out.println(hasEqualSum(1,-1,0)); //true because equal 0
    }

    public static boolean hasEqualSum(int var1, int var2, int var3) {
        int sum = var1+var2;
        if (sum == var3) {
            return true;
        }
        return false;
    }
}
