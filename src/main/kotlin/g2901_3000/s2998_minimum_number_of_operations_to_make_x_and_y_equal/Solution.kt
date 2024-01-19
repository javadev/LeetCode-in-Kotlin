package g2901_3000.s2998_minimum_number_of_operations_to_make_x_and_y_equal

// #Medium #Dynamic_Programming #Breadth_First_Search #Memoization
// #2024_01_19_Time_149_ms_(100.00%)_Space_34_MB_(96.55%)

import kotlin.math.min

class Solution {
    fun minimumOperationsToMakeEqual(x: Int, y: Int): Int {
        if (x <= y) {
            return y - x
        }
        var res = x - y
        res = min(res, (1 + minimumOperationsToMakeEqual(x / 5, y) + x % 5))
        res = min(res, (1 + minimumOperationsToMakeEqual(x / 5 + 1, y) + 5 - x % 5))
        res = min(res, (1 + minimumOperationsToMakeEqual(x / 11, y) + x % 11))
        res = min(res, (1 + minimumOperationsToMakeEqual(x / 11 + 1, y) + 11 - x % 11))
        return res
    }
}
