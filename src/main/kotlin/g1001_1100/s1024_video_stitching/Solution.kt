package g1001_1100.s1024_video_stitching

// #Medium #Array #Dynamic_Programming #Greedy
// #2023_05_22_Time_141_ms_(100.00%)_Space_34.8_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun videoStitching(clips: Array<IntArray>, time: Int): Int {
        Arrays.sort(clips) { a: IntArray, b: IntArray ->
            if (a[0] == b[0]
            ) a[1] - b[1] else a[0] - b[0]
        }
        var count = 0
        var covered = 0
        var i = 0
        var start = 0
        while (start < time) {
            while (i < clips.size && clips[i][0] <= start) {
                covered = covered.coerceAtLeast(clips[i][1])
                i++
            }
            if (start == covered) {
                return -1
            }
            count++
            start = covered
        }
        return count
    }
}
