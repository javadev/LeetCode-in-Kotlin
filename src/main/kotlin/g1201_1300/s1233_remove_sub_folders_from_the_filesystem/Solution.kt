package g1201_1300.s1233_remove_sub_folders_from_the_filesystem

// #Medium #Array #String #Trie
class Solution {
    fun removeSubfolders(folder: Array<String>): List<String> {
        val paths: MutableSet<String> = HashSet()
        paths.addAll(folder)
        val res: MutableList<String> = ArrayList()
        for (f in folder) {
            var lastSlash = f.lastIndexOf("/")
            var isSub = false
            while (lastSlash > 0) {
                val upperDir = f.substring(0, lastSlash)
                if (paths.contains(upperDir)) {
                    isSub = true
                    break
                }
                lastSlash = upperDir.lastIndexOf("/")
            }
            if (!isSub) {
                res.add(f)
            }
        }
        return res
    }
}
