package g3701_3800.s3761_minimum_absolute_distance_between_mirror_pairs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMirrorPairDistance() {
        assertThat<Int>(
            Solution().minMirrorPairDistance(intArrayOf(12, 21)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minMirrorPairDistance2() {
        assertThat<Int>(
            Solution().minMirrorPairDistance(intArrayOf(10, 1, 100)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun minMirrorPairDistance3() {
        assertThat<Int>(
            Solution().minMirrorPairDistance(intArrayOf(12, 34, 56)),
            equalTo<Int>(-1),
        )
    }
}
