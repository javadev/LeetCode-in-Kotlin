package g1301_1400.s1395_count_number_of_teams

// #Medium #Array #Dynamic_Programming #Binary_Indexed_Tree
class Solution {
    fun numTeams(rating: IntArray): Int {
        val cp = rating.clone()
        cp.sort()
        // count i, j such that i<j and rating[i]<rating[j]
        val count = Array(cp.size) { IntArray(2) }
        val bit = IntArray(cp.size)
        for (i in rating.indices) {
            count[i][0] = count(bs(cp, rating[i] - 1), bit)
            count[i][1] = i - count[i][0]
            add(bs(cp, rating[i]), bit)
        }
        // reverse count from right to left, that i<j and rating[i]>rating[j]
        val reverseCount = Array(cp.size) { IntArray(2) }
        val reverseBit = IntArray(cp.size)
        for (i in cp.indices.reversed()) {
            reverseCount[i][0] = count(bs(cp, rating[i] - 1), reverseBit)
            reverseCount[i][1] = cp.size - 1 - i - reverseCount[i][0]
            add(bs(cp, rating[i]), reverseBit)
        }
        var result = 0
        for (i in rating.indices) {
            result += count[i][0] * reverseCount[i][1] + count[i][1] * reverseCount[i][0]
        }
        return result
    }

    private fun count(idx: Int, bit: IntArray): Int {
        var idx = idx
        var sum = 0
        while (idx >= 0) {
            sum += bit[idx]
            idx = (idx and idx + 1) - 1
        }
        return sum
    }

    private fun add(idx: Int, bit: IntArray) {
        var idx = idx
        if (idx < 0) {
            return
        }
        while (idx < bit.size) {
            bit[idx] += 1
            idx = idx or idx + 1
        }
    }

    private fun bs(arr: IntArray, `val`: Int): Int {
        var l = 0
        var r = arr.size - 1
        while (l < r) {
            val m = l + (r - l) / 2
            if (arr[m] == `val`) {
                return m
            } else if (arr[m] < `val`) {
                l = m + 1
            } else {
                r = m - 1
            }
        }
        return if (arr[l] > `val`) l - 1 else l
    }
}
