package g1901_2000.s1920_build_array_from_permutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun buildArray() {
        assertThat(
            Solution().buildArray(intArrayOf(0, 2, 1, 5, 3, 4)),
            equalTo(intArrayOf(0, 1, 2, 4, 5, 3))
        )
    }

    @Test
    fun buildArray2() {
        assertThat(
            Solution().buildArray(intArrayOf(5, 0, 1, 2, 3, 4)),
            equalTo(intArrayOf(4, 5, 0, 1, 2, 3))
        )
    }
}
