package g1101_1200.s1128_number_of_equivalent_domino_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numEquivDominoPairs() {
        assertThat(
            Solution().numEquivDominoPairs(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 1),
                    intArrayOf(3, 4),
                    intArrayOf(5, 6)
                )
            ),
            equalTo(1)
        )
    }

    @Test
    fun numEquivDominoPairs2() {
        assertThat(
            Solution()
                .numEquivDominoPairs(
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(1, 2),
                        intArrayOf(1, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 2)
                    )
                ),
            equalTo(3)
        )
    }
}
