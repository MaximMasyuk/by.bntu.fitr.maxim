
package Task9;


public class Test {
   public static String test(int k){ 
     int a[]={1,2,3,4,5};
     for(int n=0; n<a.length ;n++){
	 if( k == a[n]){
	     return "Входит";
              
	 }
	
     }
       return "не Входит";
}
    public static void main(String[] args) {
	System.out.println(test(6));
    }
}