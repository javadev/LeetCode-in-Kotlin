package g0201_0300.s0229_majority_element_ii

// #Medium #Array #Hash_Table #Sorting #Counting
// #2022_10_26_Time_408_ms_(71.21%)_Space_47.7_MB_(60.61%)

class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        val results: MutableList<Int> = ArrayList()
        val len = nums.size
        var first = 0
        var second = 1
        var count1 = 0
        var count2 = 0
        for (temp in nums) {
            if (temp == first) {
                count1++
            } else if (temp == second) {
                count2++
            } else if (count1 == 0) {
                first = temp
                count1++
            } else if (count2 == 0) {
                second = temp
                count2++
            } else {
                count1--
                count2--
            }
        }
        count1 = 0
        count2 = 0
        for (temp in nums) {
            if (temp == first) {
                count1++
            }
            if (temp == second) {
                count2++
            }
        }
        if (count1 > len / 3) {
            results.add(first)
        }
        if (count2 > len / 3) {
            results.add(second)
        }
        return results
    }
}
