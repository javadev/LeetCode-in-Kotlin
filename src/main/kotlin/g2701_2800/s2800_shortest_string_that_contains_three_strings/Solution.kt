package g2701_2800.s2800_shortest_string_that_contains_three_strings

// #Medium #String #Greedy #Enumeration #2023_08_06_Time_259_ms_(100.00%)_Space_38_MB_(100.00%)

class Solution {
    fun minimumString(a: String, b: String, c: String): String {
        val ar = a.toCharArray()
        val br = b.toCharArray()
        val cr = c.toCharArray()
        return String(
            getSmaller(
                combine(ar, br, cr),
                getSmaller(
                    combine(ar, cr, br),
                    getSmaller(
                        combine(br, ar, cr),
                        getSmaller(
                            combine(br, cr, ar),
                            getSmaller(combine(cr, ar, br), combine(cr, br, ar))
                        )
                    )
                )
            )
        )
    }

    private fun combine(a: CharArray, b: CharArray, c: CharArray): CharArray {
        return combine(combine(a, b), c)
    }

    private fun combine(a: CharArray, b: CharArray): CharArray {
        var insertIndex = a.size
        for (i in a.indices) {
            if (a[i] == b[0]) {
                var ii = i + 1
                var match = 1
                var j = 1
                while (j < b.size && ii < a.size) {
                    if (a[ii] == b[j]) match++ else break
                    ii++
                    ++j
                }
                if (match == b.size) {
                    return a
                } else if (match == a.size - i) {
                    insertIndex = i
                    break
                }
            }
        }
        val tmp = CharArray(b.size + insertIndex)
        for (i in 0 until insertIndex) tmp[i] = a[i]
        for (i in b.indices) tmp[i + insertIndex] = b[i]
        return tmp
    }

    private fun getSmaller(res: CharArray, test: CharArray): CharArray {
        if (res.size > test.size) return test else if (res.size < test.size) return res else {
            for (i in res.indices) {
                if (res[i] > test[i]) return test else if (res[i] < test[i]) return res
            }
        }
        return res
    }
}
