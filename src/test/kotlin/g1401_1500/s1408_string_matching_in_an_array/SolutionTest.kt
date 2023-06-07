package g1401_1500.s1408_string_matching_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stringMatching() {
        assertThat(
            Solution().stringMatching(arrayOf("mass", "as", "hero", "superhero")),
            equalTo(mutableListOf("as", "hero"))
        )
    }

    @Test
    fun stringMatching2() {
        assertThat(
            Solution().stringMatching(arrayOf("leetcode", "et", "code")),
            equalTo(mutableListOf("code", "et"))
        )
    }

    @Test
    fun stringMatching3() {
        assertThat(
            Solution().stringMatching(arrayOf("blue", "green", "bu")),
            equalTo(emptyList<Any>())
        )
    }
}
