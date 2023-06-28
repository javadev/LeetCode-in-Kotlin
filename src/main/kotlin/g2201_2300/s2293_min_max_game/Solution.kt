package g2201_2300.s2293_min_max_game

// #Easy #Array #Simulation
class Solution {
    fun minMaxGame(nums: IntArray): Int {
        val n = nums.size
        if (n == 1) {
            return nums[0]
        }
        val newNums = IntArray(n / 2)
        for (i in 0 until n / 2) {
            if (i % 2 == 0) {
                newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1])
            } else {
                newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1])
            }
        }
        return minMaxGame(newNums)
    }
}
