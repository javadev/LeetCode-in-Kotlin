package g0601_0700.s0670_maximum_swap

// #Medium #Math #Greedy #2023_02_15_Time_143_ms_(100.00%)_Space_32.9_MB_(75.00%)

class Solution {
    fun maximumSwap(num: Int): Int {
        val chars = num.toString().toCharArray()
        for (i in chars.indices) {
            var j = chars.size - 1
            var indx = i
            var c = chars[i]
            while (j > i) {
                if (chars[j] > c) {
                    c = chars[j]
                    indx = j
                }
                j--
            }
            if (indx != i) {
                val temp = chars[i]
                chars[i] = chars[indx]
                chars[indx] = temp
                return String(chars).toInt()
            }
        }
        return num
    }
}
