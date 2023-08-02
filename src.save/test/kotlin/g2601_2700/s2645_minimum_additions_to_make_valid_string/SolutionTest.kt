package g2601_2700.s2645_minimum_additions_to_make_valid_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addMinimum() {
        assertThat(
            Solution().addMinimum("b"),
            equalTo(2)
        )
    }

    @Test
    fun addMinimum2() {
        assertThat(
            Solution().addMinimum("aaa"),
            equalTo(6)
        )
    }

    @Test
    fun addMinimum3() {
        assertThat(
            Solution().addMinimum("abc"),
            equalTo(0)
        )
    }
}
