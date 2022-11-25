package g0301_0400.s0388_longest_absolute_file_path

// #Medium #String #Depth_First_Search #Stack
// #2022_11_24_Time_150_ms_(100.00%)_Space_33.6_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Deque

class Solution {
    fun lengthLongestPath(input: String): Int {
        val stack: Deque<Int> = ArrayDeque()
        var longestLen = 0
        var currDirLen = 0
        var i = 0
        var currLevel: Int
        var nextLevel = 0
        var isFile = false
        val period = '.'
        val space = ' '
        while (i < input.length) {
            currLevel = nextLevel
            var currStrLen = 0
            while (i < input.length &&
                (Character.isLetterOrDigit(input[i]) || period == input[i] || space == input[i])
            ) {
                if (period == input[i]) {
                    isFile = true
                }
                i++
                currStrLen++
            }
            if (isFile) {
                longestLen = Math.max(longestLen, currDirLen + currStrLen)
            } else {
                currDirLen += currStrLen + 1
                stack.push(currStrLen + 1)
            }
            nextLevel = 0
            // increment one to let it pass "\n" and start from "\t"
            i = i + 1
            while (i < input.length - 1 && input[i] == '\t') {
                nextLevel++
                i = i + 1
            }
            if (nextLevel < currLevel) {
                var j = 0
                if (isFile) {
                    while (!stack.isEmpty() && j < currLevel - nextLevel) {
                        currDirLen -= stack.pop()
                        j++
                    }
                } else {
                    while (!stack.isEmpty() && j <= currLevel - nextLevel) {
                        currDirLen -= stack.pop()
                        j++
                    }
                }
            } else if (nextLevel == currLevel && !isFile && !stack.isEmpty()) {
                currDirLen -= stack.pop()
            }
            if (nextLevel == 0) {
                currDirLen = 0
                stack.clear()
            }
            isFile = false
        }
        return longestLen
    }
}
