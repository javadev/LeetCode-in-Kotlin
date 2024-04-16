package g3001_3100.s3081_replace_question_marks_in_string_to_minimize_its_value

// #Medium #String #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Counting
// #2024_04_16_Time_249_ms_(100.00%)_Space_40.6_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minimizeStringValue(s: String): String {
        val n = s.length
        var time = 0
        val count = IntArray(26)
        val res = IntArray(26)
        val str = s.toCharArray()
        for (c in str) {
            if (c != '?') {
                count[c.code - 'a'.code]++
            } else {
                time++
            }
        }
        var minTime = Int.MAX_VALUE
        for (i in 0..25) {
            minTime = min(minTime, count[i])
        }
        while (time > 0) {
            for (j in 0..25) {
                if (count[j] == minTime) {
                    res[j]++
                    count[j]++
                    time--
                }
                if (time == 0) {
                    break
                }
            }
            minTime++
        }
        var start = 0
        for (i in 0 until n) {
            if (str[i] == '?') {
                while (res[start] == 0) {
                    start++
                }
                str[i] = ('a'.code + start).toChar()
                res[start]--
            }
        }
        return String(str)
    }
}
