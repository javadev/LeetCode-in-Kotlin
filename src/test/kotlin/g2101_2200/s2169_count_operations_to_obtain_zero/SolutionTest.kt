package g2101_2200.s2169_count_operations_to_obtain_zero

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOperations() {
        MatcherAssert.assertThat(Solution().countOperations(2, 3), CoreMatchers.equalTo(3))
    }

    @Test
    fun countOperations2() {
        MatcherAssert.assertThat(Solution().countOperations(10, 10), CoreMatchers.equalTo(1))
    }
}
