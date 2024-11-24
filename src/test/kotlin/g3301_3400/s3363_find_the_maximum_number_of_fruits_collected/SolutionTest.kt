package g3301_3400.s3363_find_the_maximum_number_of_fruits_collected

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxCollectedFruits() {
        assertThat<Int>(
            Solution()
                .maxCollectedFruits(
                    arrayOf<IntArray>(
                        intArrayOf(1, 2, 3, 4),
                        intArrayOf(5, 6, 8, 7),
                        intArrayOf(9, 10, 11, 12),
                        intArrayOf(13, 14, 15, 16),
                    ),
                ),
            equalTo<Int>(100),
        )
    }

    @Test
    fun maxCollectedFruits2() {
        assertThat<Int>(
            Solution().maxCollectedFruits(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                ),
            ),
            equalTo<Int>(4),
        )
    }
}
