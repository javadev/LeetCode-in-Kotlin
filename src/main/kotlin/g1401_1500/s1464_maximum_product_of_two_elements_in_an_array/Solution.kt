package g1401_1500.s1464_maximum_product_of_two_elements_in_an_array

// #Easy #Array #Sorting #Heap_Priority_Queue
// #2023_06_13_Time_190_ms_(64.71%)_Space_36.4_MB_(82.35%)

class Solution {
    fun maxProduct(nums: IntArray): Int {
        var first = Int.MIN_VALUE
        var second = Int.MIN_VALUE
        for (num in nums) {
            if (num >= first) {
                second = first
                first = num
            } else if (num >= second) {
                second = num
            }
        }
        return (first - 1) * (second - 1)
    }
}
