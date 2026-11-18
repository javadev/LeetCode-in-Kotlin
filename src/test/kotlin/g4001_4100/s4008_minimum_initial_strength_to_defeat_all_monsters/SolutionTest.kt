package g4001_4100.s4008_minimum_initial_strength_to_defeat_all_monsters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minInitialStrength() {
        assertThat<Long>(
            Solution().minInitialStrength(intArrayOf(5, 10, 15), arrayOf<IntArray>(intArrayOf(1, 1, 10))),
            equalTo<Long>(30L),
        )
    }

    @Test
    fun minInitialStrength2() {
        assertThat<Long>(
            Solution()
                .minInitialStrength(
                    intArrayOf(5, 10, 15),
                    arrayOf<IntArray>(intArrayOf(1, 2, 10), intArrayOf(1, 2, 5)),
                ),
            equalTo<Long>(5L),
        )
    }
}
