package g3401_3500.s3413_maximum_coins_from_k_consecutive_bags

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumCoins() {
        assertThat<Long>(
            Solution().maximumCoins(
                arrayOf<IntArray>(intArrayOf(8, 10, 1), intArrayOf(1, 3, 2), intArrayOf(5, 6, 4)),
                4,
            ),
            equalTo<Long>(10L),
        )
    }

    @Test
    fun maximumCoins2() {
        assertThat<Long>(
            Solution().maximumCoins(arrayOf<IntArray>(intArrayOf(1, 10, 3)), 2),
            equalTo<Long>(6L),
        )
    }
}
