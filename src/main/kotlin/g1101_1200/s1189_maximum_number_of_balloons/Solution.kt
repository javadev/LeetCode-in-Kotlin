package g1101_1200.s1189_maximum_number_of_balloons

// #Easy #String #Hash_Table #Counting

class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        val counts = IntArray(26)
        for (c in text.toCharArray()) {
            counts[c.code - 'a'.code]++
        }
        return Math.min(
            counts[0],
            Math.min(
                counts[1], Math.min(counts[11] / 2, Math.min(counts[14] / 2, counts[13]))
            )
        )
    }
}
