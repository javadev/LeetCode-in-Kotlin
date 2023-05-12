package g0901_1000.s0996_number_of_squareful_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSquarefulPerms() {
        assertThat(Solution().numSquarefulPerms(intArrayOf(1, 17, 8)), equalTo(2))
    }

    @Test
    fun numSquarefulPerms2() {
        assertThat(Solution().numSquarefulPerms(intArrayOf(2, 2, 2)), equalTo(1))
    }
}
