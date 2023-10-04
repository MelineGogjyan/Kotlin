package com.example.myapplication.agbu.homework1.homework1_1

import kotlin.time.times

class Rectangle(private var length : Int, private var width: Int) : Shape {

    fun rectangle(length : Int, width : Int) {
        this.length = length
        this.width = width
    }

    override fun perimeter(): Int {
        return 2 * (length + width)
    }

    override fun area(): Int {
        return length * width
    }
}