package g0201_0300.s0208_implement_trie_prefix_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class TrieTest {
    @Test
    fun trie() {
        val trie = Trie()
        trie.insert("apple")
        // return True
        assertThat(trie.search("apple"), equalTo(true))
        // return False
        assertThat(trie.search("app"), equalTo(false))
        // return True
        assertThat(trie.startsWith("app"), equalTo(true))
        trie.insert("app")
        // return True
        assertThat(trie.search("app"), equalTo(true))
    }
}
