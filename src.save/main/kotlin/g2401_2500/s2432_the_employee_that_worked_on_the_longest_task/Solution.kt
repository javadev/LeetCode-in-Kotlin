package g2401_2500.s2432_the_employee_that_worked_on_the_longest_task

// #Easy #Array #2023_07_05_Time_250_ms_(100.00%)_Space_39.2_MB_(100.00%)

class Solution {
    fun hardestWorker(logs: Array<IntArray>): Int {
        var max: Int
        var tid: Int
        var temp: Int
        max = 0
        tid = Int.MAX_VALUE
        var i = 0
        while (i < logs.size) {
            temp = logs[i][1]
            if (i > 0) {
                temp -= logs[i - 1][1]
            }
            if (temp > max) {
                max = temp
                tid = logs[i][0]
            } else if (temp == max && tid > logs[i][0]) {
                tid = logs[i][0]
            }
            i++
        }
        return tid
    }
}
