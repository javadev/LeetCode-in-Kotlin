package g0701_0800.s0728_self_dividing_numbers

// #Easy #Math #2023_03_01_Time_142_ms_(100.00%)_Space_33.9_MB_(66.67%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        val list: MutableList<Int> = ArrayList()
        for (i in left..right) {
            if (isSelfDividing(i)) {
                list.add(i)
            }
        }
        return list
    }

    private fun isSelfDividing(value: Int): Boolean {
        var value = value
        val origin = value
        while (value != 0) {
            val digit = value % 10
            value /= 10
            if (digit == 0 || origin % digit != 0) {
                return false
            }
        }
        return true
    }
}
