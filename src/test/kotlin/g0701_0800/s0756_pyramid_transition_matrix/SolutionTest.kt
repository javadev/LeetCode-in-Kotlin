package g0701_0800.s0756_pyramid_transition_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pyramidTransition() {
        assertThat(
            Solution().pyramidTransition("BCD", listOf("BCC", "CDE", "CEA", "FFF")),
            equalTo(true),
        )
    }

    @Test
    fun pyramidTransition2() {
        assertThat(
            Solution()
                .pyramidTransition(
                    "AAAA",
                    listOf("AAB", "AAC", "BCD", "BBE", "DEF"),
                ),
            equalTo(false),
        )
    }
}
