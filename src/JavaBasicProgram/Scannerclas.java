package JavaBasicProgram;

import java.util.Scanner;

public class Scannerclas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        System.out.println("enter name");
        String name = scan.next();
        
        System.out.println("enter last name");
       String lastname = scan.next();
       
       System.out.println("enter your age");
       scan.nextInt();
       
       System.out.println("enter you gender");
       scan.next();
       
       


	}

}
