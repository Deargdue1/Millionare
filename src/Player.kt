import java.util.Scanner

class Player {

    /**
     * Создание функции, которая запрашивает ответ игрока
     */
    fun getCurrentAnswer(): String {
        println("Введите свой ответ")
        val scanner = Scanner(System.`in`)
        val scanner2 = scanner.next()
        check(scanner2)
        return scanner2
    }

    /**
     * Создание функции для проверки введёного значения
     */
    private fun check(answer: String) {
        val chars = arrayOf('\u0061', '\u0062', '\u0063', '\u0064')
        if (answer.length < 2) {
            for (char in chars) {
                if (answer == char.toString()) {
                    break
                } else if (char == chars.last()) {
                    println("Вы ввели неверный символ. Попробуйте ввести заново.")
                    getCurrentAnswer()
                }
            }
        } else {
            println("Вы ввели слишком много символов. Впишите одну букву.")
            getCurrentAnswer()
        }
    }
}