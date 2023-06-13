package g1401_1500.s1487_making_file_names_unique

// #Medium #Array #String #Hash_Table
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
