
package Task6;


public class Test {
    public static int test(int a, int b, int c) {
	int k ;
    if(a>1&&a>c){
	System.out.print(a) ;
	return a;
    }
    else if(b>c&&b>a){
	System.out.print (b);
	return b;
    }
    else if(c>b&&c>a){
   System.out.print(c) ;
	return c;
	}
  return 0;
  }
   public static void main(String[] args) {
	test(1,2,1);
	
	
    }
}
