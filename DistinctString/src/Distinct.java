
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Distinct {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];

        for(int i=0;i<n;i++){
          s[i]=sc.nextLine();
        }
       // sc.nextLine();
        int k=sc.nextInt();

        String[] dist=new String[n];
        int h=0;
        int count =0;
        for(int j=0;j<n;j++){
          count=0;
          for(int p=0;p<n;p++){
            if(s[j].equals(s[p])){
              count++;
            }
          }
          if(count==1){
            dist[h]=s[j];
            h++;
          }
        }
        System.out.print(dist[k-1]);


    }
}
