package g2301_2400.s2325_decode_the_message

// #Easy #String #Hash_Table #2023_06_30_Time_169_ms_(96.88%)_Space_35.4_MB_(100.00%)

class Solution {
    fun decodeMessage(key: String, message: String): String {
        val sb = StringBuilder()
        val temp: MutableMap<Char, Char> = HashMap()
        val alphabet = CharArray(26)
        var itr = 0
        var c = 'a'
        while (c <= 'z') {
            alphabet[c.toInt() - 'a'.toInt()] = c
            ++c
        }
        for (i in key.indices) {
            if (!temp.containsKey(key[i]) && key[i] != ' ') {
                temp[key[i]] = alphabet[itr++]
            }
        }
        for (j in message.indices) {
            if (message[j] == ' ') {
                sb.append(' ')
            } else {
                val result = temp[message[j]]!!
                sb.append(result)
            }
        }
        return sb.toString()
    }
}
