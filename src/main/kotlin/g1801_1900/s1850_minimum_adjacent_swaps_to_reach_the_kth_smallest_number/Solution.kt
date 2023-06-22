package g1801_1900.s1850_minimum_adjacent_swaps_to_reach_the_kth_smallest_number

// #Medium #String #Greedy #Two_Pointers #2023_06_22_Time_193_ms_(100.00%)_Space_34.8_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun getMinSwaps(num: String, k: Int): Int {
        var k = k
        val result = num.toCharArray()
        while (--k >= 0) {
            var swap = result.size - 2
            while (swap >= 0 && result[swap] >= result[swap + 1]) {
                --swap
            }
            var pair = result.size - 1
            while (pair > swap && result[swap] >= result[pair]) {
                --pair
            }
            swap(result, swap, pair)
            var lo = swap + 1
            var hi = result.size - 1
            while (lo < hi) {
                swap(result, lo++, hi--)
            }
        }
        var ans = 0
        val arr = num.toCharArray()
        for (i in arr.indices) {
            if (arr[i] == result[i]) {
                continue
            }
            var j = i
            while (arr[i] != result[j]) {
                ++j
            }
            ans += j - i
            while (--j >= i) {
                swap(result, j, j + 1)
            }
        }
        return ans
    }

    private fun swap(arr: CharArray, a: Int, b: Int) {
        val tmp = arr[a]
        arr[a] = arr[b]
        arr[b] = tmp
    }
}
