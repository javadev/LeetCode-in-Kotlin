package g2201_2300.s2249_count_lattice_points_inside_a_circle

// #Medium #Array #Hash_Table #Math #Enumeration #Geometry
class Solution {
    fun countLatticePoints(circles: Array<IntArray>): Int {
        var xMin = 200
        var xMax = -1
        var yMin = 200
        var yMax = -1
        for (c in circles) {
            xMin = Math.min(xMin, c[0] - c[2])
            xMax = Math.max(xMax, c[0] + c[2])
            yMin = Math.min(yMin, c[1] - c[2])
            yMax = Math.max(yMax, c[1] + c[2])
        }
        var ans = 0
        for (x in xMin..xMax) {
            for (y in yMin..yMax) {
                for (c in circles) {
                    if ((c[0] - x) * (c[0] - x) + (c[1] - y) * (c[1] - y) <= c[2] * c[2]) {
                        ans++
                        break
                    }
                }
            }
        }
        return ans
    }
}
