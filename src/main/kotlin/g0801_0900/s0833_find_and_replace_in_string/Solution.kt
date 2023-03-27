package g0801_0900.s0833_find_and_replace_in_string

// #Medium #Array #String #Sorting #2023_03_27_Time_158_ms_(100.00%)_Space_35.4_MB_(100.00%)

class Solution {
    fun findReplaceString(s: String, indices: IntArray, sources: Array<String>, targets: Array<String?>): String {
        val sb = StringBuilder()
        val stringIndexToKIndex: MutableMap<Int, Int> = HashMap()
        for (i in indices.indices) {
            stringIndexToKIndex[indices[i]] = i
        }
        var indexIntoS = 0
        while (indexIntoS < s.length) {
            if (stringIndexToKIndex.containsKey(indexIntoS)) {
                val substringInSources = sources[stringIndexToKIndex[indexIntoS]!!]
                if (indexIntoS + substringInSources.length <= s.length) {
                    val substringInS = s.substring(indexIntoS, indexIntoS + substringInSources.length)
                    if (substringInS == substringInSources) {
                        sb.append(targets[stringIndexToKIndex[indexIntoS]!!])
                        indexIntoS += substringInS.length - 1
                    } else {
                        sb.append(s[indexIntoS])
                    }
                } else {
                    sb.append(s[indexIntoS])
                }
            } else {
                sb.append(s[indexIntoS])
            }
            indexIntoS++
        }
        return sb.toString()
    }
}
