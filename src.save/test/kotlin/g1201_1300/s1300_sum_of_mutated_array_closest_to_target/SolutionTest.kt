package g1201_1300.s1300_sum_of_mutated_array_closest_to_target

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findBestValue() {
        assertThat(Solution().findBestValue(intArrayOf(4, 9, 3), 10), equalTo(3))
    }

    @Test
    fun findBestValue2() {
        assertThat(Solution().findBestValue(intArrayOf(2, 3, 5), 10), equalTo(5))
    }
}
