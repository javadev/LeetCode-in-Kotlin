package g0901_1000.s0969_pancake_sorting

// #Medium #Array #Sorting #Greedy #Two_Pointers
// #2023_05_06_Time_169_ms_(100.00%)_Space_36.8_MB_(12.50%)

class Solution {
    fun pancakeSort(arr: IntArray): List<Int> {
        val result: MutableList<Int> = ArrayList()
        for (i in arr.size downTo 1) {
            var max = Int.MIN_VALUE
            var index = 0
            for (j in 0 until i) {
                if (max < arr[j]) {
                    index = j + 1
                    max = arr[j]
                }
            }
            result.add(index)
            reverse(arr, index - 1)
            result.add(i)
            reverse(arr, i - 1)
        }
        return result
    }

    private fun reverse(arr: IntArray, index: Int) {
        for (i in 0..(index - 1) / 2) {
            val temp = arr[i]
            arr[i] = arr[index - i]
            arr[index - i] = temp
        }
    }
}
