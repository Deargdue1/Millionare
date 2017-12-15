package app

import com.beust.klaxon.JsonObject


fun main(args: Array<String>) {
    val obj: JsonObject = JsonParser().parse("/database/answers.json") as JsonObject
    println("Name : $obj")
    println("Добро пожаловать в игру \"Кто хочет стать Миллионером!?\"")
    println("Ответьте правильно на все вопросы и получите милион тугриков!")
    Gamemode().start()
}
