package com.example.gumballmachinestatepattern

class NoCoinState(private val gumballMachine: GumballMachine) : State {
    override fun insertCoin() {
        println("You inserted a coin...")
        gumballMachine.currentState = gumballMachine.hasCoinState
    }

    override fun ejectCoin() {
        println("You haven't inserted any!")
    }

    override fun turnCrank() {
        println("Sorry, pay first!")
    }

    override fun dispense() {
        println("Nothing dispensed.")
    }

    override fun toString(): String {
        return "no coin"
    }

    override fun refill() {
        println("Error!")
    }
}