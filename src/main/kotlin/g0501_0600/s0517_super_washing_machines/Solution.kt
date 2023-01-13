package g0501_0600.s0517_super_washing_machines

// #Hard #Array #Greedy #2023_01_12_Time_210_ms_(100.00%)_Space_36.9_MB_(100.00%)

class Solution {
    fun findMinMoves(machines: IntArray): Int {
        var total = 0
        for (i in machines) {
            total += i
        }
        if (total % machines.size != 0) {
            return -1
        }
        val avg = total / machines.size
        var cnt = 0
        var max = 0
        for (load in machines) {
            cnt += load - avg
            max = Math.max(Math.max(max, Math.abs(cnt)), load - avg)
        }
        return max
    }
}
