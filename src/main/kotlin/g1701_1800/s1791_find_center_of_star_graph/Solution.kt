package g1701_1800.s1791_find_center_of_star_graph

// #Easy #Graph #2023_06_18_Time_476_ms_(91.67%)_Space_69.6_MB_(95.83%)

class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        return if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            edges[0][0]
        } else {
            edges[0][1]
        }
    }
}
