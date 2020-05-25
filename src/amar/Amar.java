
package amar;

import java.util.Scanner;

public class Amar {
    public static void main(String[] args) 
    {
   
  Scanner sc = new Scanner(System.in);
  
  // int n = sc.nextInt();
   int[] array = {4,-1,1,2,1};
   String[] s = {"c","t","i","x","a"};
   int k = 0;
   while(k>=0)
   {
       System.out.println(s[k]);
       k = array[k];
   }
   

}
}
