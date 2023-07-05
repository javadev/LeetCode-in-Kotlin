package g2401_2500.s2441_largest_positive_integer_that_exists_with_its_negative

// #Easy #Array #Hash_Table #2023_07_05_Time_266_ms_(66.67%)_Space_40_MB_(83.33%)

class Solution {
    fun findMaxK(nums: IntArray): Int {
        val arr = IntArray(nums.size)
        var j = 0
        for (i in nums.indices) {
            if (nums[i] < 0) {
                arr[j++] = nums[i]
            }
        }
        arr.sort()
        nums.sort()
        for (i in nums.indices) {
            for (num in nums) {
                if (arr[i] * -1 == num) {
                    return num
                }
            }
        }
        return -1
    }
}
