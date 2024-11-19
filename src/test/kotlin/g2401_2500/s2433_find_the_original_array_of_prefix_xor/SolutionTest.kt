package g2401_2500.s2433_find_the_original_array_of_prefix_xor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findArray() {
        assertThat(
            Solution().findArray(intArrayOf(5, 2, 0, 3, 1)),
            equalTo(intArrayOf(5, 7, 2, 3, 2)),
        )
    }

    @Test
    fun findArray2() {
        assertThat(Solution().findArray(intArrayOf(13)), equalTo(intArrayOf(13)))
    }
}
