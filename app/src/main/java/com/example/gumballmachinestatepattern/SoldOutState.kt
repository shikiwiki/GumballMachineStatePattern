package com.example.gumballmachinestatepattern

class SoldOutState(private val gumballMachine: GumballMachine) : State {
    override fun insertCoin() {
        println("Sorry, no gums left!")
    }

    override fun ejectCoin() {
        println("You haven't inserted any!")
    }

    override fun turnCrank() {
        println("Sorry, nothing left!")
    }

    override fun dispense() {
        println("Nothing dispensed.")
    }

    override fun toString(): String {
        return "sold out"
    }

    override fun refill() {
        gumballMachine.currentState = gumballMachine.noCoinState
    }
}