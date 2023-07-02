package g1401_1500.s1444_number_of_ways_of_cutting_a_pizza

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun ways() {
        assertThat(Solution().ways(arrayOf("A..", "AAA", "..."), 3), equalTo(3))
    }

    @Test
    fun ways2() {
        assertThat(Solution().ways(arrayOf("A..", "AA.", "..."), 3), equalTo(1))
    }

    @Test
    fun ways3() {
        assertThat(Solution().ways(arrayOf("A..", "A..", "..."), 1), equalTo(1))
    }
}
