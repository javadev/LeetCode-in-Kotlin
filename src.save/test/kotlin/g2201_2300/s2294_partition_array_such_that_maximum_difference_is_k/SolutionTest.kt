package g2201_2300.s2294_partition_array_such_that_maximum_difference_is_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun partitionArray() {
        assertThat(Solution().partitionArray(intArrayOf(3, 6, 1, 2, 5), 2), equalTo(2))
    }

    @Test
    fun partitionArray2() {
        assertThat(Solution().partitionArray(intArrayOf(1, 2, 3), 1), equalTo(2))
    }

    @Test
    fun partitionArray3() {
        assertThat(Solution().partitionArray(intArrayOf(2, 2, 4, 5), 0), equalTo(3))
    }
}
