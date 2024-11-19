package g0901_1000.s0954_array_of_doubled_pairs

// #Medium #Array #Hash_Table #Sorting #Greedy
// #2023_05_02_Time_462_ms_(100.00%)_Space_92.1_MB_(50.00%)

class Solution {
    fun canReorderDoubled(arr: IntArray): Boolean {
        val max = 0.coerceAtLeast(arr.max())
        val min = 0.coerceAtMost(arr.min())
        val positive = IntArray(max + 1)
        val negative = IntArray(-min + 1)
        for (a in arr) {
            if (a < 0) {
                negative[-a]++
            } else {
                positive[a]++
            }
        }
        return if (positive[0] % 2 != 0) {
            false
        } else {
            validateFrequencies(positive, max) && validateFrequencies(negative, -min)
        }
    }

    private fun validateFrequencies(frequencies: IntArray, limit: Int): Boolean {
        for (i in 0..limit) {
            if (frequencies[i] == 0) {
                continue
            }
            if (2 * i > limit || frequencies[2 * i] < frequencies[i]) {
                return false
            }
            frequencies[2 * i] -= frequencies[i]
        }
        return true
    }
}
