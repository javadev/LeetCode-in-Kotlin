package g3401_3500.s3495_minimum_operations_to_make_array_elements_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Long>(
            Solution().minOperations(
                arrayOf<IntArray>(
                    intArrayOf(1, 2),
                    intArrayOf(2, 4),
                ),
            ),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun minOperations2() {
        assertThat<Long>(
            Solution().minOperations(arrayOf<IntArray>(intArrayOf(2, 6))),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun minOperations3() {
        assertThat<Long>(
            Solution().minOperations(arrayOf<IntArray>(intArrayOf(5, 8))),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun minOperations4() {
        assertThat<Long>(
            Solution().minOperations(arrayOf<IntArray>(intArrayOf(1, 21))),
            equalTo<Long>(23L),
        )
    }
}
