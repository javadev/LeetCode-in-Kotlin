package g2601_2700.s2656_maximum_sum_with_exactly_k_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeSum() {
        assertThat(
            Solution().maximizeSum(intArrayOf(1, 2, 3, 4, 5), 3),
            equalTo(18),
        )
    }

    @Test
    fun maximizeSum2() {
        assertThat(
            Solution().maximizeSum(intArrayOf(5, 5, 5), 2),
            equalTo(11),
        )
    }
}
