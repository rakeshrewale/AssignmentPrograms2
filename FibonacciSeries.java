package AssignmentPrograms2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i = 1;
		int num = 10;
		int firstTerm = 0;
		int secondTerm = 1;
	    System.out.println("Fibonacci Series till " + num + " terms:");

	    while (i <= num)
	    {
	      System.out.print(firstTerm + ", ");
	      int nextTerm = firstTerm + secondTerm;
	      
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      i++;
	    }
	}

}
