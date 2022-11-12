package g0301_0400.s0316_remove_duplicate_letters

// #Medium #String #Greedy #Stack #Monotonic_Stack
// #2022_11_10_Time_291_ms_(81.82%)_Space_35.2_MB_(100.00%)

class Solution {
    fun removeDuplicateLetters(s: String): String {
        val charCount = IntArray(26)
        val charAdded = BooleanArray(26)
        // Build the char count array
        for (c in s.toCharArray()) {
            charCount[c.code - 'a'.code] += 1
        }
        val sb = StringBuilder()
        // i = index of the input string
        // j = index of the output stringBuilder
        var j = 0
        for (i in 0 until s.length) {
            val curr = s[i]
            // If the curr char is NOT already added in the final string
            if (!charAdded[curr.code - 'a'.code]) {
                // If the prev char in final string is lexicographically greater than curr char of
                // input string
                // And there are more characters in charCount array then we can remove this prev
                // char from final string
                // Do this check iteratively until all characters are removed from the final string
                // or prev char < curr char
                while (j > 0 && sb[j - 1] > curr && charCount[sb[j - 1].code - 'a'.code] > 0) {
                    charAdded[sb[j - 1].code - 'a'.code] = false
                    sb.deleteCharAt(j - 1)
                    j--
                }
                // Add the curr char in final string and mark that character as added in the string
                sb.append(curr)
                charAdded[curr.code - 'a'.code] = true
                j++
            }
            // Reduce the count of the current character from the charCount array
            charCount[curr.code - 'a'.code] -= 1
        }
        return sb.toString()
    }
}
