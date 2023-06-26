package g2201_2300.s2226_maximum_candies_allocated_to_k_children

// #Medium #Array #Binary_Search
@Suppress("NAME_SHADOWING")
class Solution {
    fun maximumCandies(candies: IntArray, k: Long): Int {
        var max = Int.MIN_VALUE
        var sum: Long = 0
        for (num in candies) {
            max = Math.max(max, num)
            sum += num.toLong()
        }
        if (sum < k) {
            return 0
        }
        var left = 1
        var right = max
        while (left < right) {
            val mid = left + (right - left) / 2
            if (canBeDistributed(mid, candies, k)) {
                left = if (!canBeDistributed(mid + 1, candies, k)) {
                    return mid
                } else {
                    mid + 1
                }
            } else {
                right = mid - 1
            }
        }
        return left
    }

    private fun canBeDistributed(num: Int, candies: IntArray, k: Long): Boolean {
        var k = k
        var i = 0
        while (i < candies.size && k > 0) {
            k -= (candies[i] / num).toLong()
            ++i
        }
        return k <= 0
    }
}
