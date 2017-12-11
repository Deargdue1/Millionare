class Gamemode{
    /*
    Переменная для ведения подсчёта количества вопросов
    */
    var questionnumber = 1
    /*
    Запуск основного режима игры
     */
    fun start(){
        val question = Questions()
        val answer = Player()
        if (questionnumber <= 2){
            question.request()
            if (answer.answers() == (question.correctsnswer[question.i])) {
                println("И это... правильный ответ!")
                if (questionnumber<2){println("Следующий вопрос!")}
                questionnumber++
                start()
            }else{
                println("Ответ неверный. Вы проиграли!")
            }
        }else {
            println("Поздравляю! Вы стали милионером!")
        }
    }
}