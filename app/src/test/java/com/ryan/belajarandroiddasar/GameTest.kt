package com.ryan.belajarandroiddasar

import org.junit.Assert
import org.junit.Test

class GameTest {

    @Test
    fun testPickRandomOption() {
        val option = listOf( "ROCK", "SCISSORS", "PAPER")
        Assert.assertTrue(option.contains(Game.pickRandomOption()))
    }

    @Test
    fun testPickDrawable() {
        Assert.assertEquals(R.drawable.paper, Game.pickDrawable("PAPER"))
        Assert.assertEquals(R.drawable.rock, Game.pickDrawable("ROCK"))
        Assert.assertEquals(R.drawable.scissors, Game.pickDrawable("SCISSORS"))
    }

    @Test
    fun isDraw() {
        Assert.assertTrue(Game.isDraw("ROCK", "ROCK"))
        Assert.assertTrue(Game.isDraw("PAPER", "PAPER"))
        Assert.assertTrue(Game.isDraw("SCISSORS", "SCISSORS"))

        Assert.assertFalse(Game.isDraw("ROCK", "PAPER"))
        Assert.assertFalse(Game.isDraw("PAPER", "SCISSORS"))
        Assert.assertFalse(Game.isDraw("SCISSORS", "ROCK"))
    }

    @Test
    fun isWin() {
        Assert.assertTrue(Game.isWin("ROCK", "SCISSORS"))
        Assert.assertTrue(Game.isWin("SCISSORS", "PAPER"))
        Assert.assertTrue(Game.isWin("PAPER", "ROCK"))

        Assert.assertFalse(Game.isWin("ROCK", "PAPER"))
        Assert.assertFalse(Game.isWin("PAPER", "SCISSORS"))
        Assert.assertFalse(Game.isWin("SCISSORS", "ROCK"))
    }
}