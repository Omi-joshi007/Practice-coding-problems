import java.io.*;
import java.util.*;
public class quadraticEquationRoots {
	public static void main(String[] args) {
		System.out.println("Enter values of a,b,c in ax2 + bx + c -");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("a = ");
        a = sc.nextInt();
        System.out.println("b = ");
        b = sc.nextInt();
        System.out.println("c = ");
        c = sc.nextInt();
        Solution obj = new Solution();
        ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
        if (ans.size() == 1 && ans.get(0) == -1) //If roots are imaginary, the generated output will display "Imaginary".
           System.out.print("Imaginary");
        else
           for (Integer val : ans) System.out.print(val + " ");
        System.out.println();
        
    }
}
class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<Integer>(); 
        int determinant = (b*b)-(4*a*c); 	// calculating determinant
        if (determinant>=0){ 			  	// if determinant is positive
            Double d1 = Math.floor((-b+(Math.sqrt(sqrt)))/(2*a));
            Double d2 = Math.floor((-b-(Math.sqrt(sqrt)))/(2*a));
            if(d1 > d2){                    // for roots to assign in decreasing order
                roots.add(d1.intValue());
                roots.add(d2.intValue());
            }
            else{
                roots.add(d2.intValue());
                roots.add(d1.intValue());
            }
        }
        else{ 								// if determinant is not positive If roots are imaginary, the returning list should contain only 1 integer ie -1
            roots.add(-1);
        }
        return roots;
        
    }
}

