package g0901_1000.s0990_satisfiability_of_equality_equations

// #Medium #Array #String #Graph #Union_Find
// #2023_05_11_Time_163_ms_(100.00%)_Space_37.6_MB_(100.00%)

class Solution {
    private lateinit var par: IntArray
    fun equationsPossible(equations: Array<String>): Boolean {
        var counter = 0
        val map: HashMap<Char, Int> = HashMap()
        for (str in equations) {
            var ch = str[0]
            if (!map.containsKey(ch)) {
                map[ch] = counter
                counter++
            }
            ch = str[3]
            if (!map.containsKey(ch)) {
                map[ch] = counter
                counter++
            }
        }
        par = IntArray(counter)
        for (i in par.indices) {
            par[i] = i
        }
        for (str in equations) {
            val oper = str.substring(1, 3)
            if (oper == "==") {
                val px = find(map[str[0]]!!)
                val py = find(map[str[3]]!!)
                if (px != py) {
                    par[px] = py
                }
            }
        }
        for (str in equations) {
            val oper = str.substring(1, 3)
            if (oper == "!=") {
                val px = find(map[str[0]]!!)
                val py = find(map[str[3]]!!)
                if (px == py) {
                    return false
                }
            }
        }
        return true
    }

    private fun find(x: Int): Int {
        if (par[x] == x) {
            return x
        }
        par[x] = find(par[x])
        return par[x]
    }
}
