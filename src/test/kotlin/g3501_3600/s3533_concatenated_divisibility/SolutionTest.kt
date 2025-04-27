package g3501_3600.s3533_concatenated_divisibility

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun concatenatedDivisibility() {
        assertThat<IntArray>(
            Solution().concatenatedDivisibility(intArrayOf(3, 12, 45), 5),
            equalTo<IntArray>(intArrayOf(3, 12, 45)),
        )
    }

    @Test
    fun concatenatedDivisibility2() {
        assertThat<IntArray>(
            Solution().concatenatedDivisibility(intArrayOf(10, 5), 10),
            equalTo<IntArray>(intArrayOf(5, 10)),
        )
    }

    @Test
    fun concatenatedDivisibility3() {
        assertThat<IntArray>(
            Solution().concatenatedDivisibility(intArrayOf(1, 2, 3), 5),
            equalTo<IntArray>(intArrayOf()),
        )
    }
}
