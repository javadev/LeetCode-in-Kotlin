package g1101_1200.s1128_number_of_equivalent_domino_pairs

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numEquivDominoPairs() {
        MatcherAssert.assertThat(
            Solution().numEquivDominoPairs(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 1),
                    intArrayOf(3, 4),
                    intArrayOf(5, 6)
                )
            ),
            CoreMatchers.equalTo(1)
        )
    }

    @Test
    fun numEquivDominoPairs2() {
        MatcherAssert.assertThat(
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
            CoreMatchers.equalTo(3)
        )
    }
}