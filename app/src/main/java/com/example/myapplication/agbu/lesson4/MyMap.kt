package com.example.myapplication.agbu.lesson4

fun <K, V> myMapOf(vararg pair: Pair <K, V>): Map<K, V> {
    val newMap = mutableMapOf<K, V>()
    pair.forEach {
        newMap.put(it.first, it.second)
    }
    return newMap
}
fun main() {
    val map = myMapOf("" to 2)
}