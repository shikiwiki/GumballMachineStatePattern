package com.example.gumballmachinestatepattern

class WinnerState(private val gumballMachine: GumballMachine) : State {
    override fun insertCoin() {
        println("Error!")
    }

    override fun ejectCoin() {
        println("Error!")
    }

    override fun turnCrank() {
        println("Error!")
    }

    override fun dispense() {
        gumballMachine.releaseGumball()
        if (gumballMachine.gumCount == 0) {
            gumballMachine.currentState = gumballMachine.soldOutState
        } else {
            gumballMachine.releaseGumball()
            println("You are a WINNER! You get 2 gumballs per one coin!")
            if (gumballMachine.gumCount > 0) {
                gumballMachine.currentState = gumballMachine.noCoinState
            } else {
                println("Oops! Out of gumballs!")
                gumballMachine.currentState = gumballMachine.soldOutState
            }

        }
    }

    override fun toString(): String {
        return "winner"
    }

    override fun refill() {
        println("Error!")
    }
}