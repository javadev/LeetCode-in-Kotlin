package g3201_3300.s3245_alternating_groups_iii

// #Hard #Array #Binary_Indexed_Tree #2025_02_12_Time_188_ms_(100.00%)_Space_95.34_MB_(100.00%)

import java.util.TreeMap
import kotlin.math.max

class Solution {
    // Binary Indexed Tree (BIT) class.
    private class BIT {
        var bs: IntArray = IntArray(SZ)

        // Update BIT: add value y to index x.
        fun update(x: Int, y: Int) {
            var x = x
            x = OFFSET - x
            while (x < SZ) {
                bs[x] += y
                x += x and -x
            }
        }

        // Query BIT: get the prefix sum up to index x.
        fun query(x: Int): Int {
            var x = x
            x = OFFSET - x
            var ans = 0
            while (x > 0) {
                ans += bs[x]
                x -= x and -x
            }
            return ans
        }

        // Clear BIT values starting from index x.
        fun clear(x: Int) {
            var x = x
            x = OFFSET - x
            while (x < SZ) {
                bs[x] = 0
                x += x and -x
            }
        }
    }

    // --- BIT wrapper methods ---
    // Updates both BITs for a given group length.
    private fun edt(x: Int, y: Int) {
        // Second BIT is updated with x * y.
        BITS[1].update(x, x * y)
        // First BIT is updated with y.
        BITS[0].update(x, y)
    }

    // Combines BIT queries to get the result for a given x.
    private fun qry(x: Int): Int {
        return BITS[1].query(x) + (1 - x) * BITS[0].query(x)
    }

    // Returns the length of a group from index x to y.
    private fun len(x: Int, y: Int): Int {
        return y - x + 1
    }

    // --- Group operations ---
    // Removes a group (block) by updating BIT with a negative value.
    private fun removeGroup(start: Int, end: Int) {
        edt(len(start, end), -1)
    }

    // Adds a group (block) by updating BIT with a positive value.
    private fun addGroup(start: Int, end: Int) {
        edt(len(start, end), 1)
    }

    // Initializes the alternating groups using the colors array.
    private fun initializeGroups(colors: IntArray, groups: TreeMap<Int, Int>) {
        val n = colors.size
        var i = 0
        while (i < n) {
            var r = i
            // Determine the end of the current alternating group.
            while (r < n && (colors[r] + colors[i] + r + i) % 2 == 0) {
                ++r
            }
            // The group spans from index i to r-1.
            groups.put(i, r - 1)
            // Update BITs with the length of this group.
            edt(r - i, 1)
            // Skip to the end of the current group.
            i = r - 1
            ++i
        }
    }

    // Processes a type 1 query: returns the number of alternating groups
    // of at least the given size.
    private fun processQueryType1(colors: IntArray, groups: TreeMap<Int, Int>, groupSize: Int): Int {
        var ans = qry(groupSize)
        val firstGroup = groups.firstEntry()
        val lastGroup = groups.lastEntry()
        // If there is more than one group and the first and last colors differ,
        // adjust the answer by "merging" the groups at the boundaries.
        if (firstGroup !== lastGroup && colors[0] != colors[colors.size - 1]) {
            val leftLen = len(firstGroup.key!!, firstGroup.value!!)
            val rightLen = len(lastGroup.key!!, lastGroup.value!!)
            ans = (ans - max((leftLen - groupSize + 1).toDouble(), 0.0)).toInt()
            ans = (ans - max((rightLen - groupSize + 1).toDouble(), 0.0)).toInt()
            ans = (ans + max((leftLen + rightLen - groupSize + 1).toDouble(), 0.0)).toInt()
        }
        return ans
    }

    // Processes a type 2 query: updates the color at index x and adjusts groups.
    private fun processQueryType2(
        colors: IntArray,
        groups: TreeMap<Int, Int>,
        x: Int,
        newColor: Int,
    ) {
        if (colors[x] == newColor) {
            return
        }
        // Update the color at index x.
        colors[x] = newColor
        // Find the group (block) that contains index x.
        var it = groups.floorEntry(x)
        val l: Int = it!!.key!!
        val r: Int = it.value!!
        // Remove the old group from BIT and map.
        removeGroup(l, r)
        groups.remove(l)
        var ml = x
        var mr = x
        // Process the left side of index x.
        if (l != x) {
            groups.put(l, x - 1)
            addGroup(l, x - 1)
        } else {
            if (x > 0 && colors[x] != colors[x - 1]) {
                it = groups.floorEntry(x - 1)
                if (it != null) {
                    ml = it.key!!
                    removeGroup(it.key!!, it.value!!)
                    groups.remove(it.key)
                }
            }
        }
        // Process the right side of index x.
        if (r != x) {
            groups.put(x + 1, r)
            addGroup(x + 1, r)
        } else {
            if (x + 1 < colors.size && colors[x + 1] != colors[x]) {
                it = groups.ceilingEntry(x + 1)
                if (it != null) {
                    mr = it.value!!
                    removeGroup(it.key!!, it.value!!)
                    groups.remove(it.key)
                }
            }
        }

        // Merge the affected groups into one new group.
        groups.put(ml, mr)
        addGroup(ml, mr)
    }

    // Clears both BITs. This is done after processing all queries.
    private fun clearAllBITs(n: Int) {
        for (i in 0..n + 2) {
            BITS[0].clear(i)
            BITS[1].clear(i)
        }
    }

    // Main function to handle queries on alternating groups.
    fun numberOfAlternatingGroups(colors: IntArray, queries: Array<IntArray>): MutableList<Int> {
        val groups = TreeMap<Int, Int>()
        val n = colors.size
        val results: MutableList<Int> = ArrayList<Int>()
        // Initialize alternating groups.
        initializeGroups(colors, groups)
        // Process each query.
        for (query in queries) {
            if (query[0] == 1) {
                // Type 1 query: count alternating groups of at least a given size.
                val groupSize = query[1]
                val ans = processQueryType1(colors, groups, groupSize)
                results.add(ans)
            } else {
                // Type 2 query: update the color at a given index.
                val index = query[1]
                val newColor = query[2]
                processQueryType2(colors, groups, index, newColor)
            }
        }
        // Clear BITs after processing all queries.
        clearAllBITs(n)
        return results
    }

    companion object {
        private const val SZ = 63333
        private const val OFFSET: Int = SZ - 10
        private val BITS = arrayOf<BIT>(BIT(), BIT())
    }
}
