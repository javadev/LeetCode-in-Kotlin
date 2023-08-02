package g1801_1900.s1817_finding_the_users_active_minutes

// #Medium #Array #Hash_Table #2023_06_20_Time_652_ms_(100.00%)_Space_57.8_MB_(80.00%)

class Solution {
    fun findingUsersActiveMinutes(logs: Array<IntArray>, k: Int): IntArray {
        if (logs.size == 1) {
            val res = IntArray(k)
            res[0] = 1
            return res
        }
        logs.sortWith(compareBy { a: IntArray -> a[0] }.thenComparingInt { a: IntArray -> a[1] })
        val result = IntArray(k)
        var start = 1
        var prevUser = logs[0][0]
        var prevMin = logs[0][1]
        var count = 1
        while (true) {
            while (start < logs.size && prevUser == logs[start][0]) {
                if (prevMin != logs[start][1]) {
                    count++
                }
                prevMin = logs[start][1]
                start++
            }
            result[count - 1]++
            if (start >= logs.size) {
                break
            }
            count = 1
            prevUser = logs[start][0]
            prevMin = logs[start][1]
        }
        return result
    }
}
