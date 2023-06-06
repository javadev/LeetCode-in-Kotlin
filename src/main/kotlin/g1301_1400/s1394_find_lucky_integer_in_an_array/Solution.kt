package g1301_1400.s1394_find_lucky_integer_in_an_array

// #Easy #Array #Hash_Table #Counting #2023_06_06_Time_161_ms_(100.00%)_Space_37_MB_(70.00%)

class Solution {
    fun findLucky(arr: IntArray): Int {
        val numbers = IntArray(501)
        for (j in arr) {
            numbers[j]++
        }
        for (i in 500 downTo 1) {
            if (i == numbers[i]) {
                return i
            }
        }
        return -1
    }
}
