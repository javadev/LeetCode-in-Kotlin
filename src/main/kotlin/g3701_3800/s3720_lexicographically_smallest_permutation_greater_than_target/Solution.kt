package g3701_3800.s3720_lexicographically_smallest_permutation_greater_than_target

// #Medium #Weekly_Contest_472 #2025_10_21_Time_2_ms_(96.02%)_Space_43.66_MB_(74.82%)

class Solution {
    fun lexGreaterPermutation(s: String, target: String): String {
        val freq = IntArray(26)
        for (c in s.toCharArray()) {
            freq[c.code - 'a'.code]++
        }
        val sb = StringBuilder()
        if (dfs(0, freq, sb, target, false)) {
            return sb.toString()
        }
        return ""
    }

    private fun dfs(i: Int, freq: IntArray, sb: StringBuilder, target: String, check: Boolean): Boolean {
        if (i == target.length) {
            return check
        }
        for (j in 0..25) {
            if (freq[j] == 0) {
                continue
            }
            val can = ('a'.code + j).toChar()
            if (!check && can < target[i]) {
                continue
            }
            freq[j]--
            sb.append(can)
            val next = check || can > target[i]
            if (dfs(i + 1, freq, sb, target, next)) {
                return true
            }
            sb.deleteCharAt(sb.length - 1)
            freq[j]++
        }
        return false
    }
}
