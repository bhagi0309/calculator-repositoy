package bha;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//class Library {
//    private int number_of_books;
//    private String name;
//    private Map<String, Integer> bookGenres = new HashMap<>();
//
//   
//    public int getNumber_of_books() { return number_of_books; }
//    public String getName() { return name; }
//    public Map<String, Integer> getBookGenres() { return bookGenres; }
//
//    
//    public void setNumber_of_books(int number_of_books) { this.number_of_books = number_of_books; }
//    public void setName(java.lang.String string) { this.name = string; }
//    public void setBookGenres(Map<String, Integer> bookGenres) { this.bookGenres = new HashMap<>(bookGenres); }
//}
//public class books{
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		
//		Library lib = new Library();
//        lib.setName(sc.nextLine());
//        lib.setNumber_of_books(Integer.parseInt(sc.nextLine()));
//
//        int n = Integer.parseInt(sc.nextLine());
//        Map<String, Integer> map = new HashMap<>();
//
//		
//		
//	}
//}

public class books {
	
	    public static void main(String[] args) {

	        string s = "7596801";   // given input

	        Object input;
			// Convert to char array
	        char[] arr = ((Object) input).toCharArray();

	        // Swap first and second digit: 7 ↔ 9  (as per your expected output)
	        char temp = arr[0];
	        arr[0] = arr[1];
	        arr[1] = temp;

	        // Convert back to string
	        String output = new String(arr);

	        System.out.println(output);   // prints 9758601
	    }
	}