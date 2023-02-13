package io_kotlin

import java.io.FileReader
import java.io.FileWriter

fun main (args: Array<String>){
    menu()
}

fun menu() {
    println("Enter:")
    println("1 - Write")
    println("2 - Read")
    println("3 - Exit \n")

    var choice = readln().toInt()
    var message: String?

    when(choice){
        1 -> {
            println("Enter Message: ")
            message = readln().toString()
            writeToFile(message)
        }
        2 -> {
            println("Reading...")
            readfromFile()
        }
        3 -> println("Exiting...")
    }
}

fun writetofile(message: String){
    try {
        var writer = FileWriter("SCUS_942.54.txt", true)
        writer.write(message + "\n")
        writer.close()
    }catch (ex: Exception){
        println("Exception $ex")
    }
}

fun readfromFile(){
    var reader = FileReader("SCUS_942.54.txt")
    var char: Int?

    try {
        do {
            char = reader.read()
            print(char.toChar())
        }while (char != -1)
    }catch (ex: Exception){
        print(ex.message)
    }
}