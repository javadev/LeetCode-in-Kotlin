package g2001_2100.s2059_minimum_operations_to_convert_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumOperations() {
        assertThat(Solution().minimumOperations(intArrayOf(2, 4, 12), 2, 12), equalTo(2))
    }

    @Test
    fun minimumOperations2() {
        assertThat(Solution().minimumOperations(intArrayOf(3, 5, 7), 0, -4), equalTo(2))
    }

    @Test
    fun minimumOperations3() {
        assertThat(Solution().minimumOperations(intArrayOf(2, 8, 16), 0, 1), equalTo(-1))
    }
}
