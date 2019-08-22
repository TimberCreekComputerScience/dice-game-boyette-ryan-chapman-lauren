package dice;
import java.util.Scanner;

public class dice {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Choose a number to add up to 9");
	int die = (int) (Math.random()*6) + 1;

	int dye = (int) (Math.random()*6) + 1;

	int garbage = Scan.nextInt();
	
	int total = die + dye + garbage;{

		if(total == 9){
			System.out.println("You win!");
		} else {
			System.out.println("You lose");
		}
	}
	}
}
