package g3401_3500.s3435_frequencies_of_shortest_supersequences

// #Hard #Array #String #Bit_Manipulation #Graph #Enumeration #Topological_Sort
// #2025_04_04_Time_275_ms_(100.00%)_Space_49.81_MB_(100.00%)

class Solution {
    private var min = Int.Companion.MAX_VALUE
    private var lists: MutableList<IntArray> = ArrayList<IntArray>()

    fun supersequences(words: Array<String>): List<List<Int>> {
        val pairs = Array<BooleanArray>(26) { BooleanArray(26) }
        val counts = IntArray(26)
        for (word in words) {
            val a = word[0].code - 'a'.code
            val b = word[1].code - 'a'.code
            if (!pairs[a][b]) {
                pairs[a][b] = true
                counts[a]++
                counts[b]++
            }
        }
        val links: Array<ArrayList<Int>> = Array<ArrayList<Int>>(26) { ArrayList<Int>() }
        val counts1 = IntArray(26)
        val sides = IntArray(26)
        for (i in 0..25) {
            for (j in 0..25) {
                if (pairs[i][j]) {
                    links[i].add(j)
                    counts1[j]++
                    sides[i] = sides[i] or 1
                    sides[j] = sides[j] or 2
                }
            }
        }
        val arr = IntArray(26)
        for (i in 0..25) {
            if (counts[i] <= 1) {
                arr[i] = counts[i]
            } else if (counts1[i] == 0 || sides[i] != 3) {
                arr[i] = 1
            } else if (pairs[i][i]) {
                arr[i] = 2
            } else {
                arr[i] = -1
            }
        }
        dfs(links, 0, arr, IntArray(26), 0)
        val res: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
        for (arr1 in lists) {
            val list: MutableList<Int> = ArrayList<Int>()
            for (n in arr1) {
                list.add(n)
            }
            res.add(list)
        }
        return res
    }

    private fun dfs(links: Array<ArrayList<Int>>, i: Int, arr1: IntArray, arr: IntArray, n: Int) {
        if (n > min) {
            return
        }
        if (i == 26) {
            if (!chk(links, arr)) {
                return
            }
            if (n < min) {
                min = n
                lists = ArrayList<IntArray>()
                lists.add(arr.clone())
            } else if (n == min) {
                lists.add(arr.clone())
            }
            return
        }
        if (arr1[i] >= 0) {
            arr[i] = arr1[i]
            dfs(links, i + 1, arr1, arr, n + arr1[i])
        } else {
            arr[i] = 1
            dfs(links, i + 1, arr1, arr, n + 1)
            arr[i] = 2
            dfs(links, i + 1, arr1, arr, n + 2)
        }
    }

    private fun chk(links: Array<ArrayList<Int>>, arr: IntArray): Boolean {
        for (i in 0..25) {
            if (arr[i] == 1 && dfs1(links, arr, BooleanArray(26), i)) {
                return false
            }
        }
        return true
    }

    private fun dfs1(links: Array<ArrayList<Int>>, arr: IntArray, seens: BooleanArray, i: Int): Boolean {
        seens[i] = true
        for (next in links[i]) {
            if (arr[next] == 1 && (seens[next] || dfs1(links, arr, seens, next))) {
                return true
            }
        }
        seens[i] = false
        return false
    }
}
