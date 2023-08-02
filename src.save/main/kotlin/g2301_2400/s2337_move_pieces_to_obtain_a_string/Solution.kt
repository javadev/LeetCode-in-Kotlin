package g2301_2400.s2337_move_pieces_to_obtain_a_string

// #Medium #String #Two_Pointers #2023_07_01_Time_261_ms_(100.00%)_Space_38.7_MB_(100.00%)

class Solution {
    fun canChange(start: String, target: String): Boolean {
        var i = -1
        var j = -1
        while (true) {
            while (true) {
                if (++i >= start.length || start[i] != '_') {
                    break
                }
            }
            while (true) {
                if (++j >= target.length || target[j] != '_') {
                    break
                }
            }
            if (i == start.length && j == target.length) {
                return true
            }
            if (i == start.length || j == target.length) {
                return false
            }
            if (start[i] != target[j] || (if (start[i] == 'L') j > i else i > j)) {
                return false
            }
        }
    }
}
