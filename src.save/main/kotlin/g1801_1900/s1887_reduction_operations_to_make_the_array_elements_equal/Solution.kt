package g1801_1900.s1887_reduction_operations_to_make_the_array_elements_equal

// #Medium #Array #Sorting #2023_06_22_Time_457_ms_(100.00%)_Space_49_MB_(100.00%)

class Solution {
    fun reductionOperations(nums: IntArray): Int {
        val arr = IntArray(100001)
        for (i in nums) {
            arr[i]++
        }
        var `val` = 0
        var curr = 0
        for (i in 100000 downTo 0) {
            if (arr[i] != 0) {
                `val` += curr
                curr += arr[i]
            }
        }
        return `val`
    }
}
