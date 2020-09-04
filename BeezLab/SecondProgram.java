import java.io.*;
public class SecondProgram
{

	public static void main(String[] args) {

	    int count = 1,flag=0;

	    int arr[] = {1,3,5,4,7,6};

	    for(int i=2;i<=(arr.length+1);i++){

	                count+=i;

	                count-=arr[i-2];

	            }

	            System.out.println(count);

	}


}

