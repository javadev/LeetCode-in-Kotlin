package g1601_1700.s1641_count_sorted_vowel_strings

// #Medium #Dynamic_Programming #2023_06_18_Time_141_ms_(42.86%)_Space_32.8_MB_(85.71%)

class Solution {
    fun countVowelStrings(n: Int): Int {
        if (n == 1) {
            return 5
        }
        var arr = intArrayOf(1, 1, 1, 1, 1)
        var sum = 5
        for (i in 2..n) {
            val copy = IntArray(5)
            for (j in arr.indices) {
                if (j == 0) {
                    copy[j] = sum
                } else {
                    copy[j] = copy[j - 1] - arr[j - 1]
                }
            }
            arr = copy.copyOf(5)
            sum = 0
            for (k in arr) {
                sum += k
            }
        }
        return sum
    }
}
