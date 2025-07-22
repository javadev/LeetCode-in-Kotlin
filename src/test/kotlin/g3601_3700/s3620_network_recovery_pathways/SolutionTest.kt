package g3601_3700.s3620_network_recovery_pathways

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxPathScore() {
        assertThat<Int>(
            Solution()
                .findMaxPathScore(
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 5),
                        intArrayOf(1, 3, 10),
                        intArrayOf(0, 2, 3),
                        intArrayOf(2, 3, 4),
                    ),
                    booleanArrayOf(true, true, true, true),
                    10L,
                ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun findMaxPathScore2() {
        assertThat<Int>(
            Solution()
                .findMaxPathScore(
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 7),
                        intArrayOf(1, 4, 5),
                        intArrayOf(0, 2, 6),
                        intArrayOf(2, 3, 6),
                        intArrayOf(3, 4, 2),
                        intArrayOf(2, 4, 6),
                    ),
                    booleanArrayOf(true, true, true, false, true),
                    12L,
                ),
            equalTo<Int>(6),
        )
    }
}
