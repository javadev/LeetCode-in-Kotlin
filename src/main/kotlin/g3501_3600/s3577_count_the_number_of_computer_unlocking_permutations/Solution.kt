package g3501_3600.s3577_count_the_number_of_computer_unlocking_permutations

// #Medium #Array #Math #Combinatorics #Brainteaser
// #2025_06_10_Time_2_ms_(100.00%)_Space_70.49_MB_(30.00%)

class Solution {
    fun countPermutations(complexity: IntArray): Int {
        val n = complexity.size
        for (i in 1..<n) {
            if (complexity[i] <= complexity[0]) {
                return 0
            }
        }
        var ans: Long = 1
        for (x in 2..<n) {
            ans = (ans * x) % MOD
        }
        return ans.toInt()
    }

    companion object {
        private const val MOD = 1000000007
    }
}
