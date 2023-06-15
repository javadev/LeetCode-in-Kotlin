package g1701_1800.s1722_minimize_hamming_distance_after_swap_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumHammingDistance() {
        assertThat(
                Solution()
                        .minimumHammingDistance(intArrayOf(1, 2, 3, 4), intArrayOf(2, 1, 4, 5), arrayOf(intArrayOf(0, 1), intArrayOf(2, 3))),
                equalTo(1))
    }

    @Test
    fun minimumHammingDistance2() {
        assertThat(
                Solution()
                        .minimumHammingDistance(intArrayOf(5, 1, 2, 4, 3), intArrayOf(1, 5, 4, 2, 3), arrayOf(intArrayOf(0, 4), intArrayOf(4, 2), intArrayOf(1, 3), intArrayOf(1, 4))),
                equalTo(0))
    }

    @Test
    fun minimumHammingDistance3() {
        assertThat(
                Solution()
                        .minimumHammingDistance(intArrayOf(1, 2, 3, 4), intArrayOf(1, 3, 2, 4), arrayOf()),
                equalTo(2))
    }
}
