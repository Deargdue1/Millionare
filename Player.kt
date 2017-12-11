import java.util.Scanner

class Player{
    /*
    Создание функции, которая запрашивает ответ игрока
     */
    fun answers():String{
        println("Введите свой ответ")
        val scanner = Scanner(System.`in`)
        val scanner2 = scanner.next()
        check(scanner2)
        return scanner2
    }
    /*
    Создание функции для проверки введёного значения
     */
    fun check(answer: String) {
        val chars = arrayOf('\u0061', '\u0062', '\u0063', '\u0064')
        if (answer.length < 2) {
            for (char in chars) {
                if (answer == char.toString()) {
                    break
                }else {if (char == '\u0064'&& answer != '\u0064'.toString()){//this is not the line you are looking for
                    println("Вы ввели неверный символ. Попробуйте ввести заново.")
                    answers()
                }}
            }
        } else {
            println("Вы ввели слишком много символов. Впишите одну букву.")
            answers()
        }
    }
}