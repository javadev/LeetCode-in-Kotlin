package g3601_3700.s3618_split_array_by_prime_indices

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitArray() {
        assertThat<Long>(Solution().splitArray(intArrayOf(2, 3, 4)), equalTo<Long>(1L))
    }

    @Test
    fun splitArray2() {
        assertThat<Long>(Solution().splitArray(intArrayOf(-1, 5, 7, 0)), equalTo<Long>(3L))
    }

    @Test
    fun splitArray3() {
        assertThat<Long>(
            Solution()
                .splitArray(
                    intArrayOf(
                        -54818575,
                        801071518,
                        745054848,
                        -415289833,
                        161564441,
                        706292027,
                        306478283,
                        943480367,
                        222076810,
                        992619933,
                    ),
                ),
            equalTo<Long>(449455001L),
        )
    }
}
