package g4001_4100.s4044_count_good_cyclic_rotations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countGoodRotations() {
        assertThat<Int>(
            Solution().countGoodRotations(intArrayOf(1, 2, 3, 4)),
            equalTo<Int>(1),
        )
    }

    @Test
    fun countGoodRotations2() {
        assertThat<Int>(
            Solution().countGoodRotations(intArrayOf(1, 1, 1, 1)),
            equalTo<Int>(0),
        )
    }

    @Test
    fun countGoodRotations3() {
        assertThat<Int>(Solution().countGoodRotations(intArrayOf(5, 1)), equalTo<Int>(1))
    }

    @Test
    fun countGoodRotations4() {
        assertThat<Int>(Solution().countGoodRotations(intArrayOf(7)), equalTo<Int>(0))
    }
}
