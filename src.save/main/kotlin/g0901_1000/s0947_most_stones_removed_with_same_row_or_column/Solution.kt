package g0901_1000.s0947_most_stones_removed_with_same_row_or_column

// #Medium #Depth_First_Search #Graph #Union_Find #Level_2_Day_19_Union_Find
// #2023_04_30_Time_200_ms_(100.00%)_Space_56_MB_(5.88%)

class Solution {
    private val roots = IntArray(20002)

    fun removeStones(stones: Array<IntArray>): Int {
        for (stone in stones) {
            init(stone[0] + 1, roots)
            init(stone[1] + 10000, roots)
            union(stone[0] + 1, stone[1] + 10000)
        }
        val set: HashSet<Int> = HashSet()
        for (n in roots) {
            if (n == 0) {
                continue
            }
            set.add(find(n))
        }
        return stones.size - set.size
    }

    private fun init(i: Int, roots: IntArray) {
        if (roots[i] != 0) {
            return
        }
        roots[i] = i
    }

    private fun union(i: Int, j: Int) {
        val ri = find(i)
        val rj = find(j)
        if (ri == rj) {
            return
        }
        roots[ri] = rj
    }

    private fun find(i: Int): Int {
        var cur = i
        while (cur != roots[cur]) {
            cur = roots[roots[cur]]
        }
        return cur
    }
}
