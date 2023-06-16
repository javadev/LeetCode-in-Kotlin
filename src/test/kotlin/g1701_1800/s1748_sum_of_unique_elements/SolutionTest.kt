package g1701_1800.s1748_sum_of_unique_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfUnique() {
        assertThat(Solution().sumOfUnique(intArrayOf(1, 2, 3, 2)), equalTo(4))
    }

    @Test
    fun sumOfUnique2() {
        assertThat(Solution().sumOfUnique(intArrayOf(1, 1, 1, 1, 1)), equalTo(0))
    }

    @Test
    fun sumOfUnique3() {
        assertThat(Solution().sumOfUnique(intArrayOf(1, 2, 3, 4, 5)), equalTo(15))
    }
}
