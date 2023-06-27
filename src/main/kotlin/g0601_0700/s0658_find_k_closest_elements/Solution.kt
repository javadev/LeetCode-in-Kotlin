package g0601_0700.s0658_find_k_closest_elements

// #Medium #Array #Sorting #Binary_Search #Two_Pointers #Heap_Priority_Queue #Binary_Search_II_Day_2
// #2023_02_13_Time_375_ms_(95.16%)_Space_37.8_MB_(98.39%)

class Solution {
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        var left = 0
        var right = arr.size - k
        val answer: MutableList<Int> = ArrayList()
        while (left < right) {
            val mid = left + (right - left) / 2
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        for (i in left until left + k) {
            answer.add(arr[i])
        }
        return answer
    }
}
