package g2701_2800.s2729_check_if_the_number_is_fascinating

// #Easy #Hash_Table #Math #2023_08_03_Time_131_ms_(100.00%)_Space_33.9_MB_(69.23%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun isFascinating(n: Int): Boolean {
        val set = HashSet<Int>()
        fun add(_cur: Int): Boolean {
            var cur = _cur
            while (cur > 0) {
                val n = cur % 10
                if (n == 0 || set.contains(n))
                    return false
                set.add(n)
                cur /= 10
            }
            return true
        }

        if (!add(n) || !add(2 * n) || !add(3 * n))
            return false
        return true
    }
}
