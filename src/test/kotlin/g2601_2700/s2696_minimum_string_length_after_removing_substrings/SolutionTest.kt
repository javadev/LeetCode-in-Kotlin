package g2601_2700.s2696_minimum_string_length_after_removing_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minLength() {
        assertThat(
            Solution().minLength("ABFCACDB"),
            equalTo(2),
        )
    }

    @Test
    fun minLength2() {
        assertThat(
            Solution().minLength("ACBBD"),
            equalTo(5),
        )
    }
}
