package g0401_0500.s0433_minimum_genetic_mutation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMutation() {
        assertThat(
            Solution().minMutation("AACCGGTT", "AACCGGTA", arrayOf("AACCGGTA")),
            equalTo(1)
        )
    }

    @Test
    fun minMutation2() {
        assertThat(
            Solution()
                .minMutation(
                    "AACCGGTT",
                    "AAACGGTA", arrayOf("AACCGGTA", "AACCGCTA", "AAACGGTA")
                ),
            equalTo(2)
        )
    }

    @Test
    fun minMutation3() {
        assertThat(
            Solution()
                .minMutation(
                    "AAAAACCC",
                    "AACCCCCC", arrayOf("AAAACCCC", "AAACCCCC", "AACCCCCC")
                ),
            equalTo(3)
        )
    }
}
