package g2101_2200.s2149_rearrange_array_elements_by_sign

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rearrangeArray() {
        assertThat(
            Solution().rearrangeArray(intArrayOf(3, 1, -2, -5, 2, -4)),
            equalTo(intArrayOf(3, -2, 1, -5, 2, -4)),
        )
    }

    @Test
    fun rearrangeArray2() {
        assertThat(Solution().rearrangeArray(intArrayOf(-1, 1)), equalTo(intArrayOf(1, -1)))
    }
}
