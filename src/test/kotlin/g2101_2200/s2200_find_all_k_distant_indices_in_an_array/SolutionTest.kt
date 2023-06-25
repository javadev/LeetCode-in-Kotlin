package g2101_2200.s2200_find_all_k_distant_indices_in_an_array

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKDistantIndices() {
        MatcherAssert.assertThat(
            Solution().findKDistantIndices(intArrayOf(3, 4, 9, 1, 3, 9, 5), 9, 1),
            CoreMatchers.equalTo(mutableListOf(1, 2, 3, 4, 5, 6))
        )
    }

    @Test
    fun findKDistantIndices2() {
        MatcherAssert.assertThat(
            Solution().findKDistantIndices(intArrayOf(2, 2, 2, 2, 2), 2, 2),
            CoreMatchers.equalTo(mutableListOf(0, 1, 2, 3, 4))
        )
    }
}
