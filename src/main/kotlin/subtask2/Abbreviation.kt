package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var i = 0
        val s: StringBuilder = java.lang.StringBuilder()
            for (c in a.toUpperCase()) {
                if (i >= b.length || i>=a.length) {
                    break
                }
                if (c != b[i]) {
                    continue
                } else {
                    i++
                    s.append(c)
                }
            }
        return if (s.toString() == b) {
            "YES"
        } else {
            "NO"
        }
    }
}
