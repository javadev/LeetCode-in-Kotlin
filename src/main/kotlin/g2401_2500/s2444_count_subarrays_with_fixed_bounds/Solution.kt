package g2401_2500.s2444_count_subarrays_with_fixed_bounds

// #Hard #Array #Sliding_Window #Queue #Monotonic_Queue
class Solution {
    fun countSubarrays(nums: IntArray, minK: Int, maxK: Int): Long {
        var ans: Long = 0
        var i = 0
        while (i < nums.size) {
            if (nums[i] >= minK && nums[i] <= maxK) {
                var a = i
                var b = i
                var mini = 0
                var maxi = 0
                while (i != nums.size && nums[i] >= minK && nums[i] <= maxK) {
                    i++
                }
                while (true) {
                    while (b != i && (mini == 0 || maxi == 0)) {
                        if (nums[b] == minK) {
                            mini++
                        }
                        if (nums[b] == maxK) {
                            maxi++
                        }
                        b++
                    }
                    if (mini == 0 || maxi == 0) {
                        break
                    }
                    while (mini != 0 && maxi != 0) {
                        if (nums[a] == minK) {
                            mini--
                        }
                        if (nums[a] == maxK) {
                            maxi--
                        }
                        ans += (1 + (i - b)).toLong()
                        a++
                    }
                }
            }
            i++
        }
        return ans
    }
}
