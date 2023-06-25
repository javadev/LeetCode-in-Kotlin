package g2101_2200.s2193_minimum_number_of_moves_to_make_palindrome

// #Hard #String #Greedy #Two_Pointers #Binary_Indexed_Tree
class Solution {
    fun minMovesToMakePalindrome(s: String): Int {
        var l = 0
        var r = s.length - 1
        val charArray = s.toCharArray()
        var output = 0
        while (l < r) {
            if (charArray[l] != charArray[r]) {
                val prev = charArray[l]
                var k = r
                while (charArray[k] != prev) {
                    k--
                }
                // middle element
                if (k == l) {
                    val temp = charArray[l]
                    charArray[l] = charArray[l + 1]
                    charArray[l + 1] = temp
                    output++
                    continue
                }
                for (i in k until r) {
                    val temp = charArray[i]
                    charArray[i] = charArray[i + 1]
                    charArray[i + 1] = temp
                    output++
                }
            }
            l++
            r--
        }
        return output
    }
}
