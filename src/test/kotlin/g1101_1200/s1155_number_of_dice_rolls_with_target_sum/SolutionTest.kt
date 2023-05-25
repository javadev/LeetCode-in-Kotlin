package g1101_1200.s1155_number_of_dice_rolls_with_target_sum

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numRollsToTarget() {
        MatcherAssert.assertThat(Solution().numRollsToTarget(1, 6, 3), CoreMatchers.equalTo(1))
    }

    @Test
    fun numRollsToTarget2() {
        MatcherAssert.assertThat(Solution().numRollsToTarget(2, 6, 7), CoreMatchers.equalTo(6))
    }

    @Test
    fun numRollsToTarget3() {
        MatcherAssert.assertThat(Solution().numRollsToTarget(30, 30, 500), CoreMatchers.equalTo(222616187))
    }
}
