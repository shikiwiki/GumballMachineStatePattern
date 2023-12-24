package com.example.gumballmachinestatepattern

import kotlin.random.Random

class HasCoinState(private val gumballMachine: GumballMachine) : State {

    private val randomWinner = Random(System.currentTimeMillis())

    override fun insertCoin() {
        println("Sorry, you can't insert another coin!")
    }

    override fun ejectCoin() {
        println("Coin returned!")
        gumballMachine.currentState =gumballMachine.noCoinState
    }

    override fun turnCrank() {
        println("You turned...")
        val winner = randomWinner.nextInt(10)
        if (winner == 0 && gumballMachine.gumCount > 1) {
            gumballMachine.currentState = gumballMachine.winnerState
        } else {
            gumballMachine.currentState = gumballMachine.soldState
        }
    }

    override fun dispense() {
        println("Nothing dispensed.")
    }

    override fun toString(): String {
        return "has coin"
    }

    override fun refill() {
        println("Error!")
    }
}