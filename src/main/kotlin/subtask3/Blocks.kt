package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            Int::class ->
                return return blockA.filterIsInstance<Integer>().sumBy { it as Int }
            String::class ->
                return blockA.filterIsInstance<String>().joinToString("")
            LocalDate::class -> {
                val date: LocalDate = blockA.filterIsInstance<LocalDate>().maxBy { it }!!
                return date.format(DateTimeFormatter.ofPattern("dd.MM.uuuu"))
            }
            else ->
                throw IllegalStateException("Unsupported type")
        }
    }

}
