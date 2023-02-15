package g0601_0700.s0676_implement_magic_dictionary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MagicDictionaryTest {
    @Test
    fun magicDictionaryTest() {
        val magicDictionary = MagicDictionary()
        magicDictionary.buildDict(arrayOf("hello", "leetcode"))
        assertThat(magicDictionary.search("hello"), equalTo(false))
        assertThat(magicDictionary.search("hhllo"), equalTo(true))
        assertThat(magicDictionary.search("hell"), equalTo(false))
        assertThat(magicDictionary.search("leetcoded"), equalTo(false))
    }
}
