package g2901_3000.s2963_count_the_number_of_good_partitions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfGoodPartitions() {
        assertThat(Solution().numberOfGoodPartitions(intArrayOf(1, 2, 3, 4)), equalTo(8))
    }

    @Test
    fun numberOfGoodPartitions2() {
        assertThat(Solution().numberOfGoodPartitions(intArrayOf(1, 1, 1, 1)), equalTo(1))
    }

    @Test
    fun numberOfGoodPartitions3() {
        assertThat(Solution().numberOfGoodPartitions(intArrayOf(1, 2, 1, 3)), equalTo(2))
    }
}
