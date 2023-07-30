package com.ryan.belajarandroiddasar

import kotlin.random.Random

object Game {

    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
    )

    private val option = listOf("ROCK", "SCISSORS", "PAPER")

    private val optionDrawable = mapOf(
        "SCISSORS" to R.drawable.scissors,
        "ROCK" to R.drawable.rock,
        "PAPER" to R.drawable.paper,
    )

    fun pickRandomOption(): String = option[Random.nextInt(0, 3)]

    fun pickDrawable(option: String): Int = optionDrawable[option]!!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!
}