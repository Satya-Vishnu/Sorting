import java.util.Scanner;

//import java.util.Scanner;
import java.util.Arrays;
public class NewSort {

	public static void main(String[] args) {
		int n,c;
		Scanner in = new Scanner(System.in);
	    System.out.println("Input number of integers to sort");
	    n = in.nextInt();
	    int array[] = new int[n];
	    System.out.println("Enter " + n + " integers");
	    for (c = 0; c < n; c++) 
	      array[c] = in.nextInt();
	    Arrays.sort(array);
	     for(int i: array)
	     {
	    	 System.out.println(i);
	     }
	     }
		// TODO Auto-generated method stub

	}


