package g2501_2600.s2572_count_the_number_of_square_free_subsets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun squareFreeSubsets() {
        assertThat(
            Solution().squareFreeSubsets(intArrayOf(3, 4, 4, 5)),
            equalTo(3),
        )
    }

    @Test
    fun squareFreeSubsets2() {
        assertThat(
            Solution().squareFreeSubsets(intArrayOf(1)),
            equalTo(1),
        )
    }

    @Test
    fun squareFreeSubsets3() {
        assertThat(
            Solution().squareFreeSubsets(intArrayOf(26, 6, 4, 27, 6, 18)),
            equalTo(3),
        )
    }

    @Test
    fun squareFreeSubsets4() {
        assertThat(
            Solution().squareFreeSubsets(intArrayOf(8, 11, 17, 2, 25, 29, 21, 20, 4, 22)),
            equalTo(39),
        )
    }
}
