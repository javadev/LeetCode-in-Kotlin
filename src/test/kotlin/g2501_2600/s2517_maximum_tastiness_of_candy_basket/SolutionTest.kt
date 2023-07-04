package g2501_2600.s2517_maximum_tastiness_of_candy_basket

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumTastiness() {
        assertThat(
            Solution().maximumTastiness(intArrayOf(13, 5, 1, 8, 21, 2), 3),
            equalTo(8)
        )
    }

    @Test
    fun maximumTastiness2() {
        assertThat(Solution().maximumTastiness(intArrayOf(1, 3, 1), 2), equalTo(2))
    }

    @Test
    fun maximumTastiness3() {
        assertThat(Solution().maximumTastiness(intArrayOf(7, 7, 7, 7), 2), equalTo(0))
    }
}
