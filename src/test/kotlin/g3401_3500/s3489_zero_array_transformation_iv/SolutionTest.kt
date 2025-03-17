package g3401_3500.s3489_zero_array_transformation_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minZeroArray() {
        assertThat<Int>(
            Solution()
                .minZeroArray(
                    intArrayOf(2, 0, 2),
                    arrayOf<IntArray>(intArrayOf(0, 2, 1), intArrayOf(0, 2, 1), intArrayOf(1, 1, 3)),
                ),
            equalTo<Int>(2),
        )
    }

    @Test
    fun minZeroArray2() {
        assertThat<Int>(
            Solution()
                .minZeroArray(intArrayOf(4, 3, 2, 1), arrayOf<IntArray>(intArrayOf(1, 3, 2), intArrayOf(0, 2, 1))),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun minZeroArray3() {
        assertThat<Int>(
            Solution()
                .minZeroArray(
                    intArrayOf(1, 2, 3, 2, 1),
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 1),
                        intArrayOf(1, 2, 1),
                        intArrayOf(2, 3, 2),
                        intArrayOf(3, 4, 1),
                        intArrayOf(4, 4, 1),
                    ),
                ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun minZeroArray4() {
        assertThat<Int>(
            Solution()
                .minZeroArray(
                    intArrayOf(1, 2, 3, 2, 6),
                    arrayOf<IntArray>(
                        intArrayOf(0, 1, 1),
                        intArrayOf(0, 2, 1),
                        intArrayOf(1, 4, 2),
                        intArrayOf(4, 4, 4),
                        intArrayOf(3, 4, 1),
                        intArrayOf(4, 4, 5),
                    ),
                ),
            equalTo<Int>(4),
        )
    }
}
