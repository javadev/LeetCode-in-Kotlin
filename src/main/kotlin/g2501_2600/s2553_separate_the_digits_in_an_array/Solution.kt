package g2501_2600.s2553_separate_the_digits_in_an_array

// #Easy #Array #Simulation #2023_07_06_Time_210_ms_(100.00%)_Space_37.5_MB_(100.00%)

class Solution {
    fun separateDigits(nums: IntArray): IntArray {
        val arr = ArrayList<Int>()
        for (i in nums.indices.reversed()) {
            while (nums[i] > 0) {
                val r = nums[i] % 10
                arr.add(r)
                nums[i] = nums[i] / 10
            }
        }
        val num = IntArray(arr.size)
        var i = arr.size - 1
        for (I in arr) {
            num[i--] = I
        }
        return num
    }
}
