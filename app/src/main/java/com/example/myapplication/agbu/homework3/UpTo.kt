package com.example.myapplication.agbu.homework3

infix fun Char.upTo(number: Char) {
    for (i in this .. number) {
        println(i)
    }
}
infix fun Byte.upTo(number: Byte) {
    for (i in this.toInt() .. number.toInt()) {
        println(i)
    }
}
infix fun Short.upTo(number: Byte) {
    for (i in this .. number.toInt()) {
        println(i)
    }
}
infix fun Int.upTo(number: Int) {
    for (i in this .. number) {
        println(i)
    }
}
infix fun Long.upTo(number: Int) {
    for (i in this .. number.toLong()) {
        println(i)
    }
}

fun main() {
    println(4 upTo 6)
    println()

}