package g2001_2100.s2065_maximum_path_quality_of_a_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximalPathQuality() {
        assertThat(
            Solution()
                .maximalPathQuality(
                    intArrayOf(0, 32, 10, 43),
                    arrayOf(intArrayOf(0, 1, 10), intArrayOf(1, 2, 15), intArrayOf(0, 3, 10)),
                    49,
                ),
            equalTo(75),
        )
    }

    @Test
    fun maximalPathQuality2() {
        assertThat(
            Solution()
                .maximalPathQuality(
                    intArrayOf(1, 2, 3, 4),
                    arrayOf(intArrayOf(0, 1, 10), intArrayOf(1, 2, 11), intArrayOf(2, 3, 12), intArrayOf(1, 3, 13)),
                    50,
                ),
            equalTo(7),
        )
    }

    @Test
    fun maximalPathQuality3() {
        assertThat(
            Solution()
                .maximalPathQuality(
                    intArrayOf(5, 10, 15, 20),
                    arrayOf(intArrayOf(0, 1, 10), intArrayOf(1, 2, 10), intArrayOf(0, 3, 10)),
                    30,
                ),
            equalTo(25),
        )
    }
}
