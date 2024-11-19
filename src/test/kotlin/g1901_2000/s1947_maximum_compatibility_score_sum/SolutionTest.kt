package g1901_2000.s1947_maximum_compatibility_score_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxCompatibilitySum() {
        assertThat(
            Solution()
                .maxCompatibilitySum(
                    arrayOf(
                        intArrayOf(1, 1, 0),
                        intArrayOf(1, 0, 1),
                        intArrayOf(0, 0, 1),
                    ),
                    arrayOf(
                        intArrayOf(1, 0, 0),
                        intArrayOf(0, 0, 1),
                        intArrayOf(1, 1, 0),
                    ),
                ),
            equalTo(8),
        )
    }

    @Test
    fun maxCompatibilitySum2() {
        assertThat(
            Solution()
                .maxCompatibilitySum(
                    arrayOf(
                        intArrayOf(0, 0),
                        intArrayOf(0, 0),
                        intArrayOf(0, 0),
                    ),
                    arrayOf(intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(1, 1)),
                ),
            equalTo(0),
        )
    }
}
