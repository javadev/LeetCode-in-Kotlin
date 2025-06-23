package g3501_3600.s3592_inverse_coin_change

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findCoins() {
        assertThat<List<Int>>(
            Solution().findCoins(intArrayOf(0, 1, 0, 2, 0, 3, 0, 4, 0, 5)),
            equalTo<List<Int>>(mutableListOf<Int>(2, 4, 6)),
        )
    }

    @Test
    fun findCoins2() {
        assertThat<List<Int>>(
            Solution().findCoins(intArrayOf(1, 2, 2, 3, 4)),
            equalTo<List<Int>>(mutableListOf<Int>(1, 2, 5)),
        )
    }

    @Test
    fun findCoins3() {
        assertThat<List<Int>>(
            Solution().findCoins(intArrayOf(1, 2, 3, 4, 15)),
            equalTo<List<Int>>(mutableListOf<Int>()),
        )
    }
}
