package g2101_2200.s2170_minimum_operations_to_make_the_array_alternating

// #Medium #Array #Hash_Table #Greedy #Counting
// #2023_06_26_Time_531_ms_(100.00%)_Space_53.9_MB_(100.00%)

class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var maxOdd = 0
        var maxEven = 0
        var max = 0
        val n = nums.size
        for (num in nums) {
            max = Math.max(max, num)
        }
        val even = IntArray(max + 1)
        val odd = IntArray(max + 1)
        for (i in 0 until n) {
            if (i % 2 == 0) {
                even[nums[i]]++
            } else {
                odd[nums[i]]++
            }
        }
        var t1 = 0
        var t2 = 0
        for (i in 0 until max + 1) {
            if (even[i] > maxEven) {
                maxEven = even[i]
                t1 = i
            }
            if (odd[i] > maxOdd) {
                maxOdd = odd[i]
                t2 = i
            }
        }
        val ans: Int
        if (t1 == t2) {
            var secondEven = 0
            var secondOdd = 0
            for (i in 0 until max + 1) {
                if (i != t1 && even[i] > secondEven) {
                    secondEven = even[i]
                }
                if (i != t2 && odd[i] > secondOdd) {
                    secondOdd = odd[i]
                }
            }
            ans = Math.min(
                n / 2 + n % 2 - maxEven + (n / 2 - secondOdd),
                n / 2 + n % 2 - secondEven + (n / 2 - maxOdd),
            )
        } else {
            ans = n / 2 + n % 2 - maxEven + n / 2 - maxOdd
        }
        return ans
    }
}
