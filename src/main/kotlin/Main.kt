fun main() {
    println("Введите количество секунд")
    val secondsFromUser = readLine()!!.toInt()
    println(agoToText(secondsFromUser))

}

fun agoToText(seconds: Int): String {
    return when (seconds) {
        in 0..60 -> "только что"
        in 61..3600 -> minutesInString(seconds)
        in 3601..86400 -> hoursInStrig(seconds)
        in 86401..172800 -> "сегодня"
        in 172801..259200 -> "вчера"
        else -> "давно"
    }
}


fun minutesInString(seconds: Int): String {
    val minutes: Int = seconds / 60
    val result: String
    if ((minutes % 10 == 1) && (minutes != 11)) result = "минуту"
    else if ((minutes % 10 == 2) && (minutes != 12)) result = "минуты"
    else if ((minutes % 10 == 3) && (minutes != 13)) result = "минуты"
    else if ((minutes % 10 == 4) && (minutes != 14)) result = "минуты"
    else result = "минут"
    return "$minutes $result назад"
}


fun hoursInStrig(seconds: Int): String {
    val hours: Int = seconds / 3600
    val result: String = when (hours) {
        1, 21 -> "час"
        in 5..20 -> "часов"
        else -> "часа"
    }
    return "$hours $result назад"
}