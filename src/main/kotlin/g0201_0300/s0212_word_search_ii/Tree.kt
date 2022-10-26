package g0201_0300.s0212_word_search_ii

@Suppress("NAME_SHADOWING")
class Tree {
    private var children: Array<Tree?>? = null
    var end: String? = null
    private var length = 0
    private fun addChild(c: Char): Tree? {
        val i = c.code - 'a'.code
        if (children == null) {
            children = arrayOfNulls(26)
        }
        if (children!![i] == null) {
            children!![i] = Tree()
            ++length
        }
        return children!![i]
    }

    fun getChild(c: Char): Tree? {
        return if (children == null) null else children!![c.code - 'a'.code]
    }

    fun len(): Int {
        return length
    }

    companion object {
        fun addWord(root: Tree?, word: String) {
            var t = root
            for (c in word.toCharArray()) {
                t = t!!.addChild(c)
            }
            t!!.end = word
        }

        fun deleteWord(root: Tree?, word: String) {
            var root = root
            var toDelOn = root
            var toDel = word[0]
            for (c in word.toCharArray()) {
                if (root!!.length > 1) {
                    toDelOn = root
                    toDel = c
                }
                root = root.getChild(c)
                requireNotNull(root)
            }
            toDelOn!!.children!![toDel.code - 'a'.code] = null
            --toDelOn.length
            require(root!!.length == 0)
        }
    }
}
