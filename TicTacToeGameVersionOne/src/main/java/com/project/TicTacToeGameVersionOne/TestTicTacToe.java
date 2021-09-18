package com.project.TicTacToeGameVersionOne;

import org.junit.Test;

import junit.framework.Assert;

public class TestTicTacToe {
	
	@Test
	public void returnsWelcomeMessage(){
		Assert.assertEquals("Welcome To Tic Tac Toe Game..!!!", TicTacToe.playTicTacToe());
	}
}
