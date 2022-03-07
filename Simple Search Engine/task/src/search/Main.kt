package search
import java.io.File
import java.util.*
import kotlin.system.exitProcess

val list = mutableListOf<String>()

fun main() {

    println("Enter the number of people:")
   val amount = readln().toInt()
    println("Enter all people:")
    repeat(amount){ list.add(readln())}
    println("")
    menu()

}
fun searchFoo() {
    println("Enter a name or email ")
    val str = readln()
    val tempList = mutableListOf<String>()
    println("")
    list.forEach { if (it.contains(str, true)) tempList.add(it) }
    if (tempList.size == 0) println("Not Found") else {
        println("People found:")
        println(tempList.joinToString("\n"))
    }
    menu()
}

fun menu() {
    println("""=== Menu ===
1. Find a person
2. Print all people
0. Exit""")
    when(readln()) {
        "1" -> searchFoo()
        "2" -> printAll()
        "0" -> exitProcess(0)
        else -> {
           println("Incorrect option! Try again.")
            menu()
        }
    }
}

fun printAll() {
    println("=== List of people ===")
    list.forEach { println(it) }
    println("")
    menu()
}

/*

 */