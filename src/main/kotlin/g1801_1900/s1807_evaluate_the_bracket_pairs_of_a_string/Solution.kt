package g1801_1900.s1807_evaluate_the_bracket_pairs_of_a_string

// #Medium #Array #String #Hash_Table #2023_06_19_Time_689_ms_(100.00%)_Space_101.8_MB_(100.00%)

class Solution {
    fun evaluate(s: String, knowledge: List<List<String>>): String {
        val knowledgeMapper: MutableMap<String, String> = HashMap()
        for (pair in knowledge) {
            knowledgeMapper[pair[0]] = pair[1]
        }
        val answer = StringBuilder()
        var i = 0
        while (i < s.length) {
            var letter = s[i]
            if (letter == '(') {
                val key = StringBuilder()
                letter = s[++i]
                while (letter != ')') {
                    key.append(letter)
                    letter = s[++i]
                }
                answer.append(knowledgeMapper.getOrDefault(key.toString(), "?"))
            } else {
                answer.append(letter)
            }
            i++
        }
        return answer.toString()
    }
}
