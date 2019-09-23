
/*Name: Greatzel Unabia
 * Class name: ExceptionInClassV1.0
 * This class contains a main method
 * and checks if the user's entered value
 * is a month the randomly generated values within the array
 * */
import java.util.EmptyStackException;
import java.util.Scanner;

public class ExceptionInClass {

	public static void main(String[] args) {
		
		int counter = 0;
		
		int[] indexList = new int[100];
		Scanner userInput = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
			indexList[i] = (int) (Math.random() * 100);
			//System.out.println(indexList[i]);
		}
		
		System.out.println("Please choose an index to display");
		int userEntry = userInput.nextInt();
		
		try {
		
		for (int i =0 ; i < indexList.length ; i++) {
			if (userEntry == indexList[i]) {
				userEntry = indexList[i];
				counter +=1;
			}
			else if(counter == 0) {
				throw new EmptyStackException();
			}
			System.out.println(userEntry);
		}
		} catch (Exception e) {
			System.out.println("Out of bounds");
		}
			userInput.close();
	}
}
