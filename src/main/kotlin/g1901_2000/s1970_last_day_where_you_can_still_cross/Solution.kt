package g1901_2000.s1970_last_day_where_you_can_still_cross

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Binary_Search #Matrix #Union_Find
@Suppress("NAME_SHADOWING")
class Solution {
    fun latestDayToCross(row: Int, col: Int, cells: Array<IntArray>): Int {
        val ends = Array(row) { arrayOfNulls<Ends>(col) }
        for (i in cells.indices) {
            val r = cells[i][0] - 1
            val c = cells[i][1] - 1
            var curr: Ends? = null
            if (c > 0 && ends[r][c - 1] != null) {
                curr = calEnds(ends[r][c - 1], curr, c)
            }
            if (r > 0 && ends[r - 1][c] != null) {
                curr = calEnds(ends[r - 1][c], curr, c)
            }
            if (c < col - 1 && ends[r][c + 1] != null) {
                curr = calEnds(ends[r][c + 1], curr, c)
            }
            if (r < row - 1 && ends[r + 1][c] != null) {
                curr = calEnds(ends[r + 1][c], curr, c)
            }
            if (c > 0 && r > 0 && ends[r - 1][c - 1] != null) {
                curr = calEnds(ends[r - 1][c - 1], curr, c)
            }
            if (c > 0 && r < row - 1 && ends[r + 1][c - 1] != null) {
                curr = calEnds(ends[r + 1][c - 1], curr, c)
            }
            if (c < col - 1 && r > 0 && ends[r - 1][c + 1] != null) {
                curr = calEnds(ends[r - 1][c + 1], curr, c)
            }
            if (c < col - 1 && r < row - 1 && ends[r + 1][c + 1] != null) {
                curr = calEnds(ends[r + 1][c + 1], curr, c)
            }
            if (curr == null) {
                curr = Ends(i, c, c)
            }
            if (curr.l == 0 && curr.r == col - 1) {
                return i
            }
            ends[r][c] = curr
        }
        return cells.size
    }

    private fun calEnds(p: Ends?, curr: Ends?, c: Int): Ends? {
        var p = p
        var curr = curr
        while (p!!.parent != null) {
            p = p.parent
        }
        p.l = if (curr == null) Math.min(p.l, c) else Math.min(p.l, curr.l)
        p.r = if (curr == null) Math.max(p.r, c) else Math.max(p.r, curr.r)
        if (curr == null) {
            curr = p
        } else if (curr.i != p.i) {
            curr.parent = p
            curr = curr.parent
        }
        return curr
    }

    internal class Ends(var i: Int, var l: Int, var r: Int) {
        var parent: Ends? = null
    }
}
