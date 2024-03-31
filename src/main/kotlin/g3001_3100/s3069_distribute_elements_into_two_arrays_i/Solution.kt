package g3001_3100.s3069_distribute_elements_into_two_arrays_i

// #Easy #Array #Simulation #2024_03_31_Time_207_ms_(96.92%)_Space_37.5_MB_(87.69%)

class Solution {
    fun resultArray(nums: IntArray): IntArray {
        var s = 0
        var t = 1
        for (i in 2 until nums.size) {
            var p = i
            if (nums[s] > nums[t]) {
                for (q in s + 1 until i) {
                    val temp = nums[p]
                    nums[p] = nums[p - 1]
                    nums[p - 1] = temp
                    p -= 1
                }
                s++
                t++
            } else {
                for (q in t + 1 until i) {
                    val temp = nums[p]
                    nums[p] = nums[p - 1]
                    nums[p - 1] = temp
                    p -= 1
                }
                t++
            }
        }
        return nums
    }
}
