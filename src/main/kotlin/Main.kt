import java.util.*

fun main() {
    // Ввод массива слов от пользователя
    val scanner = Scanner(System.`in`)
    println("Введите массив слов через запятую:")
    val input = scanner.nextLine()
    val words = input.split(", ")

    // Создание мапы для группировки слов
    val wordGroups = mutableMapOf<String, MutableList<String>>()

    // Группировка слов по признаку "состоят из одинаковых букв"
    for (word in words) {
        val sortedWord = word.toCharArray().sorted().joinToString("")
        if (wordGroups.containsKey(sortedWord)) {
            wordGroups[sortedWord]?.add(word)
        } else {
            wordGroups[sortedWord] = mutableListOf(word)
        }
    }

    // Вывод групп слов
    println("Группы слов:")
    for ((_, group) in wordGroups) {
        println(group.joinToString(", "))
    }
}