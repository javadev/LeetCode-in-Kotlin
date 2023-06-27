package g2201_2300.s2201_count_artifacts_that_can_be_extracted

// #Medium #Array #Hash_Table #Simulation
// #2023_06_27_Time_1011_ms_(100.00%)_Space_108.8_MB_(100.00%)

class Solution {
    fun digArtifacts(n: Int, artifacts: Array<IntArray>, dig: Array<IntArray>): Int {
        val ar = Array(n) { IntArray(n) }
        for (ints in dig) {
            ar[ints[0]][ints[1]] = 1
        }
        var ans = 0
        for (artifact in artifacts) {
            val x1 = artifact[0]
            val y1 = artifact[1]
            val x2 = artifact[2]
            val y2 = artifact[3]
            var flag = 0
            var a = x1
            var b = y1
            while (a <= x2) {
                b = y1
                while (b <= y2) {
                    if (ar[a][b] != 1) {
                        flag = 1
                        break
                    }
                    b++
                }
                if (flag == 1) {
                    break
                }
                a++
            }
            if (a == x2 + 1 && b == y2 + 1) {
                ans++
            }
        }
        return ans
    }
}
