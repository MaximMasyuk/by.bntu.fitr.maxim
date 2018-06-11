
package Task3;


public class Task3 {
 public static int test(int n){
    if (n<10){
	System.out.print(n+" ");
	n++;
	test(n);
    }
    else if(n==10) System.out.println(n);
    return 0;
     }
    public static void main(String[] args) {
	test(1);
    }
}

