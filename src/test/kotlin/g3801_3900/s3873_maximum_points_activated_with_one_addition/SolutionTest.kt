package g3801_3900.s3873_maximum_points_activated_with_one_addition

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxActivated() {
        assertThat<Int>(
            Solution().maxActivated(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(1, 2),
                    intArrayOf(2, 2),
                ),
            ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxActivated2() {
        assertThat<Int>(
            Solution().maxActivated(
                arrayOf<IntArray>(
                    intArrayOf(2, 2),
                    intArrayOf(1, 1),
                    intArrayOf(3, 3),
                ),
            ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxActivated3() {
        assertThat<Int>(
            Solution().maxActivated(
                arrayOf<IntArray>(
                    intArrayOf(2, 3),
                    intArrayOf(2, 2),
                    intArrayOf(1, 1),
                    intArrayOf(4, 5),
                ),
            ),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxActivated4() {
        assertThat<Int>(
            Solution().maxActivated(arrayOf<IntArray>(intArrayOf(1, 1))),
            equalTo<Int>(2),
        )
    }

    @Test
    fun maxActivated5() {
        assertThat<Int>(
            Solution().maxActivated(arrayOf<IntArray>(intArrayOf(1, 1), intArrayOf(2, 2))),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxActivated6() {
        assertThat<Int>(
            Solution().maxActivated(arrayOf<IntArray>(intArrayOf(1, 1), intArrayOf(1, 2))),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxActivated7() {
        assertThat<Int>(
            Solution().maxActivated(arrayOf<IntArray>(intArrayOf(1, 1), intArrayOf(2, 1))),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxActivated8() {
        assertThat<Int>(
            Solution().maxActivated(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(1, 2),
                    intArrayOf(1, 3),
                    intArrayOf(1, 4),
                ),
            ),
            equalTo<Int>(5),
        )
    }

    @Test
    fun maxActivated9() {
        assertThat<Int>(
            Solution().maxActivated(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(1, 2),
                    intArrayOf(5, 5),
                    intArrayOf(5, 6),
                ),
            ),
            equalTo<Int>(5),
        )
    }

    @Test
    fun maxActivated10() {
        assertThat<Int>(
            Solution()
                .maxActivated(
                    arrayOf<IntArray>(
                        intArrayOf(1, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 2),
                        intArrayOf(3, 3),
                        intArrayOf(3, 4),
                        intArrayOf(4, 4),
                    ),
                ),
            equalTo<Int>(7),
        )
    }

    @Test
    fun maxActivated11() {
        assertThat<Int>(
            Solution().maxActivated(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(2, 2),
                    intArrayOf(3, 3),
                    intArrayOf(4, 4),
                ),
            ),
            equalTo<Int>(3),
        )
    }

    @Test
    fun maxActivated12() {
        assertThat<Int>(
            Solution().maxActivated(
                arrayOf<IntArray>(
                    intArrayOf(10, 10),
                    intArrayOf(10, 20),
                    intArrayOf(20, 20),
                    intArrayOf(20, 10),
                ),
            ),
            equalTo<Int>(5),
        )
    }
}
