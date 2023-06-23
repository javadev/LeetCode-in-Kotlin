package g2101_2200.s2148_count_elements_with_strictly_smaller_and_greater_elements

// #Easy #Array #Sorting
class Solution {
    fun countElements(nums: IntArray): Int {
        var min = nums[0]
        var max = nums[0]
        var minocr = 1
        var maxocr = 1
        for (i in 1 until nums.size) {
            if (nums[i] < min) {
                min = nums[i]
                minocr = 1
            } else if (nums[i] == min) {
                minocr++
            }
            if (nums[i] > max) {
                max = nums[i]
                maxocr = 1
            } else if (nums[i] == max) {
                maxocr++
            }
        }
        return if (min == max) 0 else nums.size - minocr - maxocr
    }
}
