package IntroductoryProblems;


import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) {
            System.out.println(1);
            return;
        }
        if(n<4) System.out.println("NO SOLUTION");
        else{
            if(n==4) System.out.print("2 4 1 3");
            else if(n%2==1){
                StringBuilder sb=new StringBuilder();
                for(int i=n;i>=1;i-=2) sb.append(i).append(" ");
                for(int i=n-1;i>=2;i-=2) sb.append(i).append(" ");
                System.out.print(sb.toString());
            }
            else{
                StringBuilder sb=new StringBuilder();
                for(int i=n;i>=2;i-=2) sb.append(i).append(" ");
                for(int i=n-1;i>=1;i-=2) sb.append(i).append(" ");
                System.out.print(sb.toString());
            }
        }
    }
}
