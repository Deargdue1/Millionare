package app

import com.beust.klaxon.JsonObject
import java.util.Random
import com.beust.klaxon.Parser

class Questions {

    /**
     * Декларирование переменных
     */
    private val random = Random()

    private var questions : Any= false

    private val answers = arrayOf(
            "a) Седьмого ноября b) Восьмого марта c) Первого мая d) Четвертого июня",
            "a) Пешеходный b) Городской общественный c) Авиационный d) Железнодорожный"
    )

     val correctAnswers = arrayOf("c", "a")

    /**
     * Запрос случайного индекса для вопросов и ответов
     */
     val randomPos = 1

    /**
     *  Создание функции для выведения вопроса и вариантов ответа на экран
     */
    fun getNewQuestion() {
        questions = parse("/database/questions.json") as com.beust.klaxon.JsonObject
        val try1 = (questions as JsonObject)[randomPos.toString()]
        println(try1)
        println(answers[randomPos])
    }
    fun parse(name: String) : Any? {
        val cls = Parser::class.java
        return cls.getResourceAsStream(name)?.let { inputStream ->
            return Parser().parse(inputStream)
        }
    }

}