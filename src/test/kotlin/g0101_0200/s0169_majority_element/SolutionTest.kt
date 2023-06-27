package g0101_0200.s0169_majority_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun majorityElement() {
        assertThat(Solution().majorityElement(intArrayOf(3, 2, 3)), equalTo(3))
    }

    @Test
    fun majorityElement2() {
        assertThat(Solution().majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)), equalTo(2))
    }
}
