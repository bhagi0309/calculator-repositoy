package bha;

import java.util.Scanner;

public class vv {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your roll no: ");
        int rollNo = scan.nextInt();

        System.out.println("Your roll number is: " + rollNo);

        scan.close();
    }
}