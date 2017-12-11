class GameMode {

    /**
     * Переменная для ведения подсчёта количества вопросов
     */
    private var questionNumber = 1

    /**
     * Запуск основного режима игры
     */
    fun start() {
        val question = Questions()
        val answer = Player()
        if (questionNumber <= 2) {
            question.getNewQuestion()
            if (answer.getCurrentAnswer() == (question.correctAsnswers[question.randomPos])) {
                println("И это... правильный ответ!")
                if (questionNumber < 2) {
                    println("Следующий вопрос!")
                }
                questionNumber++
                start()
            } else {
                println("Ответ неверный. Вы проиграли!")
            }
        } else {
            println("Поздравляю! Вы стали милионером!")
        }
    }
}