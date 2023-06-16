package g1701_1800.s1791_find_center_of_star_graph

// #Easy #Graph
class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        return if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            edges[0][0]
        } else edges[0][1]
    }
}
