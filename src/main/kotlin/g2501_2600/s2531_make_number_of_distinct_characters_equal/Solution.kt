package g2501_2600.s2531_make_number_of_distinct_characters_equal

// #Medium #String #Hash_Table #Counting
class Solution {
    fun isItPossible(word1: String, word2: String): Boolean {
        val count1 = count(word1)
        val count2 = count(word2)
        val d = count1[26] - count2[26]
        val zip1 = zip(count1, count2)
        val zip2 = zip(count2, count1)
        for (i in 0..25) {
            val d1 = zip1[i]
            if (d1 == -1) {
                continue
            }
            for (j in 0..25) {
                val d2 = zip2[j]
                if (d2 == -1) {
                    continue
                }
                if (i == j) {
                    if (d == 0) {
                        return true
                    }
                    continue
                }
                if (d - d1 + d2 == 0) {
                    return true
                }
            }
        }
        return false
    }

    private fun zip(c1: IntArray, c2: IntArray): IntArray {
        val zip = IntArray(26)
        for (i in 0..25) {
            var d = 0
            if (c1[i] == 0) {
                d = -1
            } else {
                if (c2[i] == 0) {
                    d++
                }
                if (c1[i] == 1) {
                    d++
                }
            }
            zip[i] = d
        }
        return zip
    }

    private fun count(word: String): IntArray {
        val count = IntArray(27)
        val len = word.length
        for (i in 0 until len) {
            count[word[i].code - 'a'.code]++
        }
        for (i in 0..25) {
            if (count[i] > 0) {
                count[26]++
            }
        }
        return count
    }
}
