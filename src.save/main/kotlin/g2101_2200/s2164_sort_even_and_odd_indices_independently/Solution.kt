package g2101_2200.s2164_sort_even_and_odd_indices_independently

// #Easy #Array #Sorting #2023_06_26_Time_200_ms_(100.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun sortEvenOdd(nums: IntArray): IntArray {
        val odd = IntArray(nums.size / 2)
        val even = IntArray((nums.size + 1) / 2)
        var o = 0
        var e = 0
        for (i in nums.indices) {
            if (i % 2 == 0) {
                even[e] = nums[i]
                ++e
            } else {
                odd[o] = nums[i]
                ++o
            }
        }
        odd.sort()
        even.sort()
        e = 0
        o = odd.size - 1
        for (i in nums.indices) {
            if (i % 2 == 0) {
                nums[i] = even[e]
                ++e
            } else {
                nums[i] = odd[o]
                --o
            }
        }
        return nums
    }
}
