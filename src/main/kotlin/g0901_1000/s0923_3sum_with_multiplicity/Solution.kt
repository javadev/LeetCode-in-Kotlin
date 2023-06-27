package g0901_1000.s0923_3sum_with_multiplicity

// #Medium #Array #Hash_Table #Sorting #Two_Pointers #Counting
// #2023_04_17_Time_190_ms_(100.00%)_Space_36.4_MB_(100.00%)

class Solution {
    fun threeSumMulti(arr: IntArray, target: Int): Int {
        var answer = 0
        val countRight = IntArray(MAX + 1)
        for (num in arr) {
            ++countRight[num]
        }
        val countLeft = IntArray(MAX + 1)
        for (j in 0 until arr.size - 1) {
            --countRight[arr[j]]
            val remains = target - arr[j]
            if (remains <= 2 * MAX) {
                for (v in 0..remains.coerceAtMost(MAX)) {
                    if (remains - v <= MAX) {
                        val count = countRight[v] * countLeft[remains - v]
                        if (count > 0) {
                            answer = (answer + count) % MOD
                        }
                    }
                }
            }
            ++countLeft[arr[j]]
        }
        return answer
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
        private const val MAX = 100
    }
}
