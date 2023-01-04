package g0401_0500.s0495_teemo_attacking

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPoisonedDuration() {
        assertThat(Solution().findPoisonedDuration(intArrayOf(1, 4), 2), equalTo(4))
    }

    @Test
    fun findPoisonedDuration2() {
        assertThat(Solution().findPoisonedDuration(intArrayOf(1, 2), 2), equalTo(3))
    }
}
