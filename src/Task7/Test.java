
package Task7;

public class Test {
    public static String test(int i) {
	if(i==12||i>=1&&i<=2){
	return"Зима";    }
	
	if(i>=3&&i<=5){
	return "Весна";    }
	 
	if(i>=6&&i<=8){
	return"Лето";    }
	
	else if(i>=9&&i<=11){return"Осень";  }   
	return null;
	
    }
    public static void main(String[] args) {
	System.out.println(test(3));
    }
}
