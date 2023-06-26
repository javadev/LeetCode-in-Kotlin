package g2201_2300.s2213_longest_substring_of_one_repeating_character

// #Hard #Array #String #Ordered_Set #Segment_Tree
class Solution {
    internal class TreeNode(var start: Int, var end: Int) {
        var leftChar = 0.toChar()
        var leftCharLen = 0
        var rightChar = 0.toChar()
        var rightCharLen = 0
        var max = 0
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun longestRepeating(s: String, queryCharacters: String, queryIndices: IntArray): IntArray {
        val sChar = s.toCharArray()
        val qChar = queryCharacters.toCharArray()
        val root = buildTree(sChar, 0, sChar.size - 1)
        val result = IntArray(qChar.size)
        for (i in qChar.indices) {
            updateTree(root, queryIndices[i], qChar[i])
            if (root != null) {
                result[i] = root.max
            }
        }
        return result
    }

    private fun buildTree(s: CharArray, from: Int, to: Int): TreeNode? {
        if (from > to) {
            return null
        }
        val root = TreeNode(from, to)
        if (from == to) {
            root.max = 1
            root.leftChar = s[from]
            root.rightChar = root.leftChar
            root.rightCharLen = 1
            root.leftCharLen = root.rightCharLen
            return root
        }
        val middle = from + (to - from) / 2
        root.left = buildTree(s, from, middle)
        root.right = buildTree(s, middle + 1, to)
        updateNode(root)
        return root
    }

    private fun updateTree(root: TreeNode?, index: Int, c: Char) {
        if (root == null || root.start > index || root.end < index) {
            return
        }
        if (root.start == index && root.end == index) {
            root.rightChar = c
            root.leftChar = root.rightChar
            return
        }
        updateTree(root.left, index, c)
        updateTree(root.right, index, c)
        updateNode(root)
    }

    private fun updateNode(root: TreeNode?) {
        if (root == null) {
            return
        }
        root.leftChar = root.left!!.leftChar
        root.leftCharLen = root.left!!.leftCharLen
        root.rightChar = root.right!!.rightChar
        root.rightCharLen = root.right!!.rightCharLen
        root.max = Math.max(root.left!!.max, root.right!!.max)
        if (root.left!!.rightChar == root.right!!.leftChar) {
            val len = root.left!!.rightCharLen + root.right!!.leftCharLen
            if (root.left!!.leftChar == root.left!!.rightChar &&
                root.left!!.leftCharLen == root.left!!.end - root.left!!.start + 1
            ) {
                root.leftCharLen = len
            }
            if (root.right!!.leftChar == root.right!!.rightChar &&
                root.right!!.leftCharLen == root.right!!.end - root.right!!.start + 1
            ) {
                root.rightCharLen = len
            }
            root.max = Math.max(root.max, len)
        }
    }
}
