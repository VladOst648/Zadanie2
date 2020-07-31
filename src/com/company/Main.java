package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b;
        Scanner str = new Scanner(System.in);
        a = str.nextInt();
        Scanner str2 = new Scanner(System.in);
        b = str2.nextInt();
        System.out.print("(a = " + a + " b = " + b + "): " + a + "/" + b + " = " + (a/b) + " и " + (a%b) + " в остатке");
    }
}
