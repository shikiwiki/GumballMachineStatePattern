package com.example.gumballmachinestatepattern

interface State {

    fun insertCoin()

    fun ejectCoin()

    fun turnCrank()

    fun dispense()

    fun refill()
}