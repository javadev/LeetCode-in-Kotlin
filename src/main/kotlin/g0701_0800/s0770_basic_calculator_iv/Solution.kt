package g0701_0800.s0770_basic_calculator_iv

// #Hard #String #Hash_Table #Math #Stack #Recursion
// #2023_03_10_Time_222_ms_(100.00%)_Space_39.2_MB_(100.00%)

import java.util.Collections

class Solution {
    internal inner class Node {
        var mem: MutableMap<List<String>, Int> = HashMap()
        fun update(cur: List<String>, cnt: Int) {
            Collections.sort(cur)
            mem[cur] = mem.getOrDefault(cur, 0) + cnt
        }

        fun add(cur: Node): Node {
            val ans = Node()
            for (key1 in mem.keys) {
                ans.update(key1, mem[key1]!!)
            }
            for (key2 in cur.mem.keys) {
                ans.update(key2, cur.mem[key2]!!)
            }
            return ans
        }

        fun sub(cur: Node): Node {
            val ans = Node()
            for (key1 in mem.keys) {
                ans.update(key1, mem[key1]!!)
            }
            for (key2 in cur.mem.keys) {
                ans.update(key2, -cur.mem[key2]!!)
            }
            return ans
        }

        fun mul(cur: Node): Node {
            val ans = Node()
            for (key1 in mem.keys) {
                for (key2 in cur.mem.keys) {
                    val next: MutableList<String> = ArrayList()
                    next.addAll(key1)
                    next.addAll(key2)
                    ans.update(next, mem[key1]!! * cur.mem[key2]!!)
                }
            }
            return ans
        }

        fun evaluate(vars: Map<String?, Int>): Node {
            val ans = Node()
            for (cur in mem.keys) {
                var cnt = mem[cur]!!
                val free: MutableList<String> = ArrayList()
                for (tmp in cur) {
                    if (vars.containsKey(tmp)) {
                        cnt *= vars[tmp]!!
                    } else {
                        free.add(tmp)
                    }
                }
                ans.update(free, cnt)
            }
            return ans
        }

        fun toList(): List<String> {
            val ans: MutableList<String> = ArrayList()
            val keys: List<List<String>> = ArrayList(mem.keys)
            Collections.sort(
                keys,
            ) { a: List<String>, b: List<String> ->
                if (a.size != b.size) {
                    return@sort b.size - a.size
                }
                for (i in a.indices) {
                    if (a[i].compareTo(b[i]) != 0) {
                        return@sort a[i].compareTo(b[i])
                    }
                }
                0
            }
            for (key in keys) {
                if (mem[key] == 0) {
                    continue
                }
                var cur = "" + mem[key].toString()
                for (data in key) {
                    cur += "*"
                    cur += data
                }
                ans.add(cur)
            }
            return ans
        }
    }

    private fun make(cur: String): Node {
        val ans = Node()
        val tmp: MutableList<String> = ArrayList()
        if (Character.isDigit(cur[0])) {
            ans.update(tmp, Integer.valueOf(cur))
        } else {
            tmp.add(cur)
            ans.update(tmp, 1)
        }
        return ans
    }

    private fun getNext(expression: String, start: Int): Int {
        var end = start
        while (end < expression.length && Character.isLetterOrDigit(expression[end])) {
            end++
        }
        return end - 1
    }

    private fun getPriority(a: Char): Int {
        if (a == '+' || a == '-') {
            return 1
        } else if (a == '*') {
            return 2
        }
        return 0
    }

    private fun helper(numS: ArrayDeque<Node>, ops: ArrayDeque<Char>): Node {
        val b = numS.removeLast()
        val a = numS.removeLast()
        val op = ops.removeLast()
        if (op == '*') {
            return a.mul(b)
        } else if (op == '+') {
            return a.add(b)
        }
        return a.sub(b)
    }

    fun basicCalculatorIV(expression: String?, evalvarS: Array<String?>?, evalintS: IntArray?): List<String> {
        val ans: List<String> = ArrayList()
        if (expression.isNullOrEmpty() || evalvarS == null || evalintS == null) {
            return ans
        }
        val vars: MutableMap<String?, Int> = HashMap()
        for (i in evalvarS.indices) {
            vars[evalvarS[i]] = evalintS[i]
        }
        val n = expression.length
        val numS = ArrayDeque<Node>()
        val ops = ArrayDeque<Char>()
        var i = 0
        while (i < n) {
            val a = expression[i]
            if (Character.isLetterOrDigit(a)) {
                val end = getNext(expression, i)
                val cur = expression.substring(i, end + 1)
                i = end
                val now = make(cur)
                numS.add(now)
            } else if (a == '(') {
                ops.add(a)
            } else if (a == ')') {
                while (ops.last() != '(') {
                    numS.add(helper(numS, ops))
                }
                ops.removeLast()
            } else if (a == '+' || a == '-' || a == '*') {
                while (ops.isNotEmpty() && getPriority(ops.last()) >= getPriority(a)) {
                    numS.add(helper(numS, ops))
                }
                ops.add(a)
            }
            i++
        }
        while (ops.isNotEmpty()) {
            numS.add(helper(numS, ops))
        }
        return numS.last().evaluate(vars).toList()
    }
}
