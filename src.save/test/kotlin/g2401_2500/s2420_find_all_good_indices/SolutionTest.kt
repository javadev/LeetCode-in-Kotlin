package g2401_2500.s2420_find_all_good_indices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun goodIndices() {
        assertThat(
            Solution().goodIndices(intArrayOf(2, 1, 1, 1, 3, 4, 1), 2),
            equalTo(listOf(2, 3))
        )
    }

    @Test
    fun goodIndices2() {
        assertThat(
            Solution().goodIndices(intArrayOf(2, 1, 1, 2), 2),
            equalTo(emptyList<Any>())
        )
    }
}
