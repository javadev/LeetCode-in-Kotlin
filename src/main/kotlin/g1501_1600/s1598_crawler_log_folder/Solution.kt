package g1501_1600.s1598_crawler_log_folder

// #Easy #Array #String #Stack
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
