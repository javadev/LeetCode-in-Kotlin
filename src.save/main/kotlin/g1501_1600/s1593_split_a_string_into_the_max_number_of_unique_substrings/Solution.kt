package g1501_1600.s1593_split_a_string_into_the_max_number_of_unique_substrings

// #Medium #String #Hash_Table #Backtracking
// #2023_06_14_Time_161_ms_(100.00%)_Space_34.8_MB_(100.00%)

class Solution {
    fun maxUniqueSplit(s: String): Int {
        var lo = 1
        var hi = s.length
        // binary search
        while (lo < hi) {
            val mid = lo + hi + 1 shr 1
            if (ok(0, mid, 0, s, HashSet())) {
                lo = mid
            } else {
                hi = mid - 1
            }
        }
        return lo
    }

    private fun ok(depth: Int, end: Int, curLen: Int, s: String, seen: MutableSet<String>): Boolean {
        if (depth == end) {
            return true
        }
        for (j in curLen until s.length) {
            // not enough length remains to reach the end.
            if (s.length - j < end - depth) {
                break
            }
            val cur = s.substring(curLen, j + 1)
            if (seen.add(cur)) {
                if (ok(depth + 1, end, j + 1, s, seen)) {
                    return true
                }
                seen.remove(cur)
            }
        }
        return false
    }
}
