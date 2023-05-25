package g0701_0800.s0722_remove_comments

// #Medium #Array #String #2023_02_28_Time_164_ms_(100.00%)_Space_35.4_MB_(100.00%)

class Solution {
    fun removeComments(source: Array<String>): List<String> {
        val result: MutableList<String> = ArrayList()
        val sb = StringBuilder()
        var multiComment = false
        for (line in source) {
            val n = line.length
            var index = 0
            while (index < n) {
                val ch = line[index]
                if (!multiComment && ch == '/') {
                    index++
                    if (index >= n) {
                        sb.append(ch)
                        continue
                    }
                    if (line[index] == '/') {
                        break
                    } else if (line[index] == '*') {
                        multiComment = true
                    } else {
                        sb.append(ch).append(line[index])
                    }
                } else if (multiComment && ch == '*') {
                    index++
                    if (index >= n) {
                        continue
                    }
                    if (line[index] == '/') {
                        multiComment = false
                    } else {
                        index--
                    }
                } else if (!multiComment) {
                    sb.append(ch)
                }
                index++
            }
            if (sb.isNotEmpty() && !multiComment) {
                result.add(sb.toString())
                sb.setLength(0)
            }
        }
        return result
    }
}
