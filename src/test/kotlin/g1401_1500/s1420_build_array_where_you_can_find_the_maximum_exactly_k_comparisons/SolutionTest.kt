package g1401_1500.s1420_build_array_where_you_can_find_the_maximum_exactly_k_comparisons

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numOfArrays() {
        assertThat(Solution().numOfArrays(2, 3, 1), equalTo(6))
    }

    @Test
    fun numOfArrays2() {
        assertThat(Solution().numOfArrays(5, 2, 3), equalTo(0))
    }

    @Test
    fun numOfArrays3() {
        assertThat(Solution().numOfArrays(9, 1, 1), equalTo(1))
    }
}
