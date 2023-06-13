package g1401_1500.s1487_making_file_names_unique

// #Medium #Array #String #Hash_Table #2023_06_13_Time_553_ms_(50.00%)_Space_50.7_MB_(50.00%)

class Solution {
    fun getFolderNames(names: Array<String>): Array<String> {
        val map = HashMap<String, Int>()
        for (i in names.indices) {
            var prefix = map.getOrDefault(names[i], 0)
            if (prefix != 0) {
                val raw = names[i]
                while (map.getOrDefault(names[i], 0) != 0) {
                    names[i] = "$raw($prefix)"
                    prefix++
                }
                map[raw] = prefix
            }
            map[names[i]] = 1
        }
        return names
    }
}
