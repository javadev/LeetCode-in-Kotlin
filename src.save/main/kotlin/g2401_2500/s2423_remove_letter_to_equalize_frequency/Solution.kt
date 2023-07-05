package g2401_2500.s2423_remove_letter_to_equalize_frequency

// #Easy #String #Hash_Table #Counting #2023_07_04_Time_135_ms_(100.00%)_Space_33.1_MB_(100.00%)

class Solution {
    private fun isValidWord(arr: IntArray): Boolean {
        var temp = 0
        for (j in 0..25) {
            if (arr[j] == 0) {
                continue
            }
            if (temp == 0) {
                temp = arr[j]
                continue
            }
            if (arr[j] != temp) {
                return false
            }
        }
        return true
    }

    fun equalFrequency(word: String): Boolean {
        var ans = false
        // frequency array
        val arr = IntArray(26)
        for (element in word) {
            arr[element.code - 'a'.code] += 1
        }
        for (i in 0..25) {
            if (arr[i] != 0) {
                arr[i] -= 1
                if (isValidWord(arr)) {
                    ans = true
                    break
                }
                arr[i] += 1
            }
        }
        return ans
    }
}
