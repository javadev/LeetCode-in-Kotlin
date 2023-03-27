package g0701_0800.s0771_jewels_and_stones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numJewelsInStones() {
        assertThat(Solution().numJewelsInStones("aA", "aAAbbbb"), equalTo(3))
    }

    @Test
    fun numJewelsInStones2() {
        assertThat(Solution().numJewelsInStones("z", "ZZ"), equalTo(0))
    }
}
