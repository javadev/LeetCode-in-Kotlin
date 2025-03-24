package g3401_3500.s3493_properties_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfComponents() {
        assertThat<Int>(
            Solution()
                .numberOfComponents(
                    arrayOf<IntArray>(
                        intArrayOf(1, 2),
                        intArrayOf(1, 1),
                        intArrayOf(3, 4),
                        intArrayOf(4, 5),
                        intArrayOf(5, 6),
                        intArrayOf(7, 7),
                    ),
                    1,
                ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun numberOfComponents2() {
        assertThat<Int>(
            Solution().numberOfComponents(
                arrayOf<IntArray>(
                    intArrayOf(1, 2, 3),
                    intArrayOf(2, 3, 4),
                    intArrayOf(4, 3, 5),
                ),
                2,
            ),
            equalTo<Int>(1),
        )
    }

    @Test
    fun numberOfComponents3() {
        assertThat<Int>(
            Solution().numberOfComponents(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1),
                ),
                2,
            ),
            equalTo<Int>(2),
        )
    }
}
