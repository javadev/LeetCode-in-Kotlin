package g1001_1100.s1089_duplicate_zeros

// #Easy #Array #Two_Pointers #2023_06_02_Time_185_ms_(93.60%)_Space_36.8_MB_(90.12%)

class Solution {
    fun duplicateZeros(arr: IntArray) {
        var countZero = 0
        for (k in arr) {
            if (k == 0) {
                countZero++
            }
        }
        val len = arr.size + countZero
        // We just need O(1) space if we scan from back
        // i point to the original array, j point to the new location
        var i = arr.size - 1
        var j = len - 1
        while (i < j) {
            // copy twice when hit '0'
            if (arr[i] == 0) {
                if (j < arr.size) {
                    arr[j] = arr[i]
                }
                j--
            }
            if (j < arr.size) {
                arr[j] = arr[i]
            }
            i--
            j--
        }
    }
}
