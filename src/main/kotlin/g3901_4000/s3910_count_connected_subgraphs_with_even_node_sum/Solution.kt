package g3901_4000.s3910_count_connected_subgraphs_with_even_node_sum

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Bit_Manipulation #Union_Find #Enumeration
// #Graph_Theory #Senior_Staff #Biweekly_Contest_181
// #2026_09_18_Time_2_ms_(100.00%)_Space_46.57_MB_(85.71%)

class Solution {
    private lateinit var graph: LongArray
    private lateinit var nums: IntArray
    private var validCount = 0

    fun evenSumSubgraphs(nums: IntArray, edges: Array<IntArray>): Int {
        this.nums = nums
        val nodeCount = nums.size
        this.graph = LongArray(nodeCount)
        this.validCount = 0
        buildGraph(edges)
        for (root in 0..<nodeCount) {
            val rootMask = 1L shl root
            val allowedMask = -(1L shl root)
            val candidateMask = graph[root] and allowedMask
            search(rootMask, candidateMask, 0L, nums[root] and 1, allowedMask)
        }
        return validCount
    }

    private fun buildGraph(edgeList: Array<IntArray>) {
        for (edge in edgeList) {
            val firstNode = edge[0]
            val secondNode = edge[1]
            graph[firstNode] = graph[firstNode] or (1L shl secondNode)
            graph[secondNode] = graph[secondNode] or (1L shl firstNode)
        }
    }

    private fun search(selectedMask: Long, candidateMask: Long, excludedMask: Long, parity: Int, allowedMask: Long) {
        var candidateMask = candidateMask
        var excludedMask = excludedMask
        if (parity == 0) {
            validCount++
        }
        while (candidateMask != 0L) {
            val currentBit = candidateMask and -candidateMask
            val currentNode = java.lang.Long.numberOfTrailingZeros(currentBit)
            candidateMask = candidateMask xor currentBit
            val nextSelectedMask = selectedMask or currentBit
            val nextCandidateMask =
                (
                    candidateMask
                        or (
                            graph[currentNode]
                                and allowedMask
                                and nextSelectedMask.inv()
                                and excludedMask.inv()
                            )
                    )
            search(
                nextSelectedMask,
                nextCandidateMask,
                excludedMask,
                parity xor (nums[currentNode] and 1),
                allowedMask,
            )
            excludedMask = excludedMask or currentBit
        }
    }
}
