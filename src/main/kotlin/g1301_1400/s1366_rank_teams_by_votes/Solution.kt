package g1301_1400.s1366_rank_teams_by_votes

import java.util.Arrays

// #Medium #Array #String #Hash_Table #Sorting #Counting
class Solution {
    internal class Node(var c: Char) {
        var count = IntArray(26)
    }

    fun rankTeams(votes: Array<String>): String {
        val nodes = arrayOfNulls<Node>(26)
        for (i in 0..25) {
            nodes[i] = Node((i + 'A'.code).toChar())
        }
        for (vote in votes) {
            for (i in 0 until vote.length) {
                nodes[vote[i].code - 'A'.code]!!.count[i]++
            }
        }
        Arrays.sort(
            nodes
        ) { o1: Node?, o2: Node? ->
            for (i in 0..25) {
                if (o1!!.count[i] != o2!!.count[i]) {
                    return@sort o2.count[i] - o1.count[i]
                }
            }
            o1!!.c.code - o2!!.c.code
        }
        val sb = StringBuilder()
        for (i in 0 until votes[0].length) {
            sb.append(nodes[i]!!.c)
        }
        return sb.toString()
    }
}
