package Task10;

import java.util.Random;


public class Test {
    
    public static int[] sort(int[] arr) {
	for (int min = 0; min < arr.length - 1; min++) {
		int least = min;
		for (int j = min + 1; j < arr.length; j++) {
		    if (arr[j] < arr[least]) {
				least = j;
			}
		}
		    int tmp = arr[min];
		    arr[min] = arr[least];
		    arr[least] = tmp;
	}
        return arr;
}
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rnd= new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]= rnd.nextInt(100);
        }
        System.out.println(""+java.util.Arrays.toString(arr));
        sort(arr);
        System.out.println(""+java.util.Arrays.toString(arr));
    }
}
