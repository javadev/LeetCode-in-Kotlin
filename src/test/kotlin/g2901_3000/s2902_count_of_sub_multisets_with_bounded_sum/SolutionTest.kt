package g2901_3000.s2902_count_of_sub_multisets_with_bounded_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubMultisets() {
        assertThat(Solution().countSubMultisets(mutableListOf(1, 2, 2, 3), 6, 6), equalTo(1))
    }

    @Test
    fun countSubMultisets2() {
        assertThat(
            Solution().countSubMultisets(mutableListOf(2, 1, 4, 2, 7), 1, 5),
            equalTo(7),
        )
    }

    @Test
    fun countSubMultisets3() {
        assertThat(
            Solution().countSubMultisets(mutableListOf(1, 2, 1, 3, 5, 2), 3, 5),
            equalTo(9),
        )
    }
}
