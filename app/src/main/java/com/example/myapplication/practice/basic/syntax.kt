package com.example.myapplication.practice.basic

class Types {
//fun main() {
//    println("Hello, world!!") // print
//
//}
//fun main(args: Array<String>) {
//
//    println(args.contentToString())
//}


    fun sum1(a: Int, b: Int): Int {       // type Int or anything types
        return a + b
    }                                     // function syntax


    fun sum2(a: Int, b: Int) = a + b

    // ------------------------------------

    fun printSumResult(a: Int, b: Int): Unit {         /* Unit is a Java - void. եթե վերադարձվող տիպը
                                                            Unit է կարելի է այն չնշել*/
        println("Sum of ${a} and ${b} is ${a + b}")    // $ Symbol print variables
    }

// -----------------------------------------------------
    // Variables (val and var)

    val name = "Meline" // Immutable չփոփոխվող
//    fun main() {
//    var num = 2               // Mutable փոփոխվող
//    num = 8
//}

// ------------------------------------------------------
    // Conditional expressions

    fun minOf(a: Int, b: Int): Int {
        if (a < b)
            return a
        else
            return b
    }

//    OR

    fun minOf(a: Double, b: Double) = if (a < b) a else b

// -----------------------------------------------------
    //For loop
    //fun main() {
    //    val list = listOf(1, 5, 8, 9, 6)
    //
    //    for (items in list) {
    //        println(items)
    //    }
    //}

    // OR

    //fun main() {
    //    val list = listOf("apple", "banana", "red", "black", "white")
    //    for (index in list.indices) {
    //        println("item in $index is ${list[index]}")
    //    }
    //}
// -----------------------------------------------------
    //While loop
    //fun main() {
    //    val list = listOf("apple", "banana", "red", "black", "white")
    //    var index = 0
    //    while (index < list.size) {
    //        println("item at $index is ${list[index]}")
    //        index++
    //    }
    //}
// -----------------------------------------------------
    //When expression
    fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }

// -----------------------------------------------------
    //Ranges



}



// -----------------------------------------------------
// Classes and instances

open class Shape {

}
class Triangle(var side1: Int, var side2: Int, var side3: Int): Shape() {
    //    var perimeter = side1 + side2 + side3
    fun perimeter(): Int {
        return side1 + side2 + side3
    }

//fun main() {
//    val triangle = Triangle(5, 9, 5)
//    println(triangle.perimeter())
//}
}

