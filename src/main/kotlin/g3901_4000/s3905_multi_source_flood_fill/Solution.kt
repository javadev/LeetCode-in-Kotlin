package g3901_4000.s3905_multi_source_flood_fill

// #Medium #Array #Breadth_First_Search #Matrix #Staff #Weekly_Contest_498
// #2026_09_17_Time_33_ms_(100.00%)_Space_90.55_MB_(100.00%)

class Solution {
    fun colorGrid(n: Int, m: Int, sources: Array<IntArray>): Array<IntArray> {
        val grid = Array<IntArray>(n) { IntArray(m) }
        val lenqavirod = n * m
        val dist = IntArray(lenqavirod)
        dist.fill(Int.MAX_VALUE)
        val q = IntArray(lenqavirod)
        var head = 0
        var tail = 0
        for (src in sources) {
            val r = src[0]
            val c = src[1]
            val color = src[2]
            grid[r][c] = color
            dist[r * m + c] = 0
            q[tail++] = r * m + c
        }
        val dr = intArrayOf(-1, 1, 0, 0)
        val dc = intArrayOf(0, 0, -1, 1)
        while (head < tail) {
            val curr = q[head++]
            val r = curr / m
            val c = curr % m
            val d = dist[curr]
            val color = grid[r][c]
            for (i in 0..3) {
                val nr = r + dr[i]
                val nc = c + dc[i]
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    val nextIdx = nr * m + nc
                    if (dist[nextIdx] > d + 1) {
                        dist[nextIdx] = d + 1
                        grid[nr][nc] = color
                        q[tail++] = nextIdx
                    } else if (dist[nextIdx] == d + 1 && (color > grid[nr][nc])) {
                        grid[nr][nc] = color
                    }
                }
            }
        }
        return grid
    }
}
