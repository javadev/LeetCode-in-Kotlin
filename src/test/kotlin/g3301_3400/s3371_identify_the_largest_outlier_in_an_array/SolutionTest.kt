package g3301_3400.s3371_identify_the_largest_outlier_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestOutlier() {
        assertThat<Int>(
            Solution()
                .getLargestOutlier(intArrayOf(2, 3, 5, 10)),
            equalTo<Int>(10),
        )
    }

    @Test
    fun largestOutlier2() {
        assertThat<Int>(
            Solution()
                .getLargestOutlier(intArrayOf(-2, -1, -3, -6, 4)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun largestOutlier3() {
        assertThat<Int>(
            Solution()
                .getLargestOutlier(intArrayOf(1, 1, 1, 1, 1, 5, 5)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun largestOutlier4() {
        assertThat<Int>(
            Solution()
                .getLargestOutlier(intArrayOf(-108, -108, -517)),
            equalTo<Int>(-517),
        )
    }
}
