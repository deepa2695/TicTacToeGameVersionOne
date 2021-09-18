package com.project.TicTacToeGameVersionOne;

public class TicTacToe {

	public static void main(String[] args) {
		playTicTacToe();
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
