package g3901_4000.s3926_count_valid_word_occurrences

// #Medium #Array #String #Hash_Table #Counting #Staff #Weekly_Contest_501
// #2026_09_29_Time_39_ms_(98.70%)_Space_189.00_MB_(5.19%)

class Solution {
    fun countWordOccurrences(chunks: Array<String>, queries: Array<String>): IntArray {
        val trie = Trie()
        trie.fill(chunks)
        return queries.map { trie.count(it) }.toIntArray()
    }

    private class Trie {
        val children: Array<Trie?> = arrayOfNulls(27)
        var count: Int = 0

        fun fill(chunks: Array<String>) {
            var node = this
            var last = '@'
            for (j in chunks.indices) {
                val chunk = chunks[j]
                for (k in chunk.indices) {
                    val c = processCharacter(chunk, k, j, chunks, last)
                    node = node.addCharacter(c)
                    node = node.finalizeWordIfNeeded(c, this)
                    last = c
                }
            }
            node.incrementCountIfNeeded(this)
        }

        private fun processCharacter(
            chunk: String,
            index: Int,
            chunkIndex: Int,
            chunks: Array<String>,
            last: Char,
        ): Char {
            val c = chunk[index]
            if (c == '-') {
                val next = getNextCharacter(chunk, index, chunkIndex, chunks)
                if (!isLetter(last) || !isLetter(next)) {
                    return '@'
                }
            }
            return c
        }

        private fun getNextCharacter(chunk: String, index: Int, chunkIndex: Int, chunks: Array<String>): Char {
            if (index < chunk.length - 1) {
                return chunk[index + 1]
            }
            if (chunkIndex < chunks.size - 1) {
                return chunks[chunkIndex + 1][0]
            }
            return '@'
        }

        private fun addCharacter(c: Char): Trie {
            if (!isValidCharacter(c)) {
                return this
            }
            val index = getIndex(c)
            if (children[index] == null) {
                children[index] = Trie()
            }
            return children[index]!!
        }

        private fun finalizeWordIfNeeded(c: Char, root: Trie): Trie {
            if (isValidCharacter(c)) {
                return this
            }
            incrementCountIfNeeded(root)
            return root
        }

        private fun incrementCountIfNeeded(root: Trie) {
            if (this !== root) {
                count++
            }
        }

        fun count(s: String): Int {
            var node: Trie? = this
            for (element in s) {
                val i = getIndex(element)
                node = node?.children?.get(i) ?: return 0
            }
            return node?.count ?: 0
        }

        companion object {
            private fun isValidCharacter(c: Char): Boolean = c == '-' || isLetter(c)

            private fun getIndex(c: Char): Int = if (c == '-') 26 else c - 'a'

            private fun isLetter(c: Char): Boolean = c in 'a'..'z'
        }
    }
}
