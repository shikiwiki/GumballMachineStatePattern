package com.example.gumballmachinestatepattern

fun main() {
    val gumballMachine = GumballMachine(5)

    println(gumballMachine)

    gumballMachine.insertCoin()
    gumballMachine.turnCrank()

    println(gumballMachine)

    gumballMachine.insertCoin()
    gumballMachine.turnCrank()
    gumballMachine.insertCoin()
    gumballMachine.turnCrank()

    println(gumballMachine)
}