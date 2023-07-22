package g0001_0100.s0027_remove_element

// #Easy #Array #Two_Pointers #2023_07_03_Time_162_ms_(76.44%)_Space_34.8_MB_(70.69%)

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.size == 0) {
            return 0
        }
        val len = nums.size
        var j = len - 1
        var occurTimes = 0
        for (i in 0 until len) {
            if (nums[i] == `val`) {
                occurTimes++
                if (j == i) {
                    return len - occurTimes
                }
                while (nums[j] == `val`) {
                    j--
                    occurTimes++
                    if (j == i) {
                        return len - occurTimes
                    }
                }
                nums[i] = nums[j]
                j--
            }
            if (i == j) {
                return len - occurTimes
            }
        }
        return len - occurTimes
    }
}
