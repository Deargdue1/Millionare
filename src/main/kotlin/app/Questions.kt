package app

import com.beust.klaxon.JsonObject
import java.util.Random
import com.beust.klaxon.Parser

class Questions {

    /**
     * Декларирование переменных
     */
    private val random : Random = Random()

    private val questions : JsonObject

    private val answers : Array<String> = arrayOf(
            "a) Седьмого ноября b) Восьмого марта c) Первого мая d) Четвертого июня",
            "a) Пешеходный b) Городской общественный c) Авиационный d) Железнодорожный"
    )

    val correctAnswers = arrayOf("c", "a")

    /**
     * Запрос случайного индекса для вопросов и ответов
     */
     val randomPos: Int

    init {
        questions = getParseJSON("/database/questions.json") as JsonObject
        randomPos = 4
    }

    /**
     *  Создание функции для выведения вопроса и вариантов ответа на экран
     */
    fun getNewQuestion() {
        val try1 = questions[randomPos.toString()]
        println(try1)
        println(answers[randomPos])
    }

    /**
     * get parse JSON
     */
    private fun getParseJSON(name: String) : Any? {
        val cls = Parser::class.java
        return cls.getResourceAsStream(name)?.let { inputStream ->
            return Parser().parse(inputStream)
        }
    }


}