package com.example.myapplication.agbu.lesson4

inline fun <reified T> List<*>.createNewList(): List<T> {
   val newArray = mutableListOf<T>()
    for (i in this){
        if (i is T){
          newArray.add(i)
        }
    }
    return newArray.toList()
}
fun main() {

val list: List<Any> = listOf(2, 4, 5, true)
val list2 = list.createNewList<Boolean>()
    println(list2)
}