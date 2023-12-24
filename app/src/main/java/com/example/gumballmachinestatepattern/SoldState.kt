package com.example.gumballmachinestatepattern

class SoldState(private val gumballMachine: GumballMachine) : State {
    override fun insertCoin() {
        println("Wait, we are already giving you a gumball!")
    }

    override fun ejectCoin() {
        println("Sorry, you already turned the crank!")
    }

    override fun turnCrank() {
        println("You just turned!")
    }

    override fun dispense() {
        gumballMachine.releaseGumball()
        if (gumballMachine.gumCount > 0) {
            gumballMachine.currentState = gumballMachine.noCoinState
        } else {
            println("Oops! Out of gumballs!")
            gumballMachine.currentState = gumballMachine.soldOutState
        }
    }

    override fun toString(): String {
        return "sold"
    }

    override fun refill() {
        println("Error!")
    }
}