package g2101_2200.s2145_count_the_hidden_sequences

// #Medium #Array #Prefix_Sum #2023_06_25_Time_641_ms_(100.00%)_Space_58.6_MB_(100.00%)

class Solution {
    fun numberOfArrays(differences: IntArray, lower: Int, upper: Int): Int {
        val n = differences.size
        if (lower == upper) {
            for (j in differences) {
                if (j != 0) {
                    return 0
                }
            }
        }
        var max = (-1e9).toInt()
        var min = 1e9.toInt()
        val hidden = IntArray(n + 1)
        hidden[0] = 0
        for (i in 1..n) {
            hidden[i] = hidden[i - 1] + differences[i - 1]
        }
        for (i in 0..n) {
            if (hidden[i] > max) {
                max = hidden[i]
            }
            if (hidden[i] < min) {
                min = hidden[i]
            }
        }
        val low = lower - min
        val high = upper - max
        return if (low > high) {
            0
        } else high - low + 1
    }
}
