package g2601_2700.s2698_find_the_punishment_number_of_an_integer

// #Medium #Math #Backtracking #2023_07_29_Time_133_ms_(100.00%)_Space_33.1_MB_(100.00%)

class Solution {
    fun punishmentNumber(n: Int): Int {
        fun partition(x: Int, target: Int): Boolean {
            if (x == target) return true
            if (target < 0 || x < target) return false
            return partition(x / 10, target - (x % 10)) ||
                partition(x / 100, target - (x % 100)) ||
                partition(x / 1000, target - (x % 1000))
        }
        var res = 0
        for (i in 1..n) {
            val iSq = i * i
            if (partition(iSq, i))
                res += iSq
        }
        return res
    }
}
