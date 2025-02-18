package g3401_3500.s3458_select_k_disjoint_special_substrings

// #Medium #String #Hash_Table #Dynamic_Programming #Sorting #Greedy
// #2025_02_18_Time_28_ms_(33.33%)_Space_39.48_MB_(66.67%)

class Solution {
    fun maxSubstringLength(s: String, k: Int): Boolean {
        if (k == 0) {
            return true
        }
        val n = s.length
        val left = IntArray(26) { n }
        val right = IntArray(26) { -1 }
        for (i in 0 until n) {
            val c = s[i] - 'a'
            left[c] = minOf(left[c], i)
            right[c] = maxOf(right[c], i)
        }
        val intervals: MutableList<IntArray> = ArrayList()
        for (i in 0 until n) {
            if (i != left[s[i] - 'a']) {
                continue
            }
            var end = right[s[i] - 'a']
            var j = i
            var valid = true
            while (j <= end) {
                if (left[s[j] - 'a'] < i) {
                    valid = false
                    break
                }
                end =
                    maxOf(end, right[s[j] - 'a'])
                j++
            }
            if (valid && !(i == 0 && end == n - 1)) {
                intervals.add(intArrayOf(i, end))
            }
        }
        intervals.sortBy { it[1] }
        var count = 0
        var prev = -1
        for (inter in intervals) {
            if (inter[0] > prev) {
                count++
                prev = inter[1]
            }
        }
        return count >= k
    }
}
