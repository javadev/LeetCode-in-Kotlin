package g0701_0800.s0736_parse_lisp_expression

// #Hard #String #Hash_Table #Stack #Recursion
// #2023_03_03_Time_172_ms_(100.00%)_Space_35.9_MB_(100.00%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    internal class Exp(from: Exp?) {
        var exps: Deque<Exp> = LinkedList()
        var op: String? = null
        var parent: Exp?

        init {
            parent = from
        }

        fun evaluate(vars: Map<String?, Int>): Int {
            return if (op.equals("add", ignoreCase = true)) {
                exps.pop().evaluate(vars) + exps.pop().evaluate(vars)
            } else if (op.equals("mult", ignoreCase = true)) {
                exps.pop().evaluate(vars) * exps.pop().evaluate(vars)
            } else if (op.equals("let", ignoreCase = true)) {
                val nextVars: MutableMap<String?, Int> = HashMap(vars)
                while (exps.size > 1) {
                    val varName = exps.pop().op
                    val `val` = exps.pop().evaluate(nextVars)
                    nextVars[varName] = `val`
                }
                exps.pop().evaluate(nextVars)
            } else {
                if (Character.isLetter(op!![0])) {
                    vars[op]!!
                } else {
                    op!!.toInt()
                }
            }
        }
    }

    private fun buildTree(exp: String): Exp {
        val root = Exp(null)
        var cur: Exp? = root
        var n = exp.length - 1
        while (n >= 0) {
            val c = exp[n]
            if (c == ')') {
                val next = Exp(cur)
                cur!!.exps.push(next)
                cur = next
            } else if (c == '(') {
                cur!!.op = cur.exps.pop().op
                cur = cur.parent
            } else if (c != ' ') {
                var pre = n
                while (pre >= 0 && exp[pre] != '(' && exp[pre] != ' ') {
                    pre--
                }
                val next = Exp(cur)
                next.op = exp.substring(pre + 1, n + 1)
                cur!!.exps.push(next)
                n = pre + 1
            }
            n--
        }
        return root.exps.pop()
    }

    fun evaluate(exp: String): Int {
        return buildTree(exp).evaluate(HashMap())
    }
}
