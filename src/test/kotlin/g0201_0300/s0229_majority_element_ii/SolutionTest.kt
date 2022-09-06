package g0201_0300.s0229_majority_element_ii

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun majorityElement() {
        MatcherAssert.assertThat(
            Solution().majorityElement(intArrayOf(3, 2, 3)),
            CoreMatchers.equalTo(listOf(3))
        )
    }

    @Test
    fun majorityElement2() {
        MatcherAssert.assertThat(
            Solution().majorityElement(intArrayOf(1)),
            CoreMatchers.equalTo(listOf(1))
        )
    }

    @Test
    fun majorityElement3() {
        MatcherAssert.assertThat(
            Solution().majorityElement(intArrayOf(1, 2)),
            CoreMatchers.equalTo(listOf(2, 1))
        )
    }
}
