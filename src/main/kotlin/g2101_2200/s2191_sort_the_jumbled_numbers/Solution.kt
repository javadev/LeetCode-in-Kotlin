package g2101_2200.s2191_sort_the_jumbled_numbers

// #Medium #Array #Sorting #2023_06_26_Time_821_ms_(100.00%)_Space_52.8_MB_(100.00%)

import java.util.Collections

class Solution {
    @Suppress("NAME_SHADOWING")
    private class RealNum(mapping: IntArray, orig: Int, index: Int) {
        var index: Int
        var orig: Int
        var real = 0

        init {
            var orig = orig
            this.orig = orig
            this.index = index
            var mult = 1
            if (orig == 0) {
                real = mapping[0]
            } else {
                while (orig > 0) {
                    val mod = orig % 10
                    orig = orig / 10
                    real += mapping[mod] * mult
                    mult *= 10
                }
            }
        }
    }

    fun sortJumbled(mapping: IntArray, nums: IntArray): IntArray {
        val realNums: MutableList<RealNum> = ArrayList()
        for (i in nums.indices) {
            val num = nums[i]
            val realNum = RealNum(mapping, num, i)
            realNums.add(realNum)
        }
        Collections.sort(realNums) { a: RealNum, b: RealNum ->
            val retval = a.real - b.real
            if (retval != 0) {
                return@sort retval
            }
            a.index - b.index
        }
        val retval = IntArray(nums.size)
        for (i in nums.indices) {
            retval[i] = realNums[i].orig
        }
        return retval
    }
}
