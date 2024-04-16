package g3001_3100.s3071_minimum_operations_to_write_the_letter_y_on_a_grid

// #Medium #Array #Hash_Table #Matrix #Counting
// #2024_04_16_Time_268_ms_(91.11%)_Space_42.6_MB_(93.33%)

import kotlin.math.min

class Solution {
    fun minimumOperationsToWriteY(arr: Array<IntArray>): Int {
        val n = arr.size
        val cnt1 = IntArray(3)
        val cnt2 = IntArray(3)
        val x = n / 2
        val y = n / 2
        for (j in x until n) {
            cnt1[arr[j][y]]++
            arr[j][y] = 3
        }
        for (j in x downTo 0) {
            if (arr[j][j] != 3) {
                cnt1[arr[j][j]]++
            }
            arr[j][j] = 3
        }
        for (j in x downTo 0) {
            if (arr[j][n - 1 - j] != 3) {
                cnt1[arr[j][n - 1 - j]]++
            }
            arr[j][n - 1 - j] = 3
        }
        for (ints in arr) {
            for (j in 0 until n) {
                if (ints[j] != 3) {
                    cnt2[ints[j]]++
                }
            }
        }
        val s1 = cnt1[0] + cnt1[1] + cnt1[2]
        val s2 = cnt2[0] + cnt2[1] + cnt2[2]
        var min = Int.MAX_VALUE
        for (i in 0..2) {
            for (j in 0..2) {
                if (i != j) {
                    min = min((s1 - cnt1[i] + s2 - cnt2[j]), min)
                }
            }
        }
        return min
    }
}
