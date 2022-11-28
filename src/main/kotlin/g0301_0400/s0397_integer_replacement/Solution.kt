package g0301_0400.s0397_integer_replacement

// #Medium #Dynamic_Programming #Greedy #Bit_Manipulation #Memoization
// #2022_11_28_Time_145_ms_(87.50%)_Space_33.1_MB_(87.50%)

import java.util.LinkedList

class Solution {
    fun integerReplacement(n: Int): Int {
        if (n == 1) return 0

        val num = n.toLong()
        val queue = LinkedList<Long>()
        val seen = HashSet<Long>()
        if (n % 2 == 0) {
            queue.offer(num / 2)
            seen.add(num / 2)
        } else {
            queue.offer(num + 1)
            seen.add(num + 1)

            queue.offer(num - 1)
            seen.add(num - 1)
        }

        var steps = 1

        while (queue.isNotEmpty()) {
            val size = queue.size

            for (sz in 0 until size) {
                val cur = queue.poll()

                if (cur == 1L) return steps

                if (cur % 2 == 0L) {
                    val next = cur / 2
                    if (seen.add(next)) {
                        queue.offer(next)
                    }
                } else {
                    val next1 = cur + 1
                    if (seen.add(next1)) {
                        queue.offer(next1)
                    }

                    val next2 = cur - 1
                    if (seen.add(next2)) {
                        queue.offer(next2)
                    }
                }
            }

            ++steps
        }

        return steps
    }
}
