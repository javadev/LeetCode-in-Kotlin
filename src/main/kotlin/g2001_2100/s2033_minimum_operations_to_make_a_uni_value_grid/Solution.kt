package g2001_2100.s2033_minimum_operations_to_make_a_uni_value_grid

// #Medium #Array #Math #Sorting #Matrix
class Solution {
    fun minOperations(grid: Array<IntArray>, x: Int): Int {
        val arr = IntArray(grid.size * grid[0].size)
        var k = 0
        for (ints in grid) {
            for (j in grid[0].indices) {
                arr[k] = ints[j]
                k++
            }
        }
        arr.sort()
        val target = arr[arr.size / 2]
        var res = 0
        for (i in arr.indices) {
            res += if (i < arr.size / 2) {
                val rem = target - arr[i]
                if (rem % x != 0) {
                    return -1
                }
                rem / x
            } else {
                val rem = arr[i] - target
                if (rem % x != 0) {
                    return -1
                }
                rem / x
            }
        }
        return res
    }
}
