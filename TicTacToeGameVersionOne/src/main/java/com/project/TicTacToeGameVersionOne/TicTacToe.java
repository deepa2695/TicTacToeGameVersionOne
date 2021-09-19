package com.project.TicTacToeGameVersionOne;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

	static String[] board;
	static String turn;

	public static void main(String[] args) {
		playTicTacToe();

		createGameBoardNumbers();

		createGameBoard();

		messageToEnterNumberToXPlayer();
		
		String winner = null;
		Scanner in = new Scanner(System.in);
		turn = "X";
		while(winner == null){
			int numInput = in.nextInt();
			isValidInput(numInput);
			markEnteredNumberInTheBox(numInput);
			winner = findWhoWIns(board);
			System.out.println(winner);
		}
		if(winner == "X" || winner == "O"){
			System.out.println("You-"+winner+ " this game..!!");
		}
		
	}

	static String findWhoWIns(String[] board) {
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			
			if (line.equals("XXX")) {
				return "X";
			}
			
			if (line.equals("OOO")) {
				return "O";
			}
			
			
		}
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(
					String.valueOf(a + 1))) {
				break;
			}
			else if (a == 8) {
				return "draw";
			}
		}
		return null;
	}
	protected static boolean markEnteredNumberInTheBox(int numInput) {
		
		boolean dd = false;
		if (board[numInput - 1].equals(
				String.valueOf(numInput))) {
			board[numInput - 1] = turn;
			dd = true;
			
			//setPlayerTurn(turn);
			
			if (turn.equals("X")) {
				turn = "O";
			}
			else {
				turn = "X";
			}
			createGameBoard();
		}
		return dd;
	}

	protected static String setPlayerTurn(String turn) {
		if (turn.equals("X")) {
			turn = "O";
		}
		else {
			turn = "X";
		}
		return turn;
	}

	protected static boolean isValidInput(Integer numInput) {
		
		boolean isValid = true;
		try {
			if (!(numInput > 0 && numInput <= 9)) {
				System.out.println("Invalid input; Please enter a valid number:");
				isValid = false;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input; Please enter a valid number:");
		}
		return isValid;
	}

	protected static String messageToEnterNumberToXPlayer() {
		String message = "X will play first. Enter a slot number to place X in:";
		System.out.println(message);
		return message;
	}

	protected static void createGameBoard() {
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("|---|---|---|");
	}

	protected static String[] createGameBoardNumbers() {
		board = new String[9];

		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
			System.out.println(board[a]);
		}

		return board;
	}

	static String playTicTacToe() {
		return welcomeMessage();
	}

	protected static String welcomeMessage() {
		String welcomeMsg = "Welcome To Tic Tac Toe Game..!!!";
		System.out.println(welcomeMsg);
		return welcomeMsg;
	}

}
