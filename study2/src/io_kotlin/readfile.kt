package io_kotlin

import java.io.FileReader
import java.io.FileWriter

fun main (){
    println("Enter a Messages")
    val message = readln().toString()

    if (message == ""){
        println("Please enter a Message")
    }else {
        writeToFile(message)
    }
    readFile()
}

fun readFile(){
    val reader = FileReader("SCUS_942.54.txt")
    var char: Int?

    try{
        do{
            char = reader.read()
            print(char.toChar())
        }while (char != -1)
    }catch (ex: Exception){
        print(ex.message)
    }
}

/**
* membuat fungsi menulis to file dengan FileWriter
*/
fun writeToFile(message: String){
    try {
        val writer = FileWriter("SCUS_942.54.txt", true)
        writer.write(message + "\n")
        writer.close()

    }catch (ex: Exception){
        println("Exception $ex")
    }
}

