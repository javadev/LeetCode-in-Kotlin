package g3301_3400.s3360_stone_removal_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canAliceWin() {
        assertThat<Boolean>(Solution().canAliceWin(12), equalTo<Boolean>(true))
    }

    @Test
    fun canAliceWin2() {
        assertThat<Boolean>(Solution().canAliceWin(1), equalTo<Boolean>(false))
    }

    @Test
    fun canAliceWin3() {
        assertThat<Boolean>(Solution().canAliceWin(19), equalTo<Boolean>(false))
    }
}
