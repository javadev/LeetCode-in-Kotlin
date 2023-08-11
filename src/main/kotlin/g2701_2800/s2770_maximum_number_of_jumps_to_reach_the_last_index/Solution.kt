package g2701_2800.s2770_maximum_number_of_jumps_to_reach_the_last_index

// #Medium #Array #Dynamic_Programming #2023_08_11_Time_325_ms_(51.16%)_Space_49.1_MB_(13.95%)

class Solution {
    private class Pair(var prev: Int, var len: Int)

    fun maximumJumps(nums: IntArray, target: Int): Int {
        val arr = arrayOfNulls<Pair>(nums.size)
        arr[0] = Pair(0, 0)
        for (i in 1 until nums.size) {
            arr[i] = Pair(-1, 0)
            for (j in i - 1 downTo 0) {
                if (Math.abs(nums[i] - nums[j]) <= target &&
                    arr[j]!!.prev != -1 && arr[j]!!.len + 1 > arr[i]!!.len
                ) {
                    arr[i]!!.prev = j
                    arr[i]!!.len = arr[j]!!.len + 1
                }
            }
        }
        return if (arr[nums.size - 1]!!.len > 0) arr[nums.size - 1]!!.len else -1
    }
}
