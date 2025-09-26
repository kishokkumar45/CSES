package IntroductoryProblems;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int temp[]=Arrays.copyOf(arr,arr.length);
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]) {
                arr[i] = arr[i - 1];
            }
        }
        long max=0;
        for(int i=0;i<n;i++) max+=arr[i]-temp[i];
        System.out.println(max);
    }
}
