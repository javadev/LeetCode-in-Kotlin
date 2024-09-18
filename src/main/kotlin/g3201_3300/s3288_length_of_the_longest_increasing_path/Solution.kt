package g3201_3300.s3288_length_of_the_longest_increasing_path

// #Hard #Array #Sorting #Binary_Search #2024_09_17_Time_984_ms_(83.33%)_Space_147.1_MB_(16.67%)

import java.util.ArrayList
import java.util.Comparator

class Solution {
    fun maxPathLength(coordinates: Array<IntArray>, k: Int): Int {
        val upper: MutableList<IntArray> = ArrayList<IntArray>()
        val lower: MutableList<IntArray> = ArrayList<IntArray>()
        for (pair in coordinates) {
            if (pair[0] > coordinates[k][0] && pair[1] > coordinates[k][1]) {
                upper.add(pair)
            }
            if (pair[0] < coordinates[k][0] && pair[1] < coordinates[k][1]) {
                lower.add(pair)
            }
        }
        upper.sortWith(
            Comparator { a: IntArray, b: IntArray ->
                if (a[0] == b[0]) {
                    b[1] - a[1]
                } else {
                    a[0] - b[0]
                }
            }
        )
        lower.sortWith(
            Comparator { a: IntArray, b: IntArray ->
                if (a[0] == b[0]) {
                    b[1] - a[1]
                } else {
                    a[0] - b[0]
                }
            }
        )
        return longestIncreasingLength(upper) + longestIncreasingLength(lower) + 1
    }

    private fun longestIncreasingLength(array: List<IntArray>): Int {
        val list: MutableList<Int?> = ArrayList<Int?>()
        for (pair in array) {
            val m = list.size
            if (m == 0 || list[m - 1]!! < pair[1]) {
                list.add(pair[1])
            } else {
                val idx = binarySearch(list, pair[1])
                list[idx] = pair[1]
            }
        }
        return list.size
    }

    private fun binarySearch(list: List<Int?>, target: Int): Int {
        val n = list.size
        var left = 0
        var right = n - 1
        while (left < right) {
            val mid = (left + right) / 2
            if (list[mid] == target) {
                return mid
            } else if (list[mid]!! > target) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }
}
