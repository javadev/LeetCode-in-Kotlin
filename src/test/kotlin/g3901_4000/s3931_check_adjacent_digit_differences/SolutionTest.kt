package g3901_4000.s3931_check_adjacent_digit_differences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isAdjacentDiffAtMostTwo() {
        assertThat<Boolean>(
            Solution().isAdjacentDiffAtMostTwo("132"),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun isAdjacentDiffAtMostTwo2() {
        assertThat<Boolean>(
            Solution().isAdjacentDiffAtMostTwo("129"),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun isAdjacentDiffAtMostTwo3() {
        assertThat<Boolean>(
            Solution().isAdjacentDiffAtMostTwo("00"),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun isAdjacentDiffAtMostTwo4() {
        assertThat<Boolean>(
            Solution().isAdjacentDiffAtMostTwo("97531"),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun isAdjacentDiffAtMostTwo5() {
        assertThat<Boolean>(
            Solution().isAdjacentDiffAtMostTwo("03"),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun isAdjacentDiffAtMostTwo6() {
        assertThat<Boolean>(
            Solution().isAdjacentDiffAtMostTwo("90"),
            equalTo<Boolean>(false),
        )
    }

    @Test
    fun isAdjacentDiffAtMostTwo7() {
        assertThat<Boolean>(
            Solution().isAdjacentDiffAtMostTwo("0123456789"),
            equalTo<Boolean>(true),
        )
    }
}
