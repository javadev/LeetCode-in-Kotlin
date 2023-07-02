package g0401_0500.s0470_implement_rand10_using_rand7

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rand10() {
        for (i in 0..0) {
            val result = Solution().rand10()
            assertThat(result >= 1 && result <= 10, equalTo(true))
        }
    }

    @Test
    fun rand102() {
        for (i in 0..1) {
            val result = Solution().rand10()
            assertThat(result >= 1 && result <= 10, equalTo(true))
        }
    }

    @Test
    fun rand103() {
        for (i in 0..2) {
            val result = Solution().rand10()
            assertThat(result >= 1 && result <= 10, equalTo(true))
        }
    }
}
