
package task5;

import java.util.Scanner;


public class Ttiangle {
    public Ttiangle(){}
	public static boolean isTtiangle(int a,int b, int c){
	    boolean isTring=false;
	    if(a+b>c){
		if(a+c>b){
		    if(b+c>a) isTring=true;
		    else isTring=false;
		}
		else isTring= false;
			
	    }
	    else isTring=false; 
	    return isTring;
	}
	   public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Input number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	String msgYes ="yes";
	String msgNo ="no";
	if (isTtiangle(a,b ,c))System.out.println(msgYes);
	else System.out.println(msgNo);
    }
    }

