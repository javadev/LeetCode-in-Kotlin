package g2901_3000.s2975_maximum_square_area_by_removing_fences_from_a_field

// #Medium #Array #Hash_Table #Enumeration #2024_01_19_Time_1283_ms_(96.77%)_Space_68.6_MB_(93.55%)

class Solution {
    fun maximizeSquareArea(
        m: Int,
        n: Int,
        hFences: IntArray,
        vFences: IntArray,
    ): Int {
        val hFencesWithBorder = IntArray(hFences.size + 2)
        System.arraycopy(hFences, 0, hFencesWithBorder, 0, hFences.size)
        hFencesWithBorder[hFences.size] = 1
        hFencesWithBorder[hFences.size + 1] = m
        hFencesWithBorder.sort()
        val edgeSet: MutableSet<Int> = HashSet()
        run {
            var i = 0
            while (i < hFencesWithBorder.size) {
                var j = i + 1
                while (j < hFencesWithBorder.size) {
                    edgeSet.add(hFencesWithBorder[j] - hFencesWithBorder[i])
                    j += 1
                }
                i += 1
            }
        }
        var maxEdge = -1
        val vFencesWithBorder = IntArray(vFences.size + 2)
        System.arraycopy(vFences, 0, vFencesWithBorder, 0, vFences.size)
        vFencesWithBorder[vFences.size] = 1
        vFencesWithBorder[vFences.size + 1] = n
        vFencesWithBorder.sort()
        var i = 0
        while (i < vFencesWithBorder.size) {
            var j = i + 1
            while (j < vFencesWithBorder.size) {
                val curEdge = vFencesWithBorder[j] - vFencesWithBorder[i]
                if (edgeSet.contains(curEdge) && curEdge > maxEdge) {
                    maxEdge = curEdge
                }
                j += 1
            }
            i += 1
        }
        val mod = 1e9.toInt() + 7
        return if (maxEdge != -1) (maxEdge.toLong() * maxEdge % mod).toInt() else -1
    }
}
