package g0601_0700.s0609_find_duplicate_file_in_system

// #Medium #Array #String #Hash_Table #2023_02_03_Time_426_ms_(100.00%)_Space_48.5_MB_(80.00%)

class Solution {
    fun findDuplicate(paths: Array<String>): List<List<String>> {
        val map: MutableMap<String, MutableList<String>> = HashMap()
        for (path in paths) {
            val pathComponents = path.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val root = pathComponents[0]
            for (i in 1 until pathComponents.size) {
                val startIndex = pathComponents[i].indexOf("(")
                val endIndex = pathComponents[i].lastIndexOf(")")
                val content = pathComponents[i].substring(startIndex, endIndex)
                map.putIfAbsent(content, ArrayList())
                map[content]!!.add(root + "/" + pathComponents[i].substring(0, startIndex))
            }
        }
        val result: MutableList<List<String>> = ArrayList()
        for (list in map.values) {
            if (list.size > 1) {
                result.add(list)
            }
        }
        return result
    }
}
