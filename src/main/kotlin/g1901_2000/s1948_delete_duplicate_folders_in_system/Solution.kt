package g1901_2000.s1948_delete_duplicate_folders_in_system

// #Hard #Array #String #Hash_Table #Trie #Hash_Function
class Solution {
    private var duplicates: MutableMap<String, ArrayList<Folder>>? = null
    private var foldersWithRemovedNames: MutableList<List<String>>? = null

    fun deleteDuplicateFolder(paths: List<List<String>>): List<List<String>> {
        duplicates = HashMap()
        val rootFolder = Folder("", null)
        for (path in paths) {
            var folder = rootFolder
            for (foldername in path) {
                folder = folder.addSubFolder(foldername)
            }
        }
        rootFolder.calculateHash()
        for ((_, foldersWithSameHash) in duplicates as HashMap<String, ArrayList<Folder>>) {
            if (foldersWithSameHash != null && foldersWithSameHash.size > 1) {
                for (folder in foldersWithSameHash) {
                    folder.parent?.subFolders?.remove(folder.name)
                }
            }
        }
        foldersWithRemovedNames = ArrayList()
        for ((_, folder) in rootFolder.subFolders) {
            val path: List<String> = ArrayList()
            folder.addPaths(path)
        }
        return foldersWithRemovedNames as ArrayList<List<String>>
    }

    private inner class Folder(val name: String, val parent: Folder?) {
        val subFolders: MutableMap<String, Folder>
        private var folderHash = ""

        init {
            subFolders = HashMap()
        }

        fun addSubFolder(foldername: String): Folder {
            return subFolders.computeIfAbsent(foldername) { f: String -> Folder(f, this) }
        }

        fun calculateHash() {
            val subFolderNames: MutableList<String> = ArrayList(subFolders.keys)
            subFolderNames.sort()
            val builder = StringBuilder()
            for (foldername in subFolderNames) {
                val folder = subFolders[foldername]
                folder!!.calculateHash()
                builder.append('#')
                builder.append(foldername)
                if (folder.folderHash.isNotEmpty()) {
                    builder.append('(')
                    builder.append(folder.folderHash)
                    builder.append(')')
                }
            }
            folderHash = builder.toString()
            if (folderHash.length > 0) {
                val duplicateFolders = duplicates!!.computeIfAbsent(folderHash) { k: String? -> ArrayList() }
                duplicateFolders.add(this)
            }
        }

        fun addPaths(parentPath: List<String>) {
            val currentPath: MutableList<String> = ArrayList(parentPath)
            currentPath.add(name)
            foldersWithRemovedNames!!.add(currentPath)
            for ((_, folder) in subFolders) {
                folder.addPaths(currentPath)
            }
        }
    }
}
