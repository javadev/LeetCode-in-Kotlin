package g3401_3500.s3435_frequencies_of_shortest_supersequences

// #Hard #2025_01_26_Time_385_(100.00%)_Space_54.41_(100.00%)

class Solution {
    private fun buildWordMap(words: List<String>): MutableMap<String?, Boolean?> {
        val mp: MutableMap<String?, Boolean?> = HashMap<String?, Boolean?>()
        for (x in words) {
            mp.put(x, true)
        }
        return mp
    }

    private fun buildCharMap(words: List<String>): MutableMap<Char?, Boolean?> {
        val mp2: MutableMap<Char?, Boolean?> = HashMap<Char?, Boolean?>()
        for (x in words) {
            mp2.put(x[0], true)
            mp2.put(x[1], true)
        }
        return mp2
    }

    private fun initializeAnswerArray(mp: MutableMap<String?, Boolean?>, mp2: MutableMap<Char?, Boolean?>): IntArray {
        val tans = IntArray(26)
        tans.fill(0)
        var c = 'a'
        while (c <= 'z') {
            val aux = "" + c + c
            if (mp.containsKey(aux)) {
                tans[c.code - 'a'.code] = 2
            } else if (mp2.containsKey(c)) {
                tans[c.code - 'a'.code] = 1
            }
            c++
        }
        return tans
    }

    private fun filterWords(words: List<String>, tans: IntArray): MutableList<String> {
        val wtc: MutableList<String> = ArrayList<String>()
        for (x in words) {
            if (tans[x[0].code - 'a'.code] != 2 && tans[x[1].code - 'a'.code] != 2) {
                wtc.add(x)
            }
        }
        return wtc
    }

    private fun updateBoundaries(wtc: MutableList<String>, bg: IntArray, ed: IntArray) {
        for (i in wtc.indices) {
            val l = wtc[i][0].code - 'a'.code
            if (bg[l] == -1) {
                bg[l] = i
            }
            ed[l] = i
        }
    }

    private fun findMinimalSolutions(
        wtc: MutableList<String>,
        tans: IntArray,
        bg: IntArray,
        ed: IntArray,
    ): MutableList<Int> {
        val ns: MutableList<Int> = ArrayList<Int>()
        for (i in 0..25) {
            if (tans[i] == 1) {
                ns.add(i)
            }
        }
        val gm: MutableList<Int> = ArrayList<Int>()
        for (i in 0..<(1 shl ns.size)) {
            if (isValidSolution(i, ns, wtc, tans.clone(), bg, ed)) {
                gm.add(i)
            }
        }
        return gm
    }

    private fun isValidSolution(
        i: Int,
        ns: MutableList<Int>,
        wtc: MutableList<String>,
        tans: IntArray,
        bg: IntArray,
        ed: IntArray,
    ): Boolean {
        val indg = IntArray(26)
        indg.fill(0)
        for (j in ns.indices) {
            if ((i and (1 shl j)) != 0) {
                tans[ns[j]] = 2
            } else {
                tans[ns[j]] = 1
            }
        }
        for (w in wtc) {
            if (tans[w[0].code - 'a'.code] != 2 && tans[w[1].code - 'a'.code] != 2) {
                indg[w[1].code - 'a'.code]++
            }
        }
        return processIndegrees(indg, tans, wtc, bg, ed)
    }

    private fun processIndegrees(
        indg: IntArray,
        tans: IntArray,
        wtc: MutableList<String>,
        bg: IntArray,
        ed: IntArray,
    ): Boolean {
        val chk: MutableList<Int> = ArrayList<Int>()
        for (j in 0..25) {
            if (indg[j] == 0 && tans[j] == 1) {
                chk.add(j)
            }
        }
        while (chk.isNotEmpty()) {
            val u: Int = chk.removeAt(chk.size - 1)
            if (bg[u] == -1) {
                continue
            }
            for (j in bg[u]..ed[u]) {
                val l = wtc[j][1].code - 'a'.code
                if (tans[l] == 2) {
                    continue
                }
                indg[l]--
                if (indg[l] == 0) {
                    chk.add(l)
                }
            }
        }
        return indg.max() == 0
    }

    fun supersequences(wordsArray: Array<String>): List<List<Int>> {
        val words = wordsArray.sorted()
        val bg = IntArray(26)
        bg.fill(-1)
        val ed = IntArray(26)
        ed.fill(0)
        val mp = buildWordMap(words)
        val mp2 = buildCharMap(words)
        val tans = initializeAnswerArray(mp, mp2)
        val wtc = filterWords(words, tans)
        updateBoundaries(wtc, bg, ed)
        val ans: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
        if (wtc.isEmpty()) {
            val tansList: MutableList<Int> = ArrayList<Int>()
            for (t in tans) {
                tansList.add(t)
            }
            ans.add(tansList)
            return ans
        }
        val gm = findMinimalSolutions(wtc, tans, bg, ed)
        val minb = gm.minOf { Integer.bitCount(it) }
        val ns: MutableList<Int> = ArrayList<Int>()
        for (i in 0..25) {
            if (tans[i] == 1) {
                ns.add(i)
            }
        }
        for (x in gm) {
            if (Integer.bitCount(x) == minb) {
                for (j in ns.indices) {
                    if ((x and (1 shl j)) != 0) {
                        tans[ns[j]] = 2
                    } else {
                        tans[ns[j]] = 1
                    }
                }
                val tansList: MutableList<Int> = ArrayList<Int>()
                for (t in tans) {
                    tansList.add(t)
                }
                ans.add(tansList)
            }
        }
        return ans
    }
}
