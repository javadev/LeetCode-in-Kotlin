package g1501_1600.s1598_crawler_log_folder

// #Easy #Array #String #Stack #2023_06_14_Time_150_ms_(92.31%)_Space_35_MB_(100.00%)

class Solution {
    fun minOperations(logs: Array<String>): Int {
        var steps = 0
        for (log in logs) {
            if (log == "../") {
                if (steps > 0) {
                    steps--
                }
            } else if (log != "./") {
                steps++
            }
        }
        return steps
    }
}
