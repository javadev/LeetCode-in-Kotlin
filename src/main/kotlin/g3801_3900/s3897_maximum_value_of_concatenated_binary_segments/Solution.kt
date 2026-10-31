package g3801_3900.s3897_maximum_value_of_concatenated_binary_segments

// #Hard #Array #Sorting #Greedy #Senior_Staff #Biweekly_Contest_180
// #2026_08_13_Time_12_ms_(100.00%)_Space_104.12_MB_(56.00%)

class Solution {
    companion object {
        private const val MOD = 1e9.toInt() + 7
        private const val N = 10001
        private val POW2 = IntArray(N)

        init {
            POW2[0] = 1
            for (i in 1 until N) {
                POW2[i] = ((POW2[i - 1].toLong() * 2) % MOD).toInt()
            }
        }
    }

    fun maxValue(nums1: IntArray, nums0: IntArray): Int {
        val n = nums0.size
        val indices = ArrayList<Int>()
        var count = 0

        for (i in 0 until n) {
            if (nums0[i] == 0) {
                count += nums1[i]
            } else {
                indices.add(i)
            }
        }

        indices.sortWith(
            Comparator { i, j ->
                if (nums1[i] == nums1[j]) nums0[i] - nums0[j] else nums1[j] - nums1[i]
            },
        )

        var ans = (pow(2, count) - 1 + MOD) % MOD
        for (index in indices) {
            val count1 = nums1[index]
            val count0 = nums0[index]
            val p1 = POW2[count1].toLong()
            val p0 = POW2[count0].toLong()
            ans = (((ans * p1 + p1 - 1) % MOD) * p0) % MOD
        }
        return ans.toInt()
    }

    private fun pow(x: Long, n: Int): Long {
        var base = x
        var exp = n
        var result = 1L
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD
            }
            base = (base * base) % MOD
            exp = exp shr 1
        }
        return result
    }
}
