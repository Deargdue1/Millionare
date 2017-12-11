import java.util.Random

class Questions {

    /**
     * Декларирование переменных
     */
    private val random = Random()

    private val questions = arrayOf(
            "Какого числа отмечают День солидарности трудящихся?",
            "Какого вида транспорта не существует?"
    )

    private val ansvers = arrayOf(
            "a) Седьмого ноября b) Восьмого марта c) Первого мая d) Четвертого июня",
            "a) Пешеходный b) Городской общественный c) Авиационный d) Железнодорожный"
    )

     val correctAsnswers = arrayOf("c", "a")

    /**
     * Запрос случайного индекса для вопросов и ответов
     */
     val randomPos = random.nextInt(questions.size)

    /**
     *  Создание функции для выведения вопроса и вариантов ответа на экран
     */
    fun getNewQuestion() {
        println(questions[randomPos])
        println(ansvers[randomPos])
    }
}