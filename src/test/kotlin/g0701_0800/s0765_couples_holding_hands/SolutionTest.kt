package g0701_0800.s0765_couples_holding_hands

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSwapsCouples() {
        assertThat(Solution().minSwapsCouples(intArrayOf(0, 2, 1, 3)), equalTo(1))
    }

    @Test
    fun minSwapsCouples2() {
        assertThat(
            Solution().minSwapsCouples(intArrayOf(0, 4, 7, 3, 1, 5, 2, 8, 6, 9)),
            equalTo(3),
        )
    }

    @Test
    fun minSwapsCouples3() {
        assertThat(
            Solution().minSwapsCouples(intArrayOf(5, 6, 4, 0, 2, 1, 9, 3, 8, 7, 11, 10)),
            equalTo(4),
        )
    }
}
