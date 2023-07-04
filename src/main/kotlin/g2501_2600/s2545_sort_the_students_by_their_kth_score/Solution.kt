package g2501_2600.s2545_sort_the_students_by_their_kth_score

import java.util.Arrays

// #Medium #Array #Sorting #Matrix
class Solution {
    fun sortTheStudents(score: Array<IntArray>, k: Int): Array<IntArray> {
        Arrays.sort(score) { o1: IntArray, o2: IntArray -> o2[k] - o1[k] }
        return score
    }
}
