package g2701_2800.s2729_check_if_the_number_is_fascinating

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isFascinating() {
        assertThat(
            Solution().isFascinating(192),
            equalTo(true)
        )
    }

    @Test
    fun isFascinating2() {
        assertThat(
            Solution().isFascinating(100),
            equalTo(false)
        )
    }
}
