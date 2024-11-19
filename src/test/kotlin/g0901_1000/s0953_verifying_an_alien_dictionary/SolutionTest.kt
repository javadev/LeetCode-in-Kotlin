package g0901_1000.s0953_verifying_an_alien_dictionary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isAlienSorted() {
        assertThat(
            Solution()
                .isAlienSorted(arrayOf("hello", "leetcode"), "hlabcdefgijkmnopqrstuvwxyz"),
            equalTo(true),
        )
    }

    @Test
    fun isAlienSorted2() {
        assertThat(
            Solution()
                .isAlienSorted(
                    arrayOf("word", "world", "row"),
                    "worldabcefghijkmnpqstuvxyz",
                ),
            equalTo(false),
        )
    }

    @Test
    fun isAlienSorted3() {
        assertThat(
            Solution()
                .isAlienSorted(arrayOf("apple", "app"), "abcdefghijklmnopqrstuvwxyz"),
            equalTo(false),
        )
    }
}
