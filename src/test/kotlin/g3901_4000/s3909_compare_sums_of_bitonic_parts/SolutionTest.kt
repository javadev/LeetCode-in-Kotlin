package g3901_4000.s3909_compare_sums_of_bitonic_parts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun compareBitonicSums() {
        assertThat<Int>(
            Solution().compareBitonicSums(intArrayOf(1, 3, 2, 1)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun compareBitonicSums2() {
        assertThat<Int>(
            Solution().compareBitonicSums(intArrayOf(2, 4, 5, 2)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun compareBitonicSums3() {
        assertThat<Int>(
            Solution().compareBitonicSums(intArrayOf(1, 2, 4, 3)),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun compareBitonicSums4() {
        assertThat<Int>(
            Solution().compareBitonicSums(intArrayOf(1, 2, 1)),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun compareBitonicSums5() {
        assertThat<Int>(
            Solution()
                .compareBitonicSums(
                    intArrayOf(999999997, 999999998, 999999999, 1000000000, 1),
                ),
            equalTo<Int>(0),
        )
    }
}
