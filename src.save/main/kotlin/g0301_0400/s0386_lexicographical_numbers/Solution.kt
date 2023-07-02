package g0301_0400.s0386_lexicographical_numbers

// #Medium #Depth_First_Search #Trie #2022_11_24_Time_463_ms_(83.33%)_Space_57_MB_(33.33%)

class Solution {
    fun lexicalOrder(n: Int): List<Int> {
        val list = ArrayList<Int>()
        fun recursion(x: Int) {
            if (x > n) return
            list.add(x)
            for (i in 0..9) {
                recursion(x * 10 + i)
            }
        }
        for (i in 1..9) {
            recursion(i)
        }
        return list
    }
}
