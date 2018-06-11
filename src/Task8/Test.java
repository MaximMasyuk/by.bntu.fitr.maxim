
package Task8;

import java.util.Scanner;


public class Test {
    public static int fib(int n){

    int a = 0;
    int b = 1;
    for (int i = 2; i <= n; ++i) {
        int next = a + b;
        a = b;
        b = next;
    }
return b;
    }
    
    public static void main(String[] args) {
	System.out.println(fib(3));
    }
    

 }


