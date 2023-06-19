package g1901_2000.s1929_concatenation_of_array

// #Easy #Array
class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val result = IntArray(nums.size * 2)
        System.arraycopy(nums, 0, result, 0, nums.size)
        var i = nums.size
        var j = 0
        while (i < result.size && j < nums.size) {
            result[i] = nums[j]
            i++
            j++
        }
        return result
    }
}
