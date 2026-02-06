package bha;

public class main {

	
	    public static void main(String[] args) {
  
	        string [] input1= ["ab","cd","ef"];
	        string [] input2= ["af","ee","ef"];
	        

	        // Convert to char array
	        char[] arr = input.toCharArray();

	        // Sort in descending order
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] < arr[j]) {   // swap for descending
	                    char temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }

	        // Create output string
	        String output = new String(arr);
	        System.out.println( output);

	}
}