package g1101_1200.s1160_find_words_that_can_be_formed_by_characters

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCharacters() {
        MatcherAssert.assertThat(
            Solution().countCharacters(arrayOf("cat", "bt", "hat", "tree"), "atach"),
            CoreMatchers.equalTo(6)
        )
    }

    @Test
    fun countCharacters2() {
        MatcherAssert.assertThat(
            Solution()
                .countCharacters(arrayOf("hello", "world", "leetcode"), "welldonehoneyr"),
            CoreMatchers.equalTo(10)
        )
    }
}
