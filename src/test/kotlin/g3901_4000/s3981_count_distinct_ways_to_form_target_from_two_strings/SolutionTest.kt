package g3901_4000.s3981_count_distinct_ways_to_form_target_from_two_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun interleaveCharacters() {
        assertThat<Int>(
            Solution().interleaveCharacters("abc", "bac", "abc"),
            equalTo<Int>(5),
        )
    }

    @Test
    fun interleaveCharacters2() {
        assertThat<Int>(
            Solution().interleaveCharacters("cd", "cd", "ccd"),
            equalTo<Int>(4),
        )
    }

    @Test
    fun interleaveCharacters3() {
        assertThat<Int>(
            Solution().interleaveCharacters("xy", "xy", "xyxy"),
            equalTo<Int>(2),
        )
    }

    @Test
    fun interleaveCharacters4() {
        assertThat<Int>(
            Solution().interleaveCharacters("ab", "cde", "ace"),
            equalTo<Int>(1),
        )
    }
}
