package g1801_1900.s1805_number_of_different_integers_in_a_string

// #Easy #String #Hash_Table #2023_06_19_Time_162_ms_(100.00%)_Space_33.8_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun numDifferentIntegers(word: String): Int {
        val ints: MutableSet<String> = HashSet()
        val chars = word.toCharArray()
        var start = -1
        var stop = 0
        for (i in chars.indices) {
            if (chars[i] in '0'..'9') {
                if (start == -1) {
                    start = i
                }
                stop = i
            } else if (start != -1) {
                ints.add(extractInt(chars, start, stop))
                start = -1
            }
        }
        if (start != -1) {
            ints.add(extractInt(chars, start, stop))
        }
        return ints.size
    }

    private fun extractInt(chrs: CharArray, start: Int, stop: Int): String {
        var start = start
        val stb = StringBuilder()
        while (start <= stop && chrs[start] == '0') {
            start++
        }
        if (start >= stop) {
            stb.append(chrs[stop])
        } else {
            while (start <= stop) {
                stb.append(chrs[start++])
            }
        }
        return stb.toString()
    }
}
