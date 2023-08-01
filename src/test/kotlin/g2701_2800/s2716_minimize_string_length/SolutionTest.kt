package g2701_2800.s2716_minimize_string_length

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizedStringLength() {
        assertThat(
            Solution().minimizedStringLength("aaabc"),
            equalTo(3)
        )
    }

    @Test
    fun minimizedStringLength2() {
        assertThat(
            Solution().minimizedStringLength("cbbd"),
            equalTo(3)
        )
    }

    @Test
    fun minimizedStringLength3() {
        assertThat(
            Solution().minimizedStringLength("dddaaa"),
            equalTo(2)
        )
    }
}
