package g1401_1500.s1464_maximum_product_of_two_elements_in_an_array

// #Easy #Array #Sorting #Heap_Priority_Queue
class Solution {
    fun maxProduct(nums: IntArray?): Int {
        if (nums == null) {
            return 0
        }
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
