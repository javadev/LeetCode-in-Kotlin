package g2001_2100.s2002_maximum_product_of_the_length_of_two_palindromic_subsequences

// #Medium #String #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
class Solution {
    fun maxProduct(s: String): Int {
        if (s.length == 2) {
            return 1
        }
        val list: MutableList<State> = ArrayList()
        val chars = s.toCharArray()
        val visited: MutableSet<State> = HashSet()
        for (i in chars.indices) {
            val mask = 1 shl i
            recur(chars, State(i, i, 0, mask), list, visited)
            recur(chars, State(i, i + 1, 0, mask), list, visited)
        }
        list.sortWith(java.util.Comparator { a: State, b: State -> b.cnt - a.cnt })
        var res = 1
        val explored: MutableSet<Int> = HashSet()
        for (i in 0 until list.size - 1) {
            if (explored.contains(i)) {
                continue
            }
            val cur = list[i]
            if (cur.cnt == 1) {
                break
            }
            for (j in i + 1 until list.size) {
                val cand = list[j]
                if (cur.mask and cand.mask < 1) {
                    if (explored.add(j)) {
                        res = Math.max(res, cur.cnt * cand.cnt)
                    }
                    break
                }
            }
        }
        return res
    }

    private fun recur(chars: CharArray, s: State, list: MutableList<State>, visited: MutableSet<State>) {
        if (s.i < 0 || s.j >= chars.size) {
            return
        }
        if (!visited.add(s)) {
            return
        }
        if (chars[s.i] == chars[s.j]) {
            val m = s.mask or (1 shl s.i) or (1 shl s.j)
            val nextCnt = s.cnt + if (s.i < s.j) 2 else 1
            list.add(State(s.i, s.j, nextCnt, m))
            recur(chars, State(s.i - 1, s.j + 1, nextCnt, m), list, visited)
        }
        recur(chars, State(s.i - 1, s.j, s.cnt, s.mask), list, visited)
        recur(chars, State(s.i, s.j + 1, s.cnt, s.mask), list, visited)
    }

    private class State(var i: Int, var j: Int, var cnt: Int, var mask: Int) {
        override fun equals(other: Any?): Boolean {
            if (other == null || other.javaClass != this.javaClass) {
                return false
            }
            val s = other as State
            return i == s.i && j == s.j && mask == s.mask
        }

        override fun hashCode(): Int {
            return (i * 31 + j) * 31 + mask
        }
    }
}
