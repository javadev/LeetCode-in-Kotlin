package g4001_4100.s4012_count_of_unfinished_tasks_after_each_shift

// #Medium #Array #Binary_Search #Prefix_Sum #Staff #Weekly_Contest_513
// #2026_11_17_Time_7_ms_(100.00%)_Space_163.12_MB_(44.36%)

class Solution {
    fun countTasks(tasks: IntArray, shifts: IntArray): IntArray {
        val m = tasks.size
        val n = shifts.size
        val s = LongArray(m + 1)
        for (i in 0..<m) {
            s[i + 1] = s[i] + tasks[i]
        }
        val ans = IntArray(n)
        var i = 0
        var cur: Long = 0
        for (j in 0..<n) {
            if (shifts[j] < tasks[i] - cur) {
                cur += shifts[j].toLong()
                ans[j] = m - i
            } else {
                val t = shifts[j] - (tasks[i] - cur)
                if (t >= s[m] - s[i + 1]) {
                    i = 0
                    cur = 0
                } else {
                    var l = i + 1
                    var r = m
                    while (l < r) {
                        val mid = (l + r) shr 1
                        if (t < s[mid + 1] - s[i + 1]) {
                            r = mid
                        } else {
                            l = mid + 1
                        }
                    }
                    cur = t - (s[l] - s[i + 1])
                    i = l
                    ans[j] = m - i
                }
            }
        }
        return ans
    }
}
