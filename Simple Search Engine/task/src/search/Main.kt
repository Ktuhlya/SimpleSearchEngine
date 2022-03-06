

package search

import java.util.*
import kotlin.system.exitProcess

val list = mutableListOf<String>()

fun main() {
    println("Enter the number of people:")
   val amount = readln().toInt()
    println("Enter all people:")
    repeat(amount){ list.add(readln())}
 //   println(list)
    println("")
    println("Enter the number of search queries:")
    val count = readln().toInt()
    println("")
    for (i in 1 .. count){
        println("Enter data to search people:")
        containsFoo(readln().lowercase(Locale.getDefault()))
        println("")
    }
}
fun containsFoo (str: String){
    list.forEach {
        if (it.contains(str, true)) {
            searchFoo(str)
            return
        }
        else{
            println("No matching people found.")
            return
        }
    }
}
fun searchFoo(str: String) {
    println("")
    println("People found:")
  list.forEach { if (it.contains(str,true)) println(it) }
    println("")
}

/*
/////////////
 list.forEach { it.toLowerCase().split(" ").toList().forEach { itOfit: String ->
       if (itOfit.contains(str)) println(it)
   } }
 */