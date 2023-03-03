package g0701_0800.s0740_delete_and_earn

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deleteAndEarn() {
        assertThat(Solution().deleteAndEarn(intArrayOf(3, 4, 3)), equalTo(6))
    }

    @Test
    fun deleteAndEarn2() {
        assertThat(Solution().deleteAndEarn(intArrayOf(2, 2, 3, 3, 3, 4)), equalTo(9))
    }
}
