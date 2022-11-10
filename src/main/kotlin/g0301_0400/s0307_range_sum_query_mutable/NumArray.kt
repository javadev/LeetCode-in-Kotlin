package g0301_0400.s0307_range_sum_query_mutable

// #Medium #Array #Design #Segment_Tree #Binary_Indexed_Tree
// #2022_11_10_Time_1720_ms_(78.79%)_Space_137_MB_(69.70%)

class NumArray(nums: IntArray) {

    lateinit var tree: IntArray

    init {
        // make nums 1-based array
        tree = IntArray(nums.size + 1)
        for (i in 0 until nums.size) {
            tree[i + 1] = nums[i]
        }

        // construct our fenwick tree
        for (i in 1 until tree.size) {
            val j = i + lsb(i)
            if (j < tree.size) {
                tree[j] += tree[i]
            }
        }
    }

    private fun add(index: Int, value: Int) {
        var x = index
        while (x < tree.size) {
            tree[x] += value
            x += lsb(x)
        }
    }

    private fun sum(i: Int, j: Int): Int {
        return prefixSum(j) - prefixSum(i - 1)
    }

    private fun updateTree(index: Int, k: Int) {
        val value = sum(index, index)
        add(index, k - value)
    }

    private fun prefixSum(index: Int): Int {
        if (index == 0) return 0
        var sum = 0
        var x = index
        while (x > 0) {
            sum += tree[x]
            x -= lsb(x)
        }

        return sum
    }

    private fun lsb(num: Int): Int {
        return Integer.lowestOneBit(num)
    }

    fun update(i: Int, `val`: Int) {
        updateTree(i + 1, `val`)
    }

    fun sumRange(i: Int, j: Int): Int {
        return sum(i + 1, j + 1)
    }
}

/*
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * obj.update(index,`val`)
 * var param_2 = obj.sumRange(left,right)
 */
