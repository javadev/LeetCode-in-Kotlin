package g2201_2300.s2227_encrypt_and_decrypt_strings

// #Hard #Array #String #Hash_Table #Design #Trie
// #2023_06_27_Time_483_ms_(75.00%)_Space_54.4_MB_(100.00%)

class Encrypter(keys: CharArray, values: Array<String>, dictionary: Array<String>) {
    private val eMap: MutableMap<Char, String>
    private val dMap: MutableMap<String, Int>

    init {
        eMap = HashMap()
        dMap = HashMap()
        for (i in keys.indices) {
            eMap[keys[i]] = values[i]
        }
        for (s in dictionary) {
            val str = encrypt(s)
            if (str != "" && str != "null") {
                dMap[str] = dMap.getOrDefault(str, 0) + 1
            }
        }
    }

    fun encrypt(word1: String): String {
        val sb = StringBuilder()
        for (c in word1.toCharArray()) {
            sb.append(eMap[c])
        }
        return sb.toString()
    }

    fun decrypt(word2: String): Int {
        return dMap.getOrDefault(word2, 0)
    }
}
/*
 * Your Encrypter object will be instantiated and called as such:
 * var obj = Encrypter(keys, values, dictionary)
 * var param_1 = obj.encrypt(word1)
 * var param_2 = obj.decrypt(word2)
 */
