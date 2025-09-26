package IntroductoryProblems;

import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totsum=0,arrsum=0;
        for(int i=1;i<=n-1;i++){
            int val=sc.nextInt();
            totsum^=val;
            arrsum^=i;
        }
        totsum^=n;
        System.out.println(totsum^arrsum);
    }
}
