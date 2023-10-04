package com.example.myapplication.agbu.homework1.homework1_1

import java.lang.Math.*

class Circle(private var radius : Int) : Shape {

    fun circle(radius: Int){
        this.radius = radius
    }

    override fun perimeter(): Int {
        return (2 * PI * radius).toInt()
    }

    override fun area(): Int {
        return (PI * radius * radius).toInt();
    }
}