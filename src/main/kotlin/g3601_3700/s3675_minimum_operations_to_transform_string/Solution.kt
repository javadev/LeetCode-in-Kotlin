package g3601_3700.s3675_minimum_operations_to_transform_string

// #Medium #Weekly_Contest_466 #2025_09_07_Time_84_ms_(100.00%)_Space_56.99_MB_(100.00%)

class Solution {
    fun minOperations(s: String): Int {
        val set: MutableSet<Char> = HashSet<Char>()
        for (ch in s.toCharArray()) {
            set.add(ch)
        }
        if (set.size == 1 && set.contains('a')) {
            return 0
        }
        var minCh = 'z'
        for (ch in s.toCharArray()) {
            if (ch != 'a' && ch < minCh) {
                minCh = ch
            }
        }
        return ('z'.code - minCh.code) + 1
    }
}
