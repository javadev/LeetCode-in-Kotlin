package g3101_3200.s3113_find_the_number_of_subarrays_where_boundary_elements_are_maximum

// #Hard #Array #Binary_Search #Stack #Monotonic_Stack
// #2024_04_27_Time_606_ms_(88.89%)_Space_63.3_MB_(83.33%)

class Solution {
    fun numberOfSubarrays(nums: IntArray): Long {
        val stack = ArrayDeque<IntArray>()
        var res: Long = 0
        for (a in nums) {
            while (stack.isNotEmpty() && stack.last()[0] < a) {
                stack.removeLast()
            }
            if (stack.isEmpty() || stack.last()[0] != a) {
                stack.addLast(intArrayOf(a, 0))
            }
            res += ++stack.last()[1]
        }
        return res
    }
}
