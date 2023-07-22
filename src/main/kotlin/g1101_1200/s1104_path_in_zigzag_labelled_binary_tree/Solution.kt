package g1101_1200.s1104_path_in_zigzag_labelled_binary_tree

// #Medium #Math #Tree #Binary_Tree #2023_05_31_Time_136_ms_(100.00%)_Space_34.1_MB_(100.00%)

import java.util.LinkedList

@Suppress("NAME_SHADOWING")
class Solution {
    fun pathInZigZagTree(label: Int): List<Int> {
        var label = label
        val answer: MutableList<Int> = LinkedList()
        while (label != 0) {
            answer.add(0, label)
            val logNode = (Math.log(label.toDouble()) / Math.log(2.0)).toInt()
            val levelStart = Math.pow(2.0, logNode.toDouble()).toInt()
            val diff = label - levelStart
            val d2 = diff / 2
            val prevEnd = levelStart - 1
            val prevLabel = prevEnd - d2
            label = prevLabel
        }
        return answer
    }
}
