package g0901_1000.s0930_binary_subarrays_with_sum

// #Medium #Array #Hash_Table #Prefix_Sum #Sliding_Window
// #2023_04_26_Time_250_ms_(93.75%)_Space_39.6_MB_(87.50%)

class Solution {
    fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
        return atmostK(nums, goal) - atmostK(nums, goal - 1)
    }

    fun atmostK(arr: IntArray, k: Int): Int {
        var cnt = 0
        var i = 0
        var j = 0
        var sum = 0
        while (j < arr.size) {
            sum += arr[j]
            if (sum > k) {
                while (i <= j && sum > k) {
                    sum -= arr[i]
                    i++
                }
            }
            cnt += j - i + 1
            j++
        }
        return cnt
    }
}
