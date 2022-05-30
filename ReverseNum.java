package AssignmentPrograms2;

public class ReverseNum {

	public static void main(String[] args) {
		
		int num =  12345;
		int reversed  = 0;
		
		//Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to reverse " + num);
		
		
		while (num  != 0){
			int  rem = num % 10;
			reversed =  reversed * 10 + rem;
			num /= 10;
			}
		System.out.println("Reversed Number: " + reversed);

	}

}
