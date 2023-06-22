package g2001_2100.s2024_maximize_the_confusion_of_an_exam

// #Medium #String #Binary_Search #Prefix_Sum #Sliding_Window
@Suppress("NAME_SHADOWING")
class Solution {
    fun maxConsecutiveAnswers(answerKey: String, k: Int): Int {
        var k = k
        var max: Int
        var right = 0
        val originalK = k
        while (k > 0 && right < answerKey.length) {
            if (answerKey[right] == 'T') {
                k--
            }
            right++
        }
        max = right
        var left = 0
        while (right < answerKey.length && left < answerKey.length) {
            if (answerKey[right] == 'F') {
                right++
                max = Math.max(max, right - left)
            } else {
                while (left < right && answerKey[left] == 'F') {
                    left++
                }
                left++
                right++
            }
        }
        right = 0
        k = originalK
        while (k > 0 && right < answerKey.length) {
            if (answerKey[right] == 'F') {
                k--
            }
            right++
        }
        max = Math.max(max, right)
        left = 0
        while (right < answerKey.length && left < answerKey.length) {
            if (answerKey[right] == 'T') {
                right++
                max = Math.max(max, right - left)
            } else {
                while (left < right && answerKey[left] == 'T') {
                    left++
                }
                left++
                right++
            }
        }
        return max
    }
}
