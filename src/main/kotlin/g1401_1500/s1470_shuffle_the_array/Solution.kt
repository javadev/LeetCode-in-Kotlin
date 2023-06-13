package g1401_1500.s1470_shuffle_the_array

// #Easy #Array
class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val result = IntArray(nums.size)
        var i = 0
        var j = 0
        while (i < n && j < 2 * n) {
            result[j] = nums[i]
            result[++j] = nums[i + n]
            i++
            j++
        }
        return result
    }
}
