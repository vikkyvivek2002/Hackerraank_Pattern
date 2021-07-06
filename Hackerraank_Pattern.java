import java.util.*;
public class Hackerraank_Pattern
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = s.nextInt();
        for(int i = n-1; i>=1-n;i--)
        {
        	for(int j = n-1; j>=1-n ; j--)
        	{
        		if(Math.abs(i) > Math.abs(j) )
        			System.out.print(Math.abs(i) + 1+" ");
        		else
        			System.out.print(Math.abs(j) + 1+" ");
        	}
        	System.out.println();
        }
	}

}
