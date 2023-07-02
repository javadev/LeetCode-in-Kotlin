package g2301_2400.s2369_check_if_there_is_a_valid_partition_for_the_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validPartition() {
        assertThat(Solution().validPartition(intArrayOf(4, 4, 4, 5, 6)), equalTo(true))
    }

    @Test
    fun validPartition2() {
        assertThat(Solution().validPartition(intArrayOf(1, 1, 1, 2)), equalTo(false))
    }

    @Test
    fun validPartition3() {
        assertThat(Solution().validPartition(intArrayOf(1, 2)), equalTo(false))
    }

    @Test
    fun validPartition4() {
        assertThat(Solution().validPartition(intArrayOf(1, 3)), equalTo(false))
    }
}
