package com.project.TicTacToeGameVersionOne;

import org.junit.Test;

import junit.framework.Assert;

public class TestTicTacToe {
	
	@Test
	public static void main(){
		Assert.assertEquals("Welcome To Tic Tac Toe Game..!!!", TicTacToe.playTicTacToe());
	}
}
