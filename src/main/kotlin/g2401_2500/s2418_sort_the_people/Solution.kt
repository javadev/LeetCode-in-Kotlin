package g2401_2500.s2418_sort_the_people

// #Easy #Array #String #Hash_Table #Sorting
// #2023_07_04_Time_248_ms_(100.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        quicksort(names, heights, 0, heights.size - 1)
        return names
    }

    private fun quicksort(names: Array<String>, heights: IntArray, low: Int, high: Int) {
        if (low >= high) {
            return
        }
        var start = low
        var end = high
        val mid = start + (end - start) / 2
        val pivot = heights[mid]
        while (start < end) {
            while (heights[start] > pivot) {
                start++
            }
            while (heights[end] < pivot) {
                end--
            }
            val tempHeight = heights[start]
            heights[start] = heights[end]
            heights[end] = tempHeight
            val tempName = names[start]
            names[start] = names[end]
            names[end] = tempName
        }
        quicksort(names, heights, low, end - 1)
        quicksort(names, heights, start + 1, high)
    }
}
