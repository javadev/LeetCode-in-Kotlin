package g1801_1900.s1846_maximum_element_after_decreasing_and_rearranging

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumElementAfterDecrementingAndRearranging() {
        assertThat(
            Solution()
                .maximumElementAfterDecrementingAndRearranging(intArrayOf(2, 2, 1, 2, 1)),
            equalTo(2)
        )
    }

    @Test
    fun maximumElementAfterDecrementingAndRearranging2() {
        assertThat(
            Solution()
                .maximumElementAfterDecrementingAndRearranging(intArrayOf(100, 1, 1000)),
            equalTo(3)
        )
    }

    @Test
    fun maximumElementAfterDecrementingAndRearranging3() {
        assertThat(
            Solution()
                .maximumElementAfterDecrementingAndRearranging(intArrayOf(1, 2, 3, 4, 5)),
            equalTo(5)
        )
    }
}
