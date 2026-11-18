package g4001_4100.s4010_maximize_pair_strength_using_gcd

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPairStrength() {
        assertThat<Long>(
            Solution().maxPairStrength(intArrayOf(2, 3, 5)),
            equalTo<Long>(15L),
        )
    }

    @Test
    fun maxPairStrength2() {
        assertThat<Long>(
            Solution().maxPairStrength(intArrayOf(4, 6, 8)),
            equalTo<Long>(12L),
        )
    }
}
