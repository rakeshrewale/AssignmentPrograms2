package AssignmentPrograms2;
import java.util.Scanner;

	public class PerfectNum {

	public static void main(String[] args) {
		int num=0; 
		int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = sc.nextInt();
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == num)
        {
            System.out.println("Given number is Perfect");
        }
        else
        {
            System.out.println("Given number is not Perfect");
        }    
    }

}


