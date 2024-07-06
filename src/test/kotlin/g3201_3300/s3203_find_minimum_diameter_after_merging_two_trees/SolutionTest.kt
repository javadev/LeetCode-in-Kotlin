package g3201_3300.s3203_find_minimum_diameter_after_merging_two_trees

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDiameterAfterMerge() {
        assertThat(
            Solution()
                .minimumDiameterAfterMerge(
                    arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(0, 3)), arrayOf(intArrayOf(0, 1))
                ),
            equalTo(3)
        )
    }

    @Test
    fun minimumDiameterAfterMerge2() {
        assertThat(
            Solution()
                .minimumDiameterAfterMerge(
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(0, 2),
                        intArrayOf(0, 3),
                        intArrayOf(2, 4),
                        intArrayOf(2, 5),
                        intArrayOf(3, 6),
                        intArrayOf(2, 7)
                    ),
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(0, 2),
                        intArrayOf(0, 3),
                        intArrayOf(2, 4),
                        intArrayOf(2, 5),
                        intArrayOf(3, 6),
                        intArrayOf(2, 7)
                    )
                ),
            equalTo(5)
        )
    }
}
