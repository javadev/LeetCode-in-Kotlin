package g0401_0500.s0458_poor_pigs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun poorPigs() {
        assertThat(Solution().poorPigs(1000, 15, 60), equalTo(5))
    }

    @Test
    fun poorPigs2() {
        assertThat(Solution().poorPigs(4, 15, 15), equalTo(2))
    }

    @Test
    fun poorPigs3() {
        assertThat(Solution().poorPigs(4, 15, 30), equalTo(2))
    }
}
