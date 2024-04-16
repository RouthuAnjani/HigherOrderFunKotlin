package com.example.higherorderfunkotlin


fun main(args:Array<String>){
    val program=MainActivity()

    val myLambda:(Int,Int)->Int={x:Int,y:Int->x+y}
    program.addTwoNumbers(2,4,myLambda)
}

class MainActivity{
    fun addTwoNumbers(a:Int,b:Int,action: (Int,Int)->Int){
        val result=action(a,b)
        println(result)
    }
}