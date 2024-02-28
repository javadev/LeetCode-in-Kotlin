package g3001_3100.s3016_minimum_number_of_pushes_to_type_word_ii

// #Medium #String #Hash_Table #Sorting #Greedy #Breadth_First_Search #Graph #Prefix_Sum #Counting
// #2024_02_28_Time_290_ms_(92.00%)_Space_40_MB_(100.00%)

class Solution {
    fun minimumPushes(word: String): Int {
        val count = IntArray(26)
        val l = word.length
        for (i in 0 until l) {
            ++count[word[i].code - 'a'.code]
        }
        var j = 8
        var result = 0
        while (true) {
            var mi = 0
            for (i in 0..25) {
                if (count[mi] < count[i]) {
                    mi = i
                }
            }
            if (count[mi] == 0) {
                break
            }
            result += (j / 8) * count[mi]
            count[mi] = 0
            ++j
        }
        return result
    }
}
