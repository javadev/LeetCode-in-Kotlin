package g1701_1800.s1782_count_pairs_of_nodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPairs() {
        assertThat(
            Solution()
                .countPairs(
                    4,
                    arrayOf(
                        intArrayOf(1, 2), intArrayOf(2, 4), intArrayOf(1, 3),
                        intArrayOf(2, 3), intArrayOf(2, 1)
                    ),
                    intArrayOf(2, 3)
                ),
            equalTo(intArrayOf(6, 5))
        )
    }

    @Test
    fun countPairs2() {
        assertThat(
            Solution()
                .countPairs(
                    5,
                    arrayOf(
                        intArrayOf(1, 5), intArrayOf(1, 5), intArrayOf(3, 4),
                        intArrayOf(2, 5), intArrayOf(1, 3), intArrayOf(5, 1),
                        intArrayOf(2, 3), intArrayOf(2, 5)
                    ),
                    intArrayOf(1, 2, 3, 4, 5)
                ),
            equalTo(intArrayOf(10, 10, 9, 8, 6))
        )
    }
}
