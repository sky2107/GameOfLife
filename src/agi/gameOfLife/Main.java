package agi.gameOfLife;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GameOfLife game = new GameOfLife();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Größe eingeben");
		
		int size = sc.nextInt();
	}

}
