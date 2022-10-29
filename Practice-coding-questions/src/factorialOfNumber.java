import java.io.*;
import java.util.*;
public class factorialOfNumber {
	 public static void main(String[] args) {	     
	     //taking input using Scanner class
	     Scanner sc = new Scanner(System.in);
	     //creating an object of class Factorial
	     Solution1 obj = new Solution1();
	     int N;
	     //taking N
	     System.out.println("Enter a number: ");
	     N = sc.nextInt();
	     //calling factorial() method 
	     //of class Factorial
	     System.out.println("Factorial of "+N+" is ="+obj.factorial(N));
	 }
}

class Solution1 {

 public long factorial(int N) {
     long result=1;     // initializing variable to find factorial
     if(N==0 || N==1){  // base case if number is 0 or 1 factorial is 1 ie. 0! =1 & 1! = 1
         return 1;
     }
     else{				// iterative solution
         for(int i=2;i<=N;i++){
             result = result*i; 
         }
     }
     return result;
 }
}
