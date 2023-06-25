package g2101_2200.s2169_count_operations_to_obtain_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOperations() {
        assertThat(Solution().countOperations(2, 3), equalTo(3))
    }

    @Test
    fun countOperations2() {
        assertThat(Solution().countOperations(10, 10), equalTo(1))
    }
}
