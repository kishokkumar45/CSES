//package CSESPROBLEMS;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char temp=s.charAt(0);
        int count=0,max=0;
        for(int i=0;i<s.length();i++) {
            if (temp == s.charAt(i)) count++;
            else count = 1;
            max = Math.max(count, max);
            temp = s.charAt(i);
        }
        System.out.println(max);
    }
}
