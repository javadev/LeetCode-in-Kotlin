package g3301_3400.s3324_find_the_sequence_of_strings_appeared_on_the_screen

// #Medium #String #Simulation #2024_10_22_Time_8_ms_(100.00%)_Space_62.7_MB_(29.63%)

class Solution {
    fun stringSequence(target: String): List<String> {
        val ans: MutableList<String> = ArrayList<String>()
        val l = target.length
        val cur = StringBuilder()
        for (i in 0 until l) {
            val tCh = target[i]
            cur.append('a')
            ans.add(cur.toString())
            while (cur.get(i) != tCh) {
                val lastCh = cur.get(i)
                val nextCh = (if (lastCh == 'z') 'a'.code else lastCh.code + 1).toChar()
                cur.setCharAt(i, nextCh)
                ans.add(cur.toString())
            }
        }
        return ans
    }
}
