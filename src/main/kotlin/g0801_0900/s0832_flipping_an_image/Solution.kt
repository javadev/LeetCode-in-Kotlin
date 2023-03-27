package g0801_0900.s0832_flipping_an_image

// #Easy #Array #Matrix #Two_Pointers #Simulation
// #2023_03_27_Time_190_ms_(94.44%)_Space_36.3_MB_(66.67%)

class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        val m = image.size
        val n = image[0].size
        val result = Array(m) { IntArray(n) }
        for (i in 0 until m) {
            val flipped = reverse(image[i])
            result[i] = invert(flipped)
        }
        return result
    }

    private fun invert(flipped: IntArray): IntArray {
        val result = IntArray(flipped.size)
        for (i in flipped.indices) {
            if (flipped[i] == 0) {
                result[i] = 1
            } else {
                result[i] = 0
            }
        }
        return result
    }

    private fun reverse(nums: IntArray): IntArray {
        var i = 0
        var j = nums.size - 1
        while (i < j) {
            val tmp = nums[i]
            nums[i] = nums[j]
            nums[j] = tmp
            i++
            j--
        }
        return nums
    }
}
