package g2201_2300.s2289_steps_to_make_array_non_decreasing

// #Medium #Array #Stack #Linked_List #Monotonic_Stack
// #2023_06_28_Time_509_ms_(50.00%)_Space_54.3_MB_(100.00%)

class Solution {
    fun totalSteps(nums: IntArray): Int {
        var max = 0
        val pos = IntArray(nums.size + 1)
        val steps = IntArray(nums.size + 1)
        var top = -1
        for (i in 0..nums.size) {
            val `val` = if (i == nums.size) Int.MAX_VALUE else nums[i]
            while (top >= 0 && nums[pos[top]] <= `val`) {
                if (top == 0) {
                    max = Math.max(max, steps[pos[top--]])
                } else {
                    steps[pos[--top]] = Math.max(steps[pos[top]] + 1, steps[pos[top + 1]])
                }
            }
            pos[++top] = i
        }
        return max
    }
}
