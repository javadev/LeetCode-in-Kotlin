package g3801_3900.s3813_vowel_consonant_score

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun vowelConsonantScore() {
        assertThat<Int>(Solution().vowelConsonantScore("cooear"), equalTo<Int>(2))
    }

    @Test
    fun vowelConsonantScore2() {
        assertThat<Int>(Solution().vowelConsonantScore("axeyizou"), equalTo<Int>(1))
    }

    @Test
    fun vowelConsonantScore3() {
        assertThat<Int>(Solution().vowelConsonantScore("au 123"), equalTo<Int>(0))
    }
}
