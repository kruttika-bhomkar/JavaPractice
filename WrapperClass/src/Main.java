import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		identifyCharacter(ch);
	}
	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println("entered character "+ch+" is a digit");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("entered character "+ch+" is a special character");
			
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch)) {
					System.out.println("entered character is a lowercase vowel");
				}
				else {
					System.out.println("entered character is an uppercase vowel");
				}
				break;
			default:
				if(Character.isUpperCase(ch)) {
					System.out.println("character is uppercase consonent");
				}
				else {
					System.out.println("character is lowercase consonent ");
				}
			}
		}
	}

}
