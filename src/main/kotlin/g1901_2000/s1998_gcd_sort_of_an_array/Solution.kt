package g1901_2000.s1998_gcd_sort_of_an_array

// #Hard #Array #Math #Sorting #Union_Find #2023_06_21_Time_437_ms_(100.00%)_Space_45.4_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun gcdSort(nums: IntArray): Boolean {
        val sorted = nums.clone()
        sorted.sort()
        val len = nums.size
        val max = sorted[len - 1]
        // grouping tree child(index)->parent(value), index==value is root
        val nodes = IntArray(max + 1)
        for (j in nums) {
            nodes[j] = -1
        }
        // value: <=0 not sieved, <0 leaf node, 0 or 1 not in nums, >1 grouped
        for (p in 2..max / 2) {
            if (nodes[p] > 0) {
                // sieved so not a prime number.
                continue
            }
            // p is now a prime number, set self as root.
            nodes[p] = p
            var group = p
            var num = p + p
            while (num <= max) {
                var existing = nodes[num]
                if (existing < 0) {
                    // 1st hit, set group
                    nodes[num] = group
                } else if (existing <= 1) {
                    // value doesn't exist in nums
                    nodes[num] = 1
                } else if (root(nodes, existing).also { existing = it } < group) {
                    nodes[group] = existing
                    group = existing
                } else {
                    nodes[existing] = group
                }
                num += p
            }
        }
        for (i in 0 until len) {
            if (root(nodes, nums[i]) != root(nodes, sorted[i])) {
                return false
            }
        }
        return true
    }

    companion object {
        private fun root(nodes: IntArray, num: Int): Int {
            var num = num
            var group: Int
            while (nodes[num].also { group = it } > 0 && group != num) {
                num = group
            }
            return num
        }
    }
}
