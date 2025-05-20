package g3501_3600.s3551_minimum_swaps_to_sort_by_digit_sum

// #Medium #Array #Hash_Table #Sorting #2025_05_18_Time_481_ms_(83.33%)_Space_78.86_MB_(94.44%)

class Solution {
    private class Pair(var sum: Int, var value: Int, var index: Int)

    fun minSwaps(arr: IntArray): Int {
        val n = arr.size
        val pairs = arrayOfNulls<Pair>(n)
        for (i in 0..<n) {
            var v = arr[i]
            var s = 0
            while (v > 0) {
                s += v % 10
                v /= 10
            }
            pairs[i] = Pair(s, arr[i], i)
        }
        pairs.sortWith { a, b ->
            if (a!!.sum != b!!.sum) {
                a.sum - b.sum
            } else {
                a.value - b.value
            }
        }
        val posMap = IntArray(n)
        for (i in 0..<n) {
            posMap[i] = pairs[i]!!.index
        }
        val seen = BooleanArray(n)
        var swaps = 0
        for (i in 0..<n) {
            if (seen[i] || posMap[i] == i) {
                continue
            }
            var cycleSize = 0
            var j = i
            while (!seen[j]) {
                seen[j] = true
                j = posMap[j]
                cycleSize++
            }
            swaps += cycleSize - 1
        }
        return swaps
    }
}
