package g1901_2000.s1938_maximum_genetic_difference_query

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxGeneticDifference() {
        assertThat(
            Solution()
                .maxGeneticDifference(
                    intArrayOf(-1, 0, 1, 1),
                    arrayOf(
                        intArrayOf(0, 2),
                        intArrayOf(3, 2),
                        intArrayOf(2, 5),
                    ),
                ),
            equalTo(intArrayOf(2, 3, 7)),
        )
    }

    @Test
    fun maxGeneticDifference2() {
        assertThat(
            Solution()
                .maxGeneticDifference(
                    intArrayOf(3, 7, -1, 2, 0, 7, 0, 2),
                    arrayOf(intArrayOf(4, 6), intArrayOf(1, 15), intArrayOf(0, 5)),
                ),
            equalTo(intArrayOf(6, 14, 7)),
        )
    }
}
