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
	
	@Test
	public void shouldReturnTrueIfPlayerEntersValidInputNumber() {
		Assert.assertTrue(TicTacToe.isValidInput(6));
	}
	
	@Test
	public void shouldReturnFalseIfPlayerEntersInputNumberIsNotValid() {
		Assert.assertFalse(TicTacToe.isValidInput(0));
	}
	
	@Test
	public void shouldHandleExceptionIfPlayerEntersInputNumberIsNotValid() {
		Assert.assertFalse(TicTacToe.isValidInput(10));
	}

	@Test
	public void shouldReturnTrueIfBoardNumberEqualsToEnteredNumber() {
		Assert.assertTrue(TicTacToe.markEnteredNumberInTheBox(9));
	}
	
	@Test
	public void shouldReturnOifEnteredPlayerIsX() {
		Assert.assertEquals("O", TicTacToe.setPlayerTurn("X"));
	}
	
	@Test
	public void shouldReturnXifEnteredPlayerIsO() {
		Assert.assertEquals("X", TicTacToe.setPlayerTurn("O"));
	}
	
	@Test
	public void shouldReturnXXXIfAnyLineFilledByX() {
		String[] expected = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		Assert.assertEquals("XXX",TicTacToe.findWhoWIns(expected));
	}
	
	@Test
	public void shouldReturnOOOIfAnyLineFilledByO() {
		String[] expected = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		Assert.assertEquals("OOO",TicTacToe.findWhoWIns(expected));
	}
	
}
