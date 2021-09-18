package com.project.TicTacToeGameVersionOne;

import org.junit.Test;

import junit.framework.Assert;

public class TestTicTacToe {

	@Test
	public void returnsWelcomeMessage() {
		Assert.assertEquals("Welcome To Tic Tac Toe Game..!!!", TicTacToe.playTicTacToe());
	}

	@Test
	public void shouldReturnTrueIfBoardNumbersAreEqualToGivenInput() {
		String[] output = TicTacToe.createGameBoardNumbers();
		String[] expected = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		for (int a = 0; a < 9; a++) {
			Assert.assertEquals(expected[a], output[a]);
		}
	}

	@Test
	public void shouldReturnTrueIfGivenInputMessageIsEqualToOutput() {
		Assert.assertEquals("X will play first. Enter a slot number to place X in:",
				TicTacToe.messageToEnterNumberToXPlayer());
	}

}
