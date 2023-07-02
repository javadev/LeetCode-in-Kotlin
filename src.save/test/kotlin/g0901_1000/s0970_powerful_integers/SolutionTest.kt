package g0901_1000.s0970_powerful_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun powerfulIntegers() {
        assertThat(
            Solution().powerfulIntegers(2, 3, 10),
            equalTo(listOf(2, 3, 4, 5, 7, 9, 10))
        )
    }

    @Test
    fun powerfulIntegers2() {
        assertThat(
            Solution().powerfulIntegers(3, 5, 15),
            equalTo(listOf(2, 4, 6, 8, 10, 14))
        )
    }
}
