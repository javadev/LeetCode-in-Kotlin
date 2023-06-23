package g2101_2200.s2145_count_the_hidden_sequences

// #Medium #Array #Prefix_Sum
class Solution {
    fun numberOfArrays(diff: IntArray, lower: Int, upper: Int): Int {
        val n = diff.size
        if (lower == upper) {
            for (j in diff) {
                if (j != 0) {
                    return 0
                }
            }
        }
        var max = -1e9.toInt()
        var min = 1e9.toInt()
        val hidden = IntArray(n + 1)
        hidden[0] = 0
        for (i in 1..n) {
            hidden[i] = hidden[i - 1] + diff[i - 1]
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
