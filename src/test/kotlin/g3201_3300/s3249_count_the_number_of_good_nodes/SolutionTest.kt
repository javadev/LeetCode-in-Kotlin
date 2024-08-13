package g3201_3300.s3249_count_the_number_of_good_nodes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodNodes() {
        assertThat(
            Solution()
                .countGoodNodes(
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(0, 2),
                        intArrayOf(1, 3),
                        intArrayOf(1, 4),
                        intArrayOf(2, 5),
                        intArrayOf(2, 6)
                    )
                ),
            equalTo(7)
        )
    }

    @Test
    fun countGoodNodes2() {
        assertThat(
            Solution()
                .countGoodNodes(
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 3),
                        intArrayOf(3, 4),
                        intArrayOf(0, 5),
                        intArrayOf(1, 6),
                        intArrayOf(2, 7),
                        intArrayOf(3, 8)
                    )
                ),
            equalTo(6)
        )
    }
}
