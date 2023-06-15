package g1601_1700.s1686_stone_game_vi

import java.util.PriorityQueue

// #Medium #Array #Math #Sorting #Greedy #Heap_Priority_Queue #Game_Theory
class Solution {
    private class Pair internal constructor(var a: Int, var b: Int) : Comparable<Pair> {
        var sum: Int

        init {
            sum = a + b
        }

        override fun compareTo(p: Pair): Int {
            return p.sum - sum
        }
    }

    fun stoneGameVI(aliceValues: IntArray, bobValues: IntArray): Int {
        val pq = PriorityQueue<Pair>()
        for (i in aliceValues.indices) {
            pq.add(Pair(aliceValues[i], bobValues[i]))
        }
        var turn = true
        var a = 0
        var b = 0
        while (!pq.isEmpty()) {
            if (turn) {
                a += pq.poll().a
            } else {
                b += pq.poll().b
            }
            turn = !turn
        }
        return Integer.compare(a, b)
    }
}
