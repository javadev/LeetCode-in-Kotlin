package g1101_1200.s1130_minimum_cost_tree_from_leaf_values

import java.util.ArrayDeque
import java.util.Deque

// #Medium #Dynamic_Programming #Greedy #Stack #Monotonic_Stack

class Solution {
    fun mctFromLeafValues(arr: IntArray): Int {
        var res = 0
        val st: Deque<Int> = ArrayDeque()
        st.push(Int.MAX_VALUE)
        for (num in arr) {
            // do until the present num is bigger than nums in stack (we need to maintain the
            // increasing order in stack (bottom to up))
            while (st.peek() <= num) {
                // find two smallest leafs (integer on top of stack is smallest and at bottom is
                // largest UPTIL NOW)
                // the next smaller leaf could either be present num or the
                val smallestLeaf = st.pop()
                val smallerLeaf = Math.min(st.peek(), num)
                // num on top of stack after above pop()
                // multiply minimum leafs to reduce the SUM
                res += smallestLeaf * smallerLeaf
            }
            st.push(num)
        }
        // if the size is 2 or less we do not to worry because we have already used it in above step
        // since 1st num we added was Integer.MAX, and we do not need to use that, so just do this
        // step if the size > 2 (basically there are at least 2 elements from the array)
        while (st.size > 2) {
            val smallestLeaf = st.pop()
            val smallerLeaf = st.peek()
            res += smallestLeaf * smallerLeaf
        }
        return res
    }
}