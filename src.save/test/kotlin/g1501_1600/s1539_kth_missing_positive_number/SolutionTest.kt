package g1501_1600.s1539_kth_missing_positive_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findKthPositive() {
        assertThat(Solution().findKthPositive(intArrayOf(2, 3, 4, 7, 11), 5), equalTo(9))
    }

    @Test
    fun findKthPositive2() {
        assertThat(Solution().findKthPositive(intArrayOf(1, 2, 3, 4), 2), equalTo(6))
    }
}
