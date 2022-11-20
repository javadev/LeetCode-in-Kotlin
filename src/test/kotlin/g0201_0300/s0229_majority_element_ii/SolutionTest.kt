package g0201_0300.s0229_majority_element_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun majorityElement() {
        assertThat(Solution().majorityElement(intArrayOf(3, 2, 3)), equalTo(listOf(3)))
    }

    @Test
    fun majorityElement2() {
        assertThat(
            Solution().majorityElement(intArrayOf(1)),
            equalTo(listOf(1))
        )
    }

    @Test
    fun majorityElement3() {
        assertThat(Solution().majorityElement(intArrayOf(1, 2)), equalTo(listOf(2, 1)))
    }
}
