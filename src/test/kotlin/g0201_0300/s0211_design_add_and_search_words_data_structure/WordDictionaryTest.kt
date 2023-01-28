package g0201_0300.s0211_design_add_and_search_words_data_structure

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class WordDictionaryTest {
    @Test
    fun worldDataStructure() {
        val input = arrayOf("bad", "dad", "mad")
        val dictionary = WordDictionary()
        for (s in input) {
            dictionary.addWord(s)
        }
        assertThat(dictionary.search("pad"), equalTo(false))
        assertThat(dictionary.search("bad"), equalTo(true))
        assertThat(dictionary.search(".ad"), equalTo(true))
        assertThat(dictionary.search("b.."), equalTo(true))
    }
}
