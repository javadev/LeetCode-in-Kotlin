package g2601_2700.s2652_sum_multiples

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfMultiples() {
        assertThat(
            Solution().sumOfMultiples(7),
            equalTo(21),
        )
    }

    @Test
    fun sumOfMultiples2() {
        assertThat(
            Solution().sumOfMultiples(10),
            equalTo(40),
        )
    }

    @Test
    fun sumOfMultiples3() {
        assertThat(
            Solution().sumOfMultiples(9),
            equalTo(30),
        )
    }
}
