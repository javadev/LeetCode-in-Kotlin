package g2801_2900.s2828_check_if_a_string_is_an_acronym_of_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isAcronym() {
        assertThat(
            Solution().isAcronym(mutableListOf("alice", "bob", "charlie"), "abc"),
            equalTo(true)
        )
    }

    @Test
    fun isAcronym2() {
        assertThat(
            Solution().isAcronym(mutableListOf("an", "apple"), "a"),
            equalTo(false)
        )
    }

    @Test
    fun isAcronym3() {
        assertThat(
            Solution()
                .isAcronym(
                    mutableListOf("never", "gonna", "give", "up", "on", "you"),
                    "ngguoy"
                ),
            equalTo(true)
        )
    }
}
