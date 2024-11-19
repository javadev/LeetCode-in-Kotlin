package g2501_2600.s2550_count_collisions_of_monkeys_on_a_polygon

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun monkeyMove() {
        assertThat(
            Solution().monkeyMove(3),
            equalTo(6),
        )
    }

    @Test
    fun monkeyMove2() {
        assertThat(
            Solution().monkeyMove(4),
            equalTo(14),
        )
    }
}
