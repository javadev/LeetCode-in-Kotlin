package g3101_3200.s3170_lexicographically_minimum_string_after_removing_stars

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun clearStars() {
        assertThat(Solution().clearStars("aaba*"), equalTo("aab"))
    }

    @Test
    fun clearStars2() {
        assertThat(Solution().clearStars("abc"), equalTo("abc"))
    }
}
