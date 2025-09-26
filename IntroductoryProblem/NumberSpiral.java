package IntroductoryProblems;

import java.io.*;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(br.readLine().trim());
        while(t-->0){
          String s[]=br.readLine().split(" ");
          long r=Long.parseLong(s[0]);
          long c=Long.parseLong(s[1]);
          if(r==c){
              sb.append(r*r-(r-1)).append("\n");
          }
          else{
              long ans=0,val=Math.max(r,c);
              val=val*val-(val-1);
              if(r>c){
                  if((r&1)==0) ans=val+(r-c);
                  else ans=val-(r-c);
              }
              else{
                  if((c&1)==0) ans=val-(c-r);
                  else ans=val+(c-r);
              }
              sb.append(ans).append("\n");
          }
        }
        System.out.println(sb);
    }
}
