package g4001_4100.s4027_elevator_requests_iii

// #Hard #Array #Dynamic_Programming #Sorting #Bit_Manipulation #Bitmask #Senior_Staff
// #Weekly_Contest_515 #2026_11_25_Time_3_ms_(98.11%)_Space_44.46_MB_(92.45%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun elevatorRequests(n: Int, start: Int, requests: Array<IntArray>): Long = solve(start, 0L, 0, requests)

    private fun solve(currFloor: Int, currTime: Long, fulfilledMask: Int, requests: Array<IntArray>): Long {
        val m = requests.size
        if (fulfilledMask == (1 shl m) - 1) {
            return currTime
        }
        var minFloor = Int.MAX_VALUE
        var maxFloor = Int.MIN_VALUE
        for (i in 0..<m) {
            if ((fulfilledMask and (1 shl i)) == 0) {
                minFloor = min(minFloor, requests[i][1])
                maxFloor = max(maxFloor, requests[i][1])
            }
        }
        var res = Long.MAX_VALUE
        val targets =
            if (minFloor == maxFloor) intArrayOf(minFloor) else intArrayOf(minFloor, maxFloor)
        for (target in targets) {
            var nextMask = fulfilledMask
            var waitTargetTime = currTime + abs(target - currFloor)
            for (i in 0..<m) {
                if ((fulfilledMask and (1 shl i)) == 0) {
                    val f = requests[i][1]
                    val arr = requests[i][0].toLong()
                    if ((currFloor <= f && f <= target) || (target <= f && f <= currFloor)) {
                        val passTime = currTime + abs(f - currFloor)
                        if (passTime >= arr) {
                            nextMask = nextMask or (1 shl i)
                        } else if (f == target) {
                            waitTargetTime = max(waitTargetTime, arr)
                            nextMask = nextMask or (1 shl i)
                        }
                    }
                }
            }
            res = min(res, solve(target, waitTargetTime, nextMask, requests))
        }
        return res
    }
}
