package g1901_2000.s1936_add_minimum_number_of_rungs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun addRungs() {
        assertThat(Solution().addRungs(intArrayOf(3, 6, 8, 10), 3), equalTo(0))
    }

    @Test
    fun addRungs2() {
        assertThat(Solution().addRungs(intArrayOf(3, 4, 6, 7), 2), equalTo(1))
    }
}
