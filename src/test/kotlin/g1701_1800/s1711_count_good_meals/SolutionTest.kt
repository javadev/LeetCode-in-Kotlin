package g1701_1800.s1711_count_good_meals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        assertThat(Solution().countPairs(intArrayOf(1, 3, 5, 7, 9)), equalTo(4))
    }

    @Test
    fun countPairs2() {
        assertThat(Solution().countPairs(intArrayOf(1, 1, 1, 3, 3, 3, 7)), equalTo(15))
    }
}
