import java.io.*;

import java.util.*;

public class ThirdProgram
{

	public static void main(String[] args) {

	   Scanner sc = new Scanner(System.in);

	    System.out.println("Enter number1 and number2");

	    int number1 = sc.nextInt();

	    int number2 = sc.nextInt();

	    System.out.printf("Before Swapping\nnum1 = %d\nnum2 = %d\n",number1,number2);

	    System.out.printf("After swapping \nnum1 = %d\nnum2 = %d",number2,number1);

	}

}
