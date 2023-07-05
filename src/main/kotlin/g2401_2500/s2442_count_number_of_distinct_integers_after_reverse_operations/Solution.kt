package g2401_2500.s2442_count_number_of_distinct_integers_after_reverse_operations

// #Medium #Array #Hash_Table #Math #2023_07_05_Time_652_ms_(83.33%)_Space_53_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countDistinctIntegers(nums: IntArray): Int {
        val set = HashSet<Int>()
        for (i in nums) {
            set.add(i)
            set.add(reverseInt(i))
        }
        return set.size
    }

    private fun reverseInt(num: Int): Int {
        var num = num
        var ret = 0
        while (num != 0) {
            ret = num % 10 + ret * 10
            num /= 10
        }
        return ret
    }
}
