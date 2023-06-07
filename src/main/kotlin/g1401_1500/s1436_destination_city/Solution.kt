package g1401_1500.s1436_destination_city

// #Easy #String #Hash_Table
class Solution {
    fun destCity(paths: List<List<String>>): String {
        val set: MutableSet<String> = HashSet()
        for (strings in paths) {
            set.add(strings[0])
        }
        for (path in paths) {
            if (!set.contains(path[1])) {
                return path[1]
            }
        }
        return ""
    }
}
