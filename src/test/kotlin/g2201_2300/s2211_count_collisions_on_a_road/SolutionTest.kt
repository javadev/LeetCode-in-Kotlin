package g2201_2300.s2211_count_collisions_on_a_road

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCollisions() {
        assertThat(Solution().countCollisions("RLRSLL"), equalTo(5))
    }

    @Test
    fun countCollisions2() {
        assertThat(Solution().countCollisions("LLRR"), equalTo(0))
    }

    @Test
    fun countCollisions3() {
        assertThat(
            Solution().countCollisions("SRRLRLRSRLRSSRRLSLRLLRSLSLLSSRRLSRSLSLRRS"),
            equalTo(28),
        )
    }

    @Test
    fun countCollisions4() {
        assertThat(
            Solution().countCollisions("SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR"),
            equalTo(20),
        )
    }
}
