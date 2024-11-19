package g3301_3400.s3310_remove_methods_from_project

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun remainingMethods() {
        assertThat<List<Int>>(
            Solution().remainingMethods(4, 1, arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(0, 1), intArrayOf(3, 2))),
            equalTo<List<Int>>(listOf<Int>(0, 1, 2, 3)),
        )
    }

    @Test
    fun remainingMethods2() {
        assertThat<List<Int>>(
            Solution().remainingMethods(
                5,
                0,
                arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(0, 2), intArrayOf(0, 1), intArrayOf(3, 4)),
            ),
            equalTo<List<Int>>(listOf<Int>(3, 4)),
        )
    }

    @Test
    fun remainingMethods3() {
        assertThat<List<Int>>(
            Solution().remainingMethods(3, 2, arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(0, 1), intArrayOf(2, 0))),
            equalTo<List<out Any>>(listOf<Any>()),
        )
    }
}
