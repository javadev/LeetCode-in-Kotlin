package g3101_3200.s3120_count_the_number_of_special_characters_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfSpecialChars() {
        assertThat(Solution().numberOfSpecialChars("aaAbcBC"), equalTo(3))
    }

    @Test
    fun numberOfSpecialChars2() {
        assertThat(Solution().numberOfSpecialChars("abc"), equalTo(0))
    }

    @Test
    fun numberOfSpecialChars3() {
        assertThat(Solution().numberOfSpecialChars("abBCab"), equalTo(1))
    }
}
