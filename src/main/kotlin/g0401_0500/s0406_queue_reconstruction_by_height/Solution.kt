package g0401_0500.s0406_queue_reconstruction_by_height

// #Medium #Array #Sorting #Greedy #Segment_Tree #Binary_Indexed_Tree
// #2022_12_03_Time_306_ms_(100.00%)_Space_44.9_MB_(84.62%)

class Solution {
    fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
        return people.sortedWith(compareBy({ -it[0] }, { it[1] }))
            .fold(mutableListOf<IntArray>()) { output, p -> output.add(p[1], p); output }
            .toTypedArray()
    }
}
