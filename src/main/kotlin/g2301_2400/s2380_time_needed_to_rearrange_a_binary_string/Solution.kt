package g2301_2400.s2380_time_needed_to_rearrange_a_binary_string

// #Medium #String #Dynamic_Programming #Simulation
class Solution {
    fun secondsToRemoveOccurrences(s: String): Int {
        var lastOne = -1
        var result = 0
        var prevResult: Int
        var curResult = 0
        var countOne = 0
        var countZero = 0
        var diff: Int
        var pTarget: Int
        var pWait: Int
        var cTarget: Int
        for (i in 0 until s.length) {
            if (s[i] == '0') {
                ++countZero
                continue
            }
            ++countOne
            diff = i - lastOne - 1
            prevResult = curResult
            cTarget = countOne - 1
            pTarget = cTarget - 1
            pWait = prevResult - (lastOne - pTarget)
            curResult = if (diff > pWait) {
                countZero
            } else {
                if (countZero == 0) 0 else pWait - diff + 1 + countZero
            }
            result = curResult
            lastOne = i
        }
        return result
    }
}
