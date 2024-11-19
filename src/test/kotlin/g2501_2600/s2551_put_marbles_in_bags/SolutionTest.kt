package g2501_2600.s2551_put_marbles_in_bags

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun putMarbles() {
        assertThat(
            Solution().putMarbles(intArrayOf(1, 3, 5, 1), 2),
            equalTo(4),
        )
    }

    @Test
    fun putMarbles2() {
        assertThat(
            Solution().putMarbles(intArrayOf(1, 3), 2),
            equalTo(0),
        )
    }
}
