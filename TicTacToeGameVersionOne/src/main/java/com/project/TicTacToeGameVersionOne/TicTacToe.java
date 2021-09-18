package com.project.TicTacToeGameVersionOne;

public class TicTacToe {

	static String[] board;

	public static void main(String[] args) {
		playTicTacToe();

		createGameBoardNumbers();
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
