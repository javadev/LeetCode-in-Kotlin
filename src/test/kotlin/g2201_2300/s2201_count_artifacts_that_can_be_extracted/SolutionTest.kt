package g2201_2300.s2201_count_artifacts_that_can_be_extracted

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun digArtifacts() {
        assertThat(
            Solution()
                .digArtifacts(
                    2,
                    arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 1, 1, 1)),
                    arrayOf(intArrayOf(0, 0), intArrayOf(0, 1)),
                ),
            equalTo(1),
        )
    }

    @Test
    fun digArtifacts2() {
        assertThat(
            Solution()
                .digArtifacts(
                    2,
                    arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 1, 1, 1)),
                    arrayOf(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 1)),
                ),
            equalTo(2),
        )
    }
}
