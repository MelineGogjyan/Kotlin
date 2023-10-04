package com.example.myapplication.agbu.lesson3

fun main() {
    var array = arrayOf(1, 5, 6, 8, 4)

}
inline fun <reified T> myArray (vararg element: T): Array<T>  {
    if (element.isEmpty()) return emptyArray()
    val array = Array<T>(element.size) {
        element[0]
    }
    for (i in element.indices) {
        array[i] = element[i]
    }

    return array
}



