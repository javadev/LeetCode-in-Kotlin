package g1401_1500.s1410_html_entity_parser

// #Medium #String #Hash_Table #2023_06_07_Time_334_ms_(100.00%)_Space_38.6_MB_(100.00%)

class Solution {
    fun entityParser(text: String): String {
        val map: MutableMap<String, String> = HashMap()
        map["&quot;"] = "\""
        map["&apos;"] = "'"
        map["&amp;"] = "&"
        map["&gt;"] = ">"
        map["&lt;"] = "<"
        map["&frasl;"] = "/"
        val n = text.length
        val sb = StringBuilder()
        var i = 0
        while (i < n) {
            val c = text[i]
            if (c == '&') {
                val index = text.indexOf(";", i)
                if (index >= 0) {
                    val pattern = text.substring(i, index + 1)
                    if (map.containsKey(pattern)) {
                        sb.append(map[pattern])
                        i += pattern.length
                        continue
                    }
                }
            }
            sb.append(c)
            i++
        }
        return sb.toString()
    }
}
