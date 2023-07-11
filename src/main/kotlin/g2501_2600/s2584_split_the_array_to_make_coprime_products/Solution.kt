package g2501_2600.s2584_split_the_array_to_make_coprime_products

// #Hard #Array #Hash_Table #Math #Number_Theory
// #2023_07_11_Time_341_ms_(100.00%)_Space_45.6_MB_(100.00%)

import java.util.ArrayList
import java.util.HashMap

class Solution {
    private fun fillDivideArray() {
        for (i in 1 until divideTo.size) {
            divideTo[i] = i
        }
        var i = 2
        while (i * i < divideTo.size) {
            if (divideTo[i] != i) {
                i++
                continue
            }
            var j = i + i
            while (j < divideTo.size) {
                if (divideTo[j] == j) {
                    divideTo[j] = i
                }
                j += i
            }
            i++
        }
    }

    fun findValidSplit(nums: IntArray): Int {
        if (divideTo[1] == 0) {
            fillDivideArray()
        }

        val dMap: MutableMap<Int, Int> = HashMap()
        val dividers: Array<MutableList<Int>?> = arrayOfNulls(nums.size)
        for (i in nums.indices) {
            dividers[i] = ArrayList()
            while (nums[i] != 1) {
                dividers[i]?.add(divideTo[nums[i]])
                dMap.put(divideTo[nums[i]], i)
                nums[i] = nums[i] / divideTo[nums[i]]
            }
        }
        var nextEnd = 0
        var i = 0
        while (i <= nextEnd) {
            for (j in dividers[i]!!.indices) {
                nextEnd = nextEnd.coerceAtLeast(dMap[dividers[i]!![j]]!!)
            }
            i++
        }
        return if (i == nums.size) -1 else i - 1
    }

    companion object {
        var divideTo = IntArray(1e6.toInt() + 1)
    }
}
