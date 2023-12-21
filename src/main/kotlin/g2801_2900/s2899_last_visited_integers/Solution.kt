package g2801_2900.s2899_last_visited_integers

// #Easy #Array #String #Simulation #2023_12_21_Time_209_ms_(72.73%)_Space_37.7_MB_(72.73%)

class Solution {
    fun lastVisitedIntegers(words: List<String>): List<Int> {
        val prevEle: MutableList<String> = ArrayList()
        val res: MutableList<Int> = ArrayList()
        var count = 0
        for (i in words.indices) {
            if (words[i] != "prev") {
                count = 0
                prevEle.add(words[i])
                continue
            }
            if (count >= prevEle.size) {
                res.add(-1)
            } else {
                res.add(prevEle[prevEle.size - count - 1].toInt())
            }
            count++
        }
        return res
    }
}
