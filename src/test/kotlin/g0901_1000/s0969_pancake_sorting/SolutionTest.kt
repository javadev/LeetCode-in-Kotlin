package g0901_1000.s0969_pancake_sorting

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pancakeSort() {
        assertThat(
            Solution().pancakeSort(intArrayOf(3, 2, 4, 1)),
            equalTo(listOf(3, 4, 2, 3, 1, 2, 1, 1)),
        )
    }

    @Test
    fun pancakeSort2() {
        assertThat(
            Solution().pancakeSort(intArrayOf(1, 2, 3)),
            equalTo(listOf(3, 3, 2, 2, 1, 1)),
        )
    }
}
