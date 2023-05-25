package g1101_1200.s1155_number_of_dice_rolls_with_target_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numRollsToTarget() {
        assertThat(Solution().numRollsToTarget(1, 6, 3), equalTo(1))
    }

    @Test
    fun numRollsToTarget2() {
        assertThat(Solution().numRollsToTarget(2, 6, 7), equalTo(6))
    }

    @Test
    fun numRollsToTarget3() {
        assertThat(Solution().numRollsToTarget(30, 30, 500), equalTo(222616187))
    }
}
