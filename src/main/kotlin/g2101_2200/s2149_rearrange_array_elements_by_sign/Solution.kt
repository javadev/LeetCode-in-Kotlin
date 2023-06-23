package g2101_2200.s2149_rearrange_array_elements_by_sign

// #Medium #Array #Two_Pointers #Simulation
class Solution {
    fun rearrangeArray(nums: IntArray): IntArray {
        val negatives = IntArray(nums.size / 2)
        val positives = IntArray(nums.size / 2)
        val result = IntArray(nums.size)
        var pPtr = 0
        var nPtr = 0
        var rPtr = 0
        for (num in nums) {
            if (num > 0) {
                positives[pPtr++] = num
            } else {
                negatives[nPtr++] = num
            }
        }
        pPtr = 0
        nPtr = 0
        while (pPtr < positives.size && nPtr < negatives.size) {
            result[rPtr++] = positives[pPtr++]
            result[rPtr++] = negatives[nPtr++]
        }
        return result
    }
}
