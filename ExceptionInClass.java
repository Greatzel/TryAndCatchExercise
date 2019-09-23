
/*Name: Greatzel Unabia
 * Class name: ExceptionInClassV1.0
 * This class contains a main method
 * and checks if the user's entered value
 * is a month the randomly generated values within the array
 * */
import java.util.Scanner;

public class ExceptionInClass {

	public static void main(String[] args) {
		
		//int userIndex = 0;
		//int matchInt = 0;
		
		// creates the array
		int[] indexList = new int[100];
		Scanner userInput = new Scanner(System.in);
		// randomly generates values and populates the array
		for (int i = 0; i < 100; i++) {
			indexList[i] = (int) (Math.random() * 100);
			System.out.println(indexList[i]);;
		}
		// tries a code and catches exceptions
		
		System.out.println("Enter integer:");
		int userIndex = userInput.nextInt();
		
		
		
		for (int i = 0 ; i<100 ;i++) {
			if (indexList[i] == userIndex) {
				System.out.println(indexList[i]);
			}
		}

		userInput.close();
	}
}
