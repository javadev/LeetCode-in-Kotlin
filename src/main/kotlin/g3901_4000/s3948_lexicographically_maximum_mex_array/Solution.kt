package g3901_4000.s3948_lexicographically_maximum_mex_array

// #Hard #Array #Hash_Table #Greedy #Queue #Senior_Staff #Weekly_Contest_504
// #2026_10_20_Time_4_ms_(100.00%)_Space_68.51_MB_(66.67%)

class Solution {
    fun maximumMEX(nums: IntArray): IntArray {
        val n = nums.size
        val suffixMex = IntArray(n)
        val seen = BooleanArray(n + 2)
        var currMex = 0
        for (i in n - 1 downTo 0) {
            if (nums[i] < n + 2) {
                seen[nums[i]] = true
            }
            while (seen[currMex]) {
                currMex++
            }
            suffixMex[i] = currMex
        }
        val result = IntArray(n)
        var resIdx = 0
        val seenAtStep = IntArray(n + 2)
        var stepCounter = 0
        var i = 0
        while (i < n) {
            val m = suffixMex[i]
            result[resIdx++] = m
            if (m == 0) {
                i++
            } else {
                stepCounter++
                var found = 0
                var j = i
                while (j < n) {
                    if (nums[j] < m && seenAtStep[nums[j]] != stepCounter) {
                        seenAtStep[nums[j]] = stepCounter
                        found++
                    }
                    if (found == m) {
                        i = j + 1
                        break
                    }
                    j++
                }
            }
        }
        val finalResult = IntArray(resIdx)
        System.arraycopy(result, 0, finalResult, 0, resIdx)
        return finalResult
    }
}
