package com.example.gumballmachinestatepattern

class GumballMachine(var gumCount: Int = 0) {

    lateinit var soldOutState: State
    lateinit var noCoinState: State
    lateinit var hasCoinState: State
    lateinit var soldState: State
    lateinit var winnerState: State
    var currentState = if (gumCount > 0) soldState else soldOutState

    fun insertCoin() {
        currentState.insertCoin()
    }

    fun ejectCoin() {
        currentState.ejectCoin()
    }

    fun turnCrank() {
        currentState.turnCrank()
        currentState.dispense()
    }

    fun releaseGumball() {
        println("A gumball comes rolling out the slot...")
        if (gumCount != 0) gumCount--
    }

    fun refill(count: Int) {
        gumCount += count
        println("Gumball machine was refilled! There are $gumCount gumballs!")
        currentState.refill()
    }
}