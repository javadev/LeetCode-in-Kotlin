package g2501_2600.s2545_sort_the_students_by_their_kth_score

// #Medium #Array #Sorting #Matrix #2023_07_04_Time_442_ms_(100.00%)_Space_53.3_MB_(100.00%)

class Solution {
    fun sortTheStudents(score: Array<IntArray>, k: Int): Array<IntArray> {
        score.sortWith { o1: IntArray, o2: IntArray -> o2[k] - o1[k] }
        return score
    }
}
