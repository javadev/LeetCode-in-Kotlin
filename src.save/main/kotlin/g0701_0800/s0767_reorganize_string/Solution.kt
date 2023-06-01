package g0701_0800.s0767_reorganize_string

// #Medium #String #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Counting
// #2023_03_09_Time_148_ms_(100.00%)_Space_33.8_MB_(93.33%)

class Solution {
    fun reorganizeString(s: String): String {
        val hash = IntArray(26)
        for (element in s) {
            hash[element.code - 'a'.code]++
        }
        var max = 0
        var letter = 0
        for (i in hash.indices) {
            if (hash[i] > max) {
                max = hash[i]
                letter = i
            }
        }
        if (max > (s.length + 1) / 2) {
            return ""
        }
        val res = CharArray(s.length)
        var idx = 0
        while (hash[letter] > 0) {
            res[idx] = (letter + 'a'.code).toChar()
            idx += 2
            hash[letter]--
        }
        for (i in hash.indices) {
            while (hash[i] > 0) {
                if (idx >= res.size) {
                    idx = 1
                }
                res[idx] = (i + 'a'.code).toChar()
                idx += 2
                hash[i]--
            }
        }
        return String(res)
    }
}
