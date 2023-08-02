package g1301_1400.s1388_pizza_with_3n_slices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSizeSlices() {
        assertThat(Solution().maxSizeSlices(intArrayOf(1, 2, 3, 4, 5, 6)), equalTo(10))
    }

    @Test
    fun maxSizeSlices2() {
        assertThat(Solution().maxSizeSlices(intArrayOf(8, 9, 8, 6, 1, 1)), equalTo(16))
    }
}
