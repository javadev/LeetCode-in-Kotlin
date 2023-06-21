package g1801_1900.s1893_check_if_all_the_integers_in_a_range_are_covered

// #Easy #Array #Hash_Table #Prefix_Sum
class Solution {
    fun isCovered(ranges: Array<IntArray>, left: Int, right: Int): Boolean {
        val temp = IntArray(52)
        for (range in ranges) {
            val start = range[0]
            val end = range[ranges[0].size - 1]
            temp[start] += 1
            temp[end + 1] += -1
        }
        for (i in 1 until temp.size) {
            temp[i] += temp[i - 1]
        }
        for (i in left..right) {
            if (temp[i] == 0) {
                return false
            }
        }
        return true
    }
}
