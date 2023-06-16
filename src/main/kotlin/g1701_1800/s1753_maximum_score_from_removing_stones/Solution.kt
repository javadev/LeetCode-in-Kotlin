package g1701_1800.s1753_maximum_score_from_removing_stones

// #Medium #Math #Greedy #Heap_Priority_Queue
class Solution {
    fun maximumScore(a: Int, b: Int, c: Int): Int {
        val nums = intArrayOf(a, b, c)
        nums.sort()
        return if (nums[0] + nums[1] < nums[2]) {
            nums[0] + nums[1]
        } else {
            (nums[0] + nums[1] + nums[2]) / 2
        }
    }
}
