package subtask1
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.format.ResolverStyle
import java.time.format.TextStyle
import java.util.*


class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        val firstFormatter = DateTimeFormatter.ofPattern("dd M uuuu")
            .withResolverStyle(ResolverStyle.STRICT)
        var localDate : LocalDate?
        try {
            localDate = LocalDate.parse("$day $month $year", firstFormatter)
        } catch (ex: DateTimeParseException) {
            return "Такого дня не существует"
        }
        val dayOfWeekName = localDate.dayOfWeek.getDisplayName(TextStyle.FULL, Locale("ru"))
        val monthName = localDate.month.getDisplayName(TextStyle.FULL, Locale("ru"))
        return "$day $monthName, $dayOfWeekName"
    }
}
