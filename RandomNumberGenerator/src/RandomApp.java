import java.util.Random;
import java.util.Scanner;

public class RandomApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran =new Random();
		int random=ran.nextInt(0,100);
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(true) {
			System.out.println("Enter your guess: ");
			int guess=sc.nextInt();
			
			count++;
			if(guess==random) {
				System.out.println("Congratulations! You guessed the number "+random+"! It took you "+count+" attempts.");
				break;
			}
			else if(guess>random) {
				System.out.println("TOO High!!");
			}
			else {
				System.out.println("Too Low!!");
			}
		}
	}

}
