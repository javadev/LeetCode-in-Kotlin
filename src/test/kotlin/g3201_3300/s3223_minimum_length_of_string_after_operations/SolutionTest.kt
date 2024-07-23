package g3201_3300.s3223_minimum_length_of_string_after_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumLength() {
        assertThat(Solution().minimumLength("abaacbcbb"), equalTo(5))
    }

    @Test
    fun minimumLength2() {
        assertThat(Solution().minimumLength("aa"), equalTo(2))
    }
}
