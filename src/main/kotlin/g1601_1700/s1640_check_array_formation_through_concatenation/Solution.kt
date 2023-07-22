package g1601_1700.s1640_check_array_formation_through_concatenation

// #Easy #Array #Hash_Table #2023_06_18_Time_154_ms_(100.00%)_Space_34.8_MB_(100.00%)

class Solution {
    fun canFormArray(arr: IntArray, pieces: Array<IntArray>): Boolean {
        for (piece in pieces) {
            val first = piece[0]
            val index = findIndex(arr, first)
            if (index == -1) {
                return false
            }
            var i = 0
            var j = index
            while (i < piece.size && j < arr.size) {
                if (arr[j] != piece[i]) {
                    return false
                }
                i++
                j++
            }
            if (i != piece.size) {
                return false
            }
        }
        return true
    }

    private fun findIndex(arr: IntArray, key: Int): Int {
        for (i in arr.indices) {
            if (arr[i] == key) {
                return i
            }
        }
        return -1
    }
}
