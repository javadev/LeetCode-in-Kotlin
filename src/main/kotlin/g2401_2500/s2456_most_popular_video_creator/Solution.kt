package g2401_2500.s2456_most_popular_video_creator

// #Medium #Array #String #Hash_Table #Sorting #Heap_Priority_Queue
// #2023_07_04_Time_1162_ms_(100.00%)_Space_101.5_MB_(100.00%)

class Solution {
    fun mostPopularCreator(creators: Array<String>, ids: Array<String>, views: IntArray): List<List<String>> {
        val totalViews = HashMap<String, Long>()
        val maxView = HashMap<String, Int>()
        var globalMaxView: Long = 0
        for (i in creators.indices) {
            val currentView = totalViews.getOrDefault(creators[i], 0L) + views[i]
            globalMaxView = Math.max(currentView, globalMaxView)
            totalViews[creators[i]] = currentView
            val lastIndex = maxView.getOrDefault(creators[i], -1)
            if (!maxView.containsKey(creators[i]) || views[lastIndex] < views[i] ||
                views[lastIndex] == views[i] && ids[lastIndex].compareTo(
                    ids[i],
                ) > 0
            ) {
                maxView[creators[i]] = i
            }
        }
        val res: MutableList<List<String>> = ArrayList()
        for ((key, value) in totalViews) {
            if (value == globalMaxView) {
                res.add(listOf(key, ids[maxView[key]!!]))
            }
        }
        return res
    }
}
