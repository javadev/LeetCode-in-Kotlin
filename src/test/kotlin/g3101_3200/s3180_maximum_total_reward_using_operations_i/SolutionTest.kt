package g3101_3200.s3180_maximum_total_reward_using_operations_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxTotalReward() {
        assertThat(Solution().maxTotalReward(intArrayOf(1, 1, 3, 3)), equalTo(4))
    }

    @Test
    fun maxTotalReward2() {
        assertThat(Solution().maxTotalReward(intArrayOf(1, 6, 4, 3, 2)), equalTo(11))
    }
}
