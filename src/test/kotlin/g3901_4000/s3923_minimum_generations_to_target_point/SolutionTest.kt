package g3901_4000.s3923_minimum_generations_to_target_point

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minGenerations() {
        assertThat<Int>(
            Solution()
                .minGenerations(arrayOf<IntArray>(intArrayOf(0, 0, 0), intArrayOf(6, 6, 6)), intArrayOf(3, 3, 3)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minGenerations2() {
        assertThat<Int>(
            Solution()
                .minGenerations(arrayOf<IntArray>(intArrayOf(0, 0, 0), intArrayOf(5, 5, 5)), intArrayOf(1, 1, 1)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minGenerations3() {
        assertThat<Int>(
            Solution()
                .minGenerations(
                    arrayOf<IntArray>(intArrayOf(0, 0, 0), intArrayOf(2, 2, 2), intArrayOf(3, 3, 3)),
                    intArrayOf(2, 2, 2),
                ),
            equalTo<Int>(0),
        )
    }

    @Test
    fun minGenerations4() {
        assertThat<Int>(
            Solution().minGenerations(arrayOf<IntArray>(intArrayOf(1, 2, 3)), intArrayOf(5, 5, 5)),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minGenerations5() {
        assertThat<Int>(
            Solution()
                .minGenerations(arrayOf<IntArray>(intArrayOf(0, 0, 0), intArrayOf(6, 6, 6)), intArrayOf(1, 2, 3)),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minGenerations6() {
        assertThat<Int>(
            Solution()
                .minGenerations(arrayOf<IntArray>(intArrayOf(0, 2, 4), intArrayOf(5, 3, 1)), intArrayOf(2, 2, 2)),
            equalTo<Int>(1),
        )
    }
}
