package g2701_2800.s2767_partition_string_into_minimum_beautiful_substrings

// #Medium #String #Hash_Table #Dynamic_Programming #Backtracking
// #2023_08_11_Time_162_ms_(96.00%)_Space_36.2_MB_(80.00%)

class Solution {
    fun minimumBeautifulSubstrings(s: String): Int {
        val set: MutableSet<String> = HashSet()
        set.add("1")
        set.add("101")
        set.add("11001")
        set.add("1111101")
        set.add("1001110001")
        set.add("110000110101")
        set.add("11110100001001")
        val result = minimumBeautifulSubstringsHelper(s, 0, set, 0)
        return if (result == Int.MAX_VALUE) {
            -1
        } else result
    }

    private fun minimumBeautifulSubstringsHelper(s: String, index: Int, set: Set<String>, count: Int): Int {
        if (index >= s.length) {
            return count
        }
        var minResult = Int.MAX_VALUE
        for (i in index..s.length) {
            if (set.contains(s.substring(index, i))) {
                val result = minimumBeautifulSubstringsHelper(s, i, set, count + 1)
                minResult = minResult.coerceAtMost(result)
            }
        }
        return minResult
    }
}
