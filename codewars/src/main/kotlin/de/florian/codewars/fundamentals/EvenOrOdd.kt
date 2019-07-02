package de.florian.codewars.fundamentals

//https://www.codewars.com/kata/53da3dbb4a5168369a0000fe
class EvenOrOdd{
    fun evenOrOdd(number: Int): String {
        return if(number and 1 == 0) "Even" else "Odd"
    }
}