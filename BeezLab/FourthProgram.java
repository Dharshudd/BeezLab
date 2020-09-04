import java.util.*;

import java.io.*;

public class FourthProgram{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int Strtingrange = sc.nextInt();

		int Endingrange = sc.nextInt();

		int count=0;


		for(int i=Strtingrange;i<=Endingrange;i=i*10){

			int divide = i*10;

			count += (Endingrange/divide)*i + Math.min(Math.max(Endingrange%divide-i +1, 0), i);

		}

		System.out.println(count);

	}

}