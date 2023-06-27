package g1601_1700.s1687_delivering_boxes_from_storage_to_ports

// #Hard #Array #Dynamic_Programming #Heap_Priority_Queue #Queue #Segment_Tree #Monotonic_Queue
// #2023_06_15_Time_778_ms_(100.00%)_Space_97.3_MB_(100.00%)

@Suppress("UNUSED_PARAMETER")
class Solution {
    fun boxDelivering(boxes: Array<IntArray>, portsCount: Int, maxBoxes: Int, maxWeight: Int): Int {
        var t = 2
        var weight = 0
        val n = boxes.size
        val dp = IntArray(n + 1)
        dp[0] = 0
        var left = 0
        for (right in boxes.indices) {
            weight += boxes[right][1]
            if (right > 0 && boxes[right][0] != boxes[right - 1][0]) {
                t++
            }
            // checking if weight, boxes are less than or equal to max contraint
            while (weight > maxWeight || right - left >= maxBoxes || left < right && dp[left] == dp[left + 1]) {
                weight -= boxes[left][1]
                if (boxes[left][0] != boxes[left + 1][0]) {
                    t--
                }
                left++
            }
            dp[right + 1] = dp[left] + t
        }
        return dp[n]
    }
}
