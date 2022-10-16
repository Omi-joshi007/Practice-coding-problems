import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int I = sc.nextInt();
        Absolute_value obj = new Absolute_value();
        System.out.println("Absolute number is = "+obj.absolute(I));

    }
}

public class Absolute_value {
    public int absolute(int I) {
        if(I<0){
            return I*(-1);
        }
        else{
            return I;
        }
    }
}
