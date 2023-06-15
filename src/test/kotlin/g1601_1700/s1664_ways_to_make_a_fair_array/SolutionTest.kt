package g1601_1700.s1664_ways_to_make_a_fair_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToMakeFair() {
        assertThat(Solution().waysToMakeFair(intArrayOf(2, 1, 6, 4)), equalTo(1))
    }

    @Test
    fun waysToMakeFair2() {
        assertThat(Solution().waysToMakeFair(intArrayOf(1, 1, 1)), equalTo(3))
    }

    @Test
    fun waysToMakeFair3() {
        assertThat(Solution().waysToMakeFair(intArrayOf(1, 2, 3)), equalTo(0))
    }
}
