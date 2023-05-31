package g1101_1200.s1122_relative_sort_array

// #Easy #Array #Hash_Table #Sorting #Counting_Sort

class Solution {
    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val map = IntArray(1001)
        for (a in arr1) {
            map[a]++
        }
        var i = 0
        for (b in arr2) {
            while (map[b] != 0) {
                map[b]--
                arr1[i] = b
                i++
            }
        }
        for (j in map.indices) {
            while (map[j] != 0) {
                arr1[i] = j
                map[j]--
                i++
            }
        }
        return arr1
    }
}
