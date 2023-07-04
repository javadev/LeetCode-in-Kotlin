package g2401_2500.s2488_count_subarrays_with_median_k

// #Hard #Array #Hash_Table #Prefix_Sum
class Solution {
    fun countSubarrays(nums: IntArray, k: Int): Int {
        var idx: Int
        val n = nums.size
        var ans = 0
        idx = 0
        while (idx < n) {
            if (nums[idx] == k) {
                break
            }
            idx++
        }
        val arr = Array(n - idx) { IntArray(2) }
        var j = 1
        for (i in idx + 1 until n) {
            if (nums[i] < k) {
                arr[j][0] = arr[j - 1][0] + 1
                arr[j][1] = arr[j - 1][1]
            } else {
                arr[j][1] = arr[j - 1][1] + 1
                arr[j][0] = arr[j - 1][0]
            }
            j++
        }
        val map: MutableMap<Int, Int> = HashMap()
        for (ints in arr) {
            val d2 = ints[1] - ints[0]
            map[d2] = map.getOrDefault(d2, 0) + 1
        }
        var s1 = 0
        var g1 = 0
        for (i in idx downTo 0) {
            if (nums[i] < k) {
                s1++
            } else if (nums[i] > k) {
                g1++
            }
            val d1 = g1 - s1
            val cur = map.getOrDefault(-d1, 0) + map.getOrDefault(1 - d1, 0)
            ans += cur
        }
        return ans
    }
}
