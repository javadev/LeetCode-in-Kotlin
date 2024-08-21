package g3201_3300.s3261_count_substrings_that_satisfy_k_constraint_ii

// #Hard #Array #String #Binary_Search #Prefix_Sum #Sliding_Window
// #2024_08_21_Time_1005_ms_(100.00%)_Space_118.6_MB_(100.00%)

class Solution {
    fun countKConstraintSubstrings(s: String, k: Int, queries: Array<IntArray>): LongArray {
        val current = s.toCharArray()
        val n = current.size
        val prefix = LongArray(n)
        val index = IntArray(n)
        var i = 0
        var count = 0
        var count1 = 0
        var count0 = 0
        for (j in 0 until n) {
            if (current[j] == '0') {
                count0++
            }
            if (current[j] == '1') {
                count1++
            }
            while (count0 > k && count1 > k) {
                if (current[i] == '0') {
                    count0--
                }
                if (current[i] == '1') {
                    count1--
                }
                i++
                index[i] = j - 1
            }
            count += j - i + 1
            index[i] = j
            prefix[j] = count.toLong()
        }
        while (i < n) {
            index[i++] = n - 1
        }
        val result = LongArray(queries.size)
        i = 0
        while (i < queries.size) {
            val indexFirst = index[queries[i][0]]
            if (indexFirst > queries[i][1]) {
                val num = queries[i][1] - queries[i][0] + 1L
                result[i] = ((num) * (num + 1)) / 2
            } else {
                result[i] = prefix[queries[i][1]] - prefix[indexFirst]
                val num = indexFirst - queries[i][0] + 1L
                result[i] += ((num) * (num + 1)) / 2
            }
            i++
        }
        return result
    }
}
