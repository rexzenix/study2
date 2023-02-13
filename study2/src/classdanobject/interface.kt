package classdanobject

import java.awt.Button

interface inputHandler{

    fun clicked()
    fun doubleClick()
    fun singleClick()
}

class phone: inputHandler{
    override fun doubleClick() {
        TODO("Not yet implemented")
    }

    override fun singleClick() {
        TODO("Not yet implemented")
    }

    override fun clicked() {
        println("Phone Clicked")
    }
}

class button: inputHandler{
    override fun singleClick() {
        println("Single Click")
    }

    override fun doubleClick() {
        println("Double Clicked")
    }

    override fun clicked() {
        println("Button Clicked")
    }
}

class text: inputHandler{
    override fun clicked() {
        TODO("Not yet implemented")
    }

    override fun doubleClick() {
        TODO("Not yet implemented")
    }

    override fun singleClick() {
        TODO("Not yet implemented")
    }

}

fun main (args: Array<String>){

    var myButton = button()
    myButton.clicked()
    myButton.doubleClick()
    myButton.singleClick()

}