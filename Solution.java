import java.util.Scanner;

class Solution {
    public static boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        if(x<0 && x>9)
        {
            return true;
        }
        int xx=x;
        int reverse=0;
        while(x != 0)   
        {  
        int remainder = x % 10;  
        reverse = reverse * 10 + remainder;  
        x = x/10;  
        }  

        if(reverse==xx)
        {
            return true;
        }
        else{
            return false;
        }
    }
   public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number :");
        int a=sc.nextInt();
        boolean res=isPalindrome(a);
        System.out.println(res);
        sc.close();
        
   }
}