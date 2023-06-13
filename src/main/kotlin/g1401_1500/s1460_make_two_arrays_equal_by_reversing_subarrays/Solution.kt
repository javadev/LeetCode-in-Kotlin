package g1401_1500.s1460_make_two_arrays_equal_by_reversing_subarrays

// #Easy #Array #Hash_Table #Sorting
class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        val n = target.size
        target.sort()
        arr.sort()
        var count = 0
        for (i in target.indices) {
            if (target[i] == arr[i]) {
                count++
            }
        }
        return count == n
    }
}
