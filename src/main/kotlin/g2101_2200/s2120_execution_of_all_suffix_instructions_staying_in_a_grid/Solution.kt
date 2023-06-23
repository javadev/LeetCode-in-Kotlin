package g2101_2200.s2120_execution_of_all_suffix_instructions_staying_in_a_grid

// #Medium #String #Simulation
class Solution {
    fun executeInstructions(n: Int, startPos: IntArray, s: String): IntArray {
        val answer = IntArray(s.length)
        for (i in 0 until s.length) {
            var count = 0
            var currX = startPos[0]
            var currY = startPos[1]
            for (j in i until s.length) {
                val mv = s[j]
                if (mv == 'R') {
                    currY++
                    if (currY > n - 1) {
                        break
                    }
                } else if (mv == 'D') {
                    currX++
                    if (currX > n - 1) {
                        break
                    }
                } else if (mv == 'L') {
                    currY--
                    if (currY < 0) {
                        break
                    }
                } else if (mv == 'U') {
                    currX--
                    if (currX < 0) {
                        break
                    }
                }
                count++
            }
            answer[i] = count
        }
        return answer
    }
}
