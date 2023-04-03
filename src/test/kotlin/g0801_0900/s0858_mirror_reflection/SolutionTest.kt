package g0801_0900.s0858_mirror_reflection

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mirrorReflection() {
        assertThat(Solution().mirrorReflection(2, 1), equalTo(2))
    }

    @Test
    fun mirrorReflection2() {
        assertThat(Solution().mirrorReflection(3, 1), equalTo(1))
    }
}
