package g0301_0400.s0384_shuffle_an_array

// #Medium #Top_Interview_Questions #Array #Math #Randomized #Algorithm_II_Day_20_Others
// #2022_11_24_Time_940_ms_(72.09%)_Space_81.5_MB_(51.16%)

import kotlin.random.Random

@Suppress("kotlin:S2245")
class Solution(private val nums: IntArray) {
    // Resets the array to its original configuration and return it.
    fun reset(): IntArray {
        return nums
    }

    // Returns a random shuffling of the array.
    fun shuffle(): IntArray {
        val shuffled = nums.clone()
        for (i in nums.size - 1 downTo 1) {
            val j: Int = Random.nextInt(i + 1)
            swap(shuffled, i, j)
        }
        return shuffled
    }

    private fun swap(shuffled: IntArray, i: Int, j: Int) {
        val tmp = shuffled[i]
        shuffled[i] = shuffled[j]
        shuffled[j] = tmp
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */
