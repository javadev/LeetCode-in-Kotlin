package g3601_3700.s3695_maximize_alternating_sum_using_swaps

// #Hard #Array #Sorting #Greedy #Union_Find #Biweekly_Contest_166
// #2025_10_03_Time_61_ms_(100.00%)_Space_105.29_MB_(100.00%)

class Solution {
    private lateinit var root: IntArray

    fun maxAlternatingSum(nums: IntArray, swaps: Array<IntArray>): Long {
        val n = nums.size
        root = IntArray(n) { it }
        val list = Array(n) { ArrayList<Int>() }
        val oddCount = IntArray(n)
        for (s in swaps) {
            union(s[0], s[1])
        }
        for (i in nums.indices) {
            val r = findRoot(i)
            list[r].add(nums[i])
            if (i % 2 == 1) {
                oddCount[r]++
            }
        }

        var result = 0L
        for (i in 0 until n) {
            if (root[i] != i) {
                continue
            }
            val currentList = list[i]
            val currentOddCount = oddCount[i]
            currentList.sort()
            for (j in currentList.indices) {
                val value = currentList[j].toLong()
                val multiplier = if (j < currentOddCount) -1 else 1
                result += value * multiplier
            }
        }
        return result
    }

    private fun union(a: Int, b: Int) {
        val rootA = findRoot(a)
        val rootB = findRoot(b)
        if (rootA != rootB) {
            if (rootA < rootB) {
                root[rootB] = rootA
            } else {
                root[rootA] = rootB
            }
        }
    }

    private fun findRoot(a: Int): Int {
        if (a == root[a]) {
            return a
        }
        return findRoot(root[a]).also { root[a] = it }
    }
}
