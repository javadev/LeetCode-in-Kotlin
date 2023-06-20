package g1901_2000.s1968_array_with_elements_not_equal_to_average_of_neighbors

import java.util.Random

// #Medium #Array #Sorting #Greedy
class Solution {
    fun rearrangeArray(nums: IntArray): IntArray {
        val random = Random()
        while (true) {
            var i: Int
            i = 1
            while (i < nums.size - 1) {
                if (2 * nums[i] == nums[i - 1] + nums[i + 1]) {
                    break
                }
                i++
            }
            if (i == nums.size - 1) {
                return nums
            }
            i = 0
            while (i < nums.size) {
                val j = i + random.nextInt(nums.size - i)
                val tmp = nums[i]
                nums[i] = nums[j]
                nums[j] = tmp
                i++
            }
        }
    }
}
