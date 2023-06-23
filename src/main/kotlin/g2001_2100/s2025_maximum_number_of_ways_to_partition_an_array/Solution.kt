package g2001_2100.s2025_maximum_number_of_ways_to_partition_an_array

// #Hard #Array #Hash_Table #Prefix_Sum #Counting #Enumeration
// #2023_06_23_Time_1163_ms_(100.00%)_Space_76_MB_(100.00%)

class Solution {
    fun waysToPartition(nums: IntArray, k: Int): Int {
        val n = nums.size
        val ps = LongArray(n)
        ps[0] = nums[0].toLong()
        for (i in 1 until n) {
            ps[i] = ps[i - 1] + nums[i]
        }
        val partDiffs: MutableMap<Long, ArrayList<Int>> = HashMap()
        var maxWays = 0
        for (i in 1 until n) {
            val partL = ps[i - 1]
            val partR = ps[n - 1] - partL
            val partDiff = partR - partL
            if (partDiff == 0L) {
                maxWays++
            }
            val idxSet = partDiffs.computeIfAbsent(partDiff) { _: Long? -> ArrayList() }
            idxSet.add(i)
        }
        for (j in 0 until n) {
            var ways = 0
            val newDiff = k.toLong() - nums[j]
            val leftList = partDiffs[newDiff]
            if (leftList != null) {
                val i = upperBound(leftList, j)
                ways += leftList.size - i
            }
            val rightList = partDiffs[-newDiff]
            if (rightList != null) {
                val i = upperBound(rightList, j)
                ways += i
            }
            maxWays = Math.max(ways, maxWays)
        }
        return maxWays
    }

    private fun upperBound(arr: List<Int>, `val`: Int): Int {
        var ans = -1
        val n = arr.size
        var l = 0
        var r = n
        while (l <= r) {
            val mid = l + (r - l) / 2
            if (mid == n) {
                return n
            }
            if (arr[mid] > `val`) {
                ans = mid
                r = mid - 1
            } else {
                l = mid + 1
            }
        }
        return ans
    }
}
