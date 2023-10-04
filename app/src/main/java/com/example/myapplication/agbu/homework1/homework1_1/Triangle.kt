package com.example.myapplication.agbu.homework1.homework1_1

import kotlin.math.roundToInt
import kotlin.math.sqrt

class Triangle(private var side1: Int, private var side2: Int, private var side3: Int ) : Shape {

    fun triangle(side1: Int, side2: Int, side3: Int) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun perimeter(): Int {
        return side1 + side2 + side3
    }

    override fun area(): Int {
        val s: Double = ((side1 + side2 + side3) / 2).toDouble()
        return sqrt((s * (s - side1) * (s - side2) * (s - side3))).toInt()
    }

}