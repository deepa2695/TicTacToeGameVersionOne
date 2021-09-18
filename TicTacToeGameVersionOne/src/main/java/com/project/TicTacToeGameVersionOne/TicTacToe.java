package com.project.TicTacToeGameVersionOne;

public class TicTacToe {

	static String[] board;

	public static void main(String[] args) {
		playTicTacToe();

		createGameBoardNumbers();

		createGameBoard();

		messageToEnterNumberToXPlayer();

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
