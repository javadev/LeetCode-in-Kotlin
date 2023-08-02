package g2501_2600.s2560_house_robber_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCapability() {
        assertThat(
            Solution().minCapability(intArrayOf(2, 3, 5, 9), 2),
            equalTo(5)
        )
    }

    @Test
    fun minCapability2() {
        assertThat(
            Solution().minCapability(intArrayOf(2, 7, 9, 3, 1), 2),
            equalTo(2)
        )
    }
}
