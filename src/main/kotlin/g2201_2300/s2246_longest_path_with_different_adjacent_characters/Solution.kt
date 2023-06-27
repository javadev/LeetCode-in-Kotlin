package g2201_2300.s2246_longest_path_with_different_adjacent_characters

// #Hard #Array #String #Depth_First_Search #Tree #Graph #Topological_Sort
// #2023_06_27_Time_828_ms_(100.00%)_Space_53.3_MB_(100.00%)

import java.util.LinkedList

class Solution {
    fun longestPath(parent: IntArray, s: String): Int {
        // for first max length
        val first = IntArray(s.length)
        first.fill(0)
        // for second max length
        val second = IntArray(s.length)
        second.fill(0)
        // for number of children for this node
        val children = IntArray(s.length)
        children.fill(0)
        for (i in 1 until s.length) {
            // calculate all children for each node
            children[parent[i]]++
        }
        // for traversal from leafs to root
        val st = LinkedList<Int>()
        // put all leafs
        for (i in 1 until s.length) {
            if (children[i] == 0) {
                st.add(i)
            }
        }
        // traversal from leafs to root
        while (st.isNotEmpty()) {
            // fetch current node
            val i = st.pollLast()
            // if we in root - ignore it
            if (i == 0) {
                continue
            }
            if (--children[parent[i]] == 0) {
                // decrease number of children by parent node and if number of children
                st.add(parent[i])
            }
            // is equal 0 - our parent became a leaf
            // if letters isn't equal
            if (s[parent[i]] != s[i]) {
                // fetch maximal path from node
                val maxi = 1 + Math.max(first[i], second[i])
                // and update maximal first and second path from parent
                if (maxi >= first[parent[i]]) {
                    second[parent[i]] = first[parent[i]]
                    first[parent[i]] = maxi
                } else if (second[parent[i]] < maxi) {
                    second[parent[i]] = maxi
                }
            }
        }
        // fetch answer
        var ans = 0
        for (i in 0 until s.length) {
            ans = Math.max(ans, first[i] + second[i])
        }
        return ans + 1
    }
}
