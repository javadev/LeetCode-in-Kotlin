package g1201_1300.s1300_sum_of_mutated_array_closest_to_target

// #Medium #Array #Sorting #Binary_Search #Binary_Search_II_Day_16
class Solution {
    fun findBestValue(arr: IntArray, target: Int): Int {
        arr.sort()
        val n = arr.size
        var lo = 0
        var hi = arr[n - 1]
        var min = Int.MAX_VALUE
        var ans = -1
        while (lo <= hi) {
            val mid = (lo + hi) / 2
            val m = check(mid, arr, target)
            val l = check(mid - 1, arr, target)
            val r = check(mid + 1, arr, target)
            if (m < min || m == min && ans > mid) {
                min = m
                ans = mid
            } else if (l <= r) {
                hi = mid - 1
            } else {
                lo = mid + 1
            }
        }
        return ans
    }

    fun check(v: Int, arr: IntArray, target: Int): Int {
        var sum = 0
        for (i in arr.indices) {
            sum += if (arr[i] >= v) {
                return Math.abs(sum + (arr.size - i) * v - target)
            } else {
                arr[i]
            }
        }
        return Math.abs(sum - target)
    }
}
