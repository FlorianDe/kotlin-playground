package de.florian.codewars.fundamentals

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class FundamentalsTest {
    @Test
    fun evenOrOdd() {
        val evenOrOdd = EvenOrOdd()
        Assertions.assertEquals(evenOrOdd.evenOrOdd(1), "Odd")
        Assertions.assertEquals(evenOrOdd.evenOrOdd(-2), "Even")
    }
}
