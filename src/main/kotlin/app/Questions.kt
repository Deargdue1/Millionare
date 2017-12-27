package app

import com.beust.klaxon.JsonObject
import java.util.Random
import com.beust.klaxon.Parser

class Questions {
    val random = Random()
    private val questions: JsonObject
    private val answers: MutableMap<String, JsonObject>
    val correctAnswers: JsonObject
    var randomPos: Int

    init {
        questions = getParseJSON("/database/questions.json") as JsonObject
        answers = getParseJSON("/database/answers.json") as MutableMap<String, JsonObject>
        correctAnswers = getParseJSON("/database/currentAnswers.json") as JsonObject
        randomPos = random.nextInt(questions.size)
    }

    fun getNewQuestion() {
        println(questions[randomPos.toString()])
        println(answers[randomPos.toString()]!!["1"])
    }


    private fun getParseJSON(name: String): Any? {
        val cls = Parser::class.java
        return cls.getResourceAsStream(name)?.let { inputStream ->
            return Parser().parse(inputStream)
        }
    }
}
