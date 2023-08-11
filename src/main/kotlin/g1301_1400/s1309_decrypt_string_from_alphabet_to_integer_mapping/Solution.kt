package g1301_1400.s1309_decrypt_string_from_alphabet_to_integer_mapping

// #Easy #String #Programming_Skills_I_Day_9_String
// #2023_06_05_Time_129_ms_(95.45%)_Space_34.8_MB_(63.64%)

class Solution {
    fun freqAlphabets(s: String): String {
        val map: MutableMap<String, String> = HashMap()
        map["1"] = "a"
        map["2"] = "b"
        map["3"] = "c"
        map["4"] = "d"
        map["5"] = "e"
        map["6"] = "f"
        map["7"] = "g"
        map["8"] = "h"
        map["9"] = "i"
        map["10#"] = "j"
        map["11#"] = "k"
        map["12#"] = "l"
        map["13#"] = "m"
        map["14#"] = "n"
        map["15#"] = "o"
        map["16#"] = "p"
        map["17#"] = "q"
        map["18#"] = "r"
        map["19#"] = "s"
        map["20#"] = "t"
        map["21#"] = "u"
        map["22#"] = "v"
        map["23#"] = "w"
        map["24#"] = "x"
        map["25#"] = "y"
        map["26#"] = "z"
        val sb = StringBuilder()
        var i = 0
        while (i < s.length) {
            if ((("" + s[i]).toInt() == 1 || ("" + s[i]).toInt() == 2) &&
                i + 1 < s.length && i + 2 < s.length &&
                s[i + 2] == '#'
            ) {
                sb.append(map[s.substring(i, i + 3)])
                i += 3
            } else {
                sb.append(map["" + s[i]])
                i++
            }
        }
        return sb.toString()
    }
}
