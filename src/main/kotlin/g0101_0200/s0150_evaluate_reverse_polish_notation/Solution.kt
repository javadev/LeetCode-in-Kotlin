package g0101_0200.s0150_evaluate_reverse_polish_notation

// #Medium #Top_Interview_Questions #Array #Math #Stack #Programming_Skills_II_Day_3
// #2022_10_09_Time_233_ms_(88.82%)_Space_36.7_MB_(91.45%)

import java.util.function.BiFunction

class Solution {
    val op = mapOf<String, BiFunction<Int, Int, Int>>(
        "/" to BiFunction { a, b -> a / b },
        "*" to BiFunction { a, b -> a * b },
        "+" to BiFunction { a, b -> a + b },
        "-" to BiFunction { a, b -> a - b }
    )
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayDeque<String>()
        for (t in tokens) {
            if (op.contains(t)) {
                val b = stack.removeFirst().toInt()
                val a = stack.removeFirst().toInt()
                val c = op[t]!!.apply(a, b)
                stack.addFirst(c.toString())
            } else {
                stack.addFirst(t)
            }
        }
        return stack.removeFirst().toInt()
    }
}
