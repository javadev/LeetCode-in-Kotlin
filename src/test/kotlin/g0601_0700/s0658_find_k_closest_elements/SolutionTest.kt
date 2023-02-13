package g0601_0700.s0658_find_k_closest_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findClosestElements() {
        assertThat(
            Solution().findClosestElements(intArrayOf(1, 2, 3, 4, 5), 4, 3),
            equalTo(listOf(1, 2, 3, 4))
        )
    }

    @Test
    fun findClosestElements2() {
        assertThat(
            Solution().findClosestElements(intArrayOf(1, 2, 3, 4, 5), 4, -1),
            equalTo(listOf(1, 2, 3, 4))
        )
    }
}
