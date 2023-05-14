package g1001_1100.s1002_find_common_characters

// #Easy #Array #String #Hash_Table #2023_05_14_Time_181_ms_(100.00%)_Space_40.6_MB_(37.50%)

class Solution {
    fun commonChars(words: Array<String>?): List<String> {
        if (words == null) {
            throw RuntimeException("words null")
        }
        if (words.isEmpty()) {
            return ArrayList()
        }
        var tmp = words[0]
        for (i in 1 until words.size) {
            tmp = getCommon(tmp, words[i])
        }
        val result: MutableList<String> = ArrayList()
        for (element in tmp) {
            result.add(element.toString())
        }
        return result
    }

    private fun getCommon(s1: String, s2: String): String {
        if (s1.isEmpty() || s2.isEmpty()) {
            return ""
        }
        val c1c = countChars(s1)
        val c2c = countChars(s2)
        val sb = StringBuilder()
        for (i in c1c.indices) {
            var m = c1c[i].coerceAtMost(c2c[i])
            while (m > 0) {
                sb.append(('a'.toInt() + i).toChar())
                m--
            }
        }
        return sb.toString()
    }

    private fun countChars(str: String): IntArray {
        val result = IntArray(26)
        for (element in str) {
            result[element.toInt() - 'a'.toInt()]++
        }
        return result
    }
}
