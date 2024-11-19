package g2301_2400.s2305_fair_distribution_of_cookies

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distributeCookies() {
        assertThat(
            Solution().distributeCookies(intArrayOf(8, 15, 10, 20, 8), 2),
            equalTo(31),
        )
    }

    @Test
    fun distributeCookies2() {
        assertThat(
            Solution().distributeCookies(intArrayOf(6, 1, 3, 2, 2, 4, 1, 2), 3),
            equalTo(7),
        )
    }
}
