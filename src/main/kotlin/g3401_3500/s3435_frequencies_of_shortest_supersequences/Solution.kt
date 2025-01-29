package g3401_3500.s3435_frequencies_of_shortest_supersequences

// #Hard #Array #String #Bit_Manipulation #Graph #Enumeration #Topological_Sort
// #2025_01_29_Time_35_(100.00%)_Space_43.62_(100.00%)

class Solution {
    private var m = 0
    private var forcedMask = 0
    private lateinit var adj: IntArray
    private val idxToChar = CharArray(26)
    private val charToIdx = IntArray(26)
    private val used = BooleanArray(26)

    fun supersequences(words: Array<String>): MutableList<MutableList<Int?>?> {
        charToIdx.fill(-1)
        for (w in words) {
            used[w[0].code - 'a'.code] = true
            used[w[1].code - 'a'.code] = true
        }
        // Map each used letter to an index [0..m-1]
        for (c in 0..25) {
            if (used[c]) {
                idxToChar[m] = (c + 'a'.code).toChar()
                charToIdx[c] = m++
            }
        }
        adj = IntArray(m)
        // Build graph and record forced duplicates
        for (w in words) {
            val u = charToIdx[w[0].code - 'a'.code]
            val v = charToIdx[w[1].code - 'a'.code]
            if (u == v) {
                forcedMask = forcedMask or (1 shl u)
            } else {
                adj[u] = adj[u] or (1 shl v)
            }
        }
        // Try all supersets of forcedMask; keep those that kill all cycles
        var best = 9999
        val goodSets: MutableList<Int?> = ArrayList<Int?>()
        for (s in 0..<(1 shl m)) {
            if ((s and forcedMask) != forcedMask) {
                continue
            }
            val size = Integer.bitCount(s)
            if (size <= best && !hasCycle(s)) {
                if (size < best) {
                    best = size
                    goodSets.clear()
                }
                goodSets.add(s)
            }
        }
        // Build distinct freq arrays from these sets
        val seen: MutableSet<String?> = HashSet<String?>()
        val ans: MutableList<MutableList<Int?>?> = ArrayList<MutableList<Int?>?>()
        for (s in goodSets) {
            val freq = IntArray(26)
            for (i in 0..<m) {
                freq[idxToChar[i].code - 'a'.code] = if ((s!! and (1 shl i)) != 0) 2 else 1
            }
            val key = freq.contentToString()
            if (seen.add(key)) {
                val tmp: MutableList<Int?> = ArrayList<Int?>()
                for (f in freq) {
                    tmp.add(f)
                }
                ans.add(tmp)
            }
        }
        return ans
    }

    private fun hasCycle(mask: Int): Boolean {
        val color = IntArray(m)
        for (i in 0..<m) {
            if (((mask shr i) and 1) == 0 && color[i] == 0 && dfs(i, color, mask)) {
                return true
            }
        }
        return false
    }

    private fun dfs(u: Int, color: IntArray, mask: Int): Boolean {
        color[u] = 1
        var nxt = adj[u]
        while (nxt != 0) {
            val v = Integer.numberOfTrailingZeros(nxt)
            nxt = nxt and (nxt - 1)
            if (((mask shr v) and 1) == 1) {
                continue
            }
            if (color[v] == 1) {
                return true
            }
            if (color[v] == 0 && dfs(v, color, mask)) {
                return true
            }
        }
        color[u] = 2
        return false
    }
}
