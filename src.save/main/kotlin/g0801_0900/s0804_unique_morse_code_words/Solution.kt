package g0801_0900.s0804_unique_morse_code_words

// #Easy #Array #String #Hash_Table #2023_03_16_Time_158_ms_(80.00%)_Space_34.9_MB_(65.71%)

class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val morse = arrayOf(
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        )
        val set: MutableSet<String> = HashSet()
        for (word in words) {
            val temp = StringBuilder()
            for (c in word.toCharArray()) {
                temp.append(morse[c.code - 'a'.code])
            }
            set.add(temp.toString())
        }
        return set.size
    }
}
