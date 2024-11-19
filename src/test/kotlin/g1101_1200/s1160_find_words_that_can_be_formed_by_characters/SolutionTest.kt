package g1101_1200.s1160_find_words_that_can_be_formed_by_characters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCharacters() {
        assertThat(
            Solution().countCharacters(arrayOf("cat", "bt", "hat", "tree"), "atach"),
            equalTo(6),
        )
    }

    @Test
    fun countCharacters2() {
        assertThat(
            Solution()
                .countCharacters(arrayOf("hello", "world", "leetcode"), "welldonehoneyr"),
            equalTo(10),
        )
    }
}
