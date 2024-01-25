package ArrayOperations;

import java.util.Scanner;

import javax.swing.text.PlainDocument;

public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String players[][]=new String[4][];
		players[0]=new String[2];
		players[1]=new String[4];
		players[2]=new String[3];
		players[3]=new String[2];
		//Two dimensional array to add names of players in 4 games
		for(int i=0;i<players.length;i++) {
			for(int j=0;j<players[i].length;j++) {
				players[i][j]= scan.nextLine();
				
			}
		}
		for(int i=0;i<players.length;i++) {
			for(int j=0;j<players[i].length;j++) {
				System.out.println(players[i][j]);
				
			}
		}
	}

}
