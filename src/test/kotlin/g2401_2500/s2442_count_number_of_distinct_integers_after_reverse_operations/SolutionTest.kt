package g2401_2500.s2442_count_number_of_distinct_integers_after_reverse_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDistinctIntegers() {
        assertThat(
            Solution().countDistinctIntegers(intArrayOf(1, 13, 10, 12, 31)),
            equalTo(6)
        )
    }

    @Test
    fun countDistinctIntegers2() {
        assertThat(Solution().countDistinctIntegers(intArrayOf(2, 2, 2)), equalTo(1))
    }
}
