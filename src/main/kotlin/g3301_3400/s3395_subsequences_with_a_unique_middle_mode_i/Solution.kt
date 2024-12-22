package g3301_3400.s3395_subsequences_with_a_unique_middle_mode_i

// #Hard #2024_12_22_Time_485_ms_(100.00%)_Space_50.6_MB_(100.00%)

class Solution {
    fun subsequencesWithMiddleMode(a: IntArray): Int {
        val n = a.size
        // Create a dictionary to store indices of each number
        val dict: MutableMap<Int?, MutableList<Int?>?> = HashMap<Int?, MutableList<Int?>?>()
        for (i in 0..<n) {
            dict.computeIfAbsent(a[i]) { _: Int? -> java.util.ArrayList<Int?>() }!!.add(i)
        }
        var ans = 0L
        // Iterate over each unique number and its indices
        for (entry in dict.entries) {
            val b: MutableList<Int?> = entry.value!!
            val m = b.size
            for (k in 0..<m) {
                val i: Int = b[k]!!
                val r = m - 1 - k
                val u = i - k
                val v = (n - 1 - i) - r
                // Case 2: Frequency of occurrence is 2 times
                ans = (
                    ans + convert(k, 1) * convert(u, 1) % MOD * convert(
                        v,
                        2,
                    ) % MOD
                    ) % MOD
                ans = (
                    ans + convert(r, 1) * convert(u, 2) % MOD * convert(
                        v,
                        1,
                    ) % MOD
                    ) % MOD
                // Case 3: Frequency of occurrence is 3 times
                ans = (ans + convert(k, 2) * convert(v, 2) % MOD) % MOD
                ans = (ans + convert(r, 2) * convert(u, 2) % MOD) % MOD
                ans =
                    (
                        (
                            ans +
                                convert(k, 1) *
                                convert(r, 1) %
                                MOD
                                * convert(u, 1) %
                                MOD
                                * convert(v, 1) %
                                MOD
                            ) %
                            MOD
                        )
                // Case 4: Frequency of occurrence is 4 times
                ans = (
                    ans + convert(k, 2) * convert(r, 1) % MOD * convert(
                        v,
                        1,
                    ) % MOD
                    ) % MOD
                ans = (
                    ans + convert(k, 1) * convert(r, 2) % MOD * convert(
                        u,
                        1,
                    ) % MOD
                    ) % MOD

                // Case 5: Frequency of occurrence is 5 times
                ans = (ans + convert(k, 2) * convert(r, 2) % MOD) % MOD
            }
        }
        var dif: Long = 0
        // Principle of inclusion-exclusion
        for (midEntry in dict.entries) {
            val b: MutableList<Int?> = midEntry.value!!
            val m = b.size
            for (tmpEntry in dict.entries) {
                if (midEntry.key != tmpEntry.key) {
                    val c: MutableList<Int?> = tmpEntry.value!!
                    val size = c.size
                    var k = 0
                    var j = 0
                    while (k < m) {
                        val i: Int = b[k]!!
                        val r = m - 1 - k
                        val u = i - k
                        val v = (n - 1 - i) - r
                        while (j < size && c[j]!! < i) {
                            j++
                        }
                        val x = j
                        val y = size - x
                        dif =
                            (
                                (
                                    dif +
                                        convert(k, 1) *
                                        convert(x, 1) %
                                        MOD
                                        * convert(y, 1) %
                                        MOD
                                        * convert(v - y, 1) %
                                        MOD
                                    ) %
                                    MOD
                                )
                        dif =
                            (
                                (
                                    dif +
                                        convert(k, 1) *
                                        convert(y, 2) %
                                        MOD
                                        * convert(u - x, 1) %
                                        MOD
                                    ) %
                                    MOD
                                )
                        dif =
                            (
                                (
                                    dif + convert(k, 1) * convert(x, 1) % MOD * convert(
                                        y,
                                        2,
                                    ) % MOD
                                    ) %
                                    MOD
                                )

                        dif =
                            (
                                (
                                    dif +
                                        convert(r, 1) *
                                        convert(x, 1) %
                                        MOD
                                        * convert(y, 1) %
                                        MOD
                                        * convert(u - x, 1) %
                                        MOD
                                    ) %
                                    MOD
                                )
                        dif =
                            (
                                (
                                    dif +
                                        convert(r, 1) *
                                        convert(x, 2) %
                                        MOD
                                        * convert(v - y, 1) %
                                        MOD
                                    ) %
                                    MOD
                                )
                        dif =
                            (
                                (
                                    dif + convert(r, 1) * convert(x, 2) % MOD * convert(
                                        y,
                                        1,
                                    ) % MOD
                                    ) %
                                    MOD
                                )
                        k++
                    }
                }
            }
        }
        return ((ans - dif + MOD) % MOD).toInt()
    }

    private fun convert(n: Int, k: Int): Long {
        if (k > n) {
            return 0
        }
        if (k == 0 || k == n) {
            return 1
        }
        var res: Long = 1
        for (i in 0..<k) {
            res = res * (n - i) / (i + 1)
        }
        return res % MOD
    }

    companion object {
        private const val MOD = 1000000007
    }
}
