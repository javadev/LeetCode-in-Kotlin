package g1501_1600.s1552_magnetic_force_between_two_balls

// #Medium #Array #Sorting #Binary_Search #Binary_Search_II_Day_4
// #2023_06_14_Time_636_ms_(100.00%)_Space_57.3_MB_(100.00%)

class Solution {
    fun maxDistance(position: IntArray, m: Int): Int {
        position.sort()
        return binarySearch(position, m)
    }

    private fun binarySearch(arr: IntArray, m: Int): Int {
        var low = 0
        val n = arr.size
        var high = arr[n - 1]
        var max = -1
        while (low <= high) {
            val mid = low + (high - low) / 2
            if (check(arr, mid, m)) {
                if (max < mid) {
                    max = mid
                }
                low = mid + 1
            } else {
                high = mid - 1
            }
        }
        return max
    }

    private fun check(arr: IntArray, mid: Int, m: Int): Boolean {
        var pos = arr[0]
        var magnet = 1
        for (i in 1 until arr.size) {
            if (arr[i] - pos >= mid) {
                pos = arr[i]
                magnet += 1
                if (magnet == m) {
                    return true
                }
            }
        }
        return false
    }
}
