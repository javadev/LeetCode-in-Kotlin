package g0901_1000.s0943_find_the_shortest_superstring

// #Hard #Array #String #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2023_04_29_Time_1290_ms_(100.00%)_Space_309.3_MB_(100.00%)

class Solution {
    fun shortestSuperstring(words: Array<String>): String? {
        val l = words.size
        var state = 0
        for (i in 0 until l) {
            state = state or (1 shl i)
        }
        val map: MutableMap<String?, String?> = HashMap()
        return solveTPS(words, state, "", map, l)
    }

    private fun solveTPS(
        words: Array<String>,
        state: Int,
        startWord: String,
        map: MutableMap<String?, String?>,
        l: Int,
    ): String? {
        val key = "$startWord|$state"
        if (state == 0) {
            return startWord
        }
        if (map[key] != null) {
            return map[key]
        }
        var minLenWord: String? = ""
        for (i in 0 until l) {
            if (state shr i and 1 == 1) {
                val takenState = state and (1 shl i).inv()
                val result = solveTPS(words, takenState, words[i], map, l)
                val tmp = mergeAndGet(startWord, result)
                if (minLenWord!!.isEmpty() || minLenWord.length > tmp.length) {
                    minLenWord = tmp
                }
            }
        }
        map[key] = minLenWord
        return minLenWord
    }

    private fun mergeAndGet(word: String, result: String?): String {
        val l = word.length
        val t = result!!.length
        if (result.contains(word)) {
            return result
        }
        if (word.contains(result)) {
            return word
        }
        var found = l
        for (k in 0 until l) {
            var i = k
            var j = 0
            while (i < l && j < t) {
                if (word[i] == result[j]) {
                    i++
                    j++
                } else {
                    break
                }
            }
            if (i == l) {
                found = k
                break
            }
        }
        return word.substring(0, found) + result
    }
}
