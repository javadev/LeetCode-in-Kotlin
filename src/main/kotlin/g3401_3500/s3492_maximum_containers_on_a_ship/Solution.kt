package g3401_3500.s3492_maximum_containers_on_a_ship

// #Easy #2025_03_23_Time_0_ms_(100.00%)_Space_40.86_MB_(89.29%)

import kotlin.math.min

class Solution {
    fun maxContainers(n: Int, w: Int, maxWeight: Int): Int {
        val c = n * n
        val count = maxWeight / w
        return min(c, count)
    }
}
