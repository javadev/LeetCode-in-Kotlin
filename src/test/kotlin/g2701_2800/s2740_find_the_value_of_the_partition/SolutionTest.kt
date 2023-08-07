package g2701_2800.s2740_find_the_value_of_the_partition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findValueOfPartition() {
        assertThat(Solution().findValueOfPartition(intArrayOf(1, 3, 2, 4)), equalTo(1))
    }

    @Test
    fun findValueOfPartition2() {
        assertThat(Solution().findValueOfPartition(intArrayOf(100, 1, 10)), equalTo(9))
    }
}
