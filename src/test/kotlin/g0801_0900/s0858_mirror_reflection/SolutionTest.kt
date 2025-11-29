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

    @Test
    fun mirrorReflection3() {
        assertThat(Solution().mirrorReflection(4, 2), equalTo(2))
    }

    @Test
    fun mirrorReflection4() {
        assertThat(Solution().mirrorReflection(6, 3), equalTo(2))
    }

    @Test
    fun mirrorReflection5() {
        assertThat(Solution().mirrorReflection(5, 2), equalTo(0))
    }

    @Test
    fun mirrorReflection6() {
        assertThat(Solution().mirrorReflection(7, 3), equalTo(1))
    }

    @Test
    fun mirrorReflection7() {
        assertThat(Solution().mirrorReflection(1000, 250), equalTo(2))
    }

    @Test
    fun mirrorReflection8() {
        assertThat(Solution().mirrorReflection(4, 4), equalTo(1))
    }

    @Test
    fun mirrorReflection9() {
        assertThat(Solution().mirrorReflection(1, 1), equalTo(1))
    }
}
