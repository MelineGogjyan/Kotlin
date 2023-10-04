package com.example.myapplication.agbu.lesson2

import java.time.Year

fun main() {
    val car = Car("Ford", 2016, "Mustang")
    println(car)
}
class Car(val naem: String, val year: Int, val model: String) {
    val mark: String = "ndfvkejrn"
}

sealed class Result {
    data class Success(val date: String) : Result()
    data class Error(val message: String) : Result()
}