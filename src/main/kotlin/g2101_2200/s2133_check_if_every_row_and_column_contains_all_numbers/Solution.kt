package g2101_2200.s2133_check_if_every_row_and_column_contains_all_numbers

// #Easy #Array #Hash_Table #Matrix
class Solution {
    fun checkValid(matrix: Array<IntArray>): Boolean {
        val n = matrix.size
        val set: MutableSet<Int> = HashSet()
        for (ints in matrix) {
            for (anInt in ints) {
                set.add(anInt)
            }
            if (set.size != n) {
                return false
            }
            set.clear()
        }
        for (i in matrix[0].indices) {
            for (ints in matrix) {
                set.add(ints[i])
            }
            if (set.size != n) {
                return false
            }
            set.clear()
        }
        return true
    }
}
