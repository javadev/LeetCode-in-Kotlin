package g1601_1700.s1652_defuse_the_bomb

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decrypt() {
        assertThat(
            Solution().decrypt(intArrayOf(5, 7, 1, 4), 3),
            equalTo(intArrayOf(12, 10, 16, 13))
        )
    }

    @Test
    fun decrypt2() {
        assertThat(
            Solution().decrypt(intArrayOf(1, 2, 3, 4), 0), equalTo(intArrayOf(0, 0, 0, 0))
        )
    }

    @Test
    fun decrypt3() {
        assertThat(
            Solution().decrypt(intArrayOf(2, 4, 9, 3), -2),
            equalTo(intArrayOf(12, 5, 6, 13))
        )
    }
}
