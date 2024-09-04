package g3201_3300.s3273_minimum_amount_of_damage_dealt_to_bob

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDamage() {
        assertThat(
            Solution().minDamage(4, intArrayOf(1, 2, 3, 4), intArrayOf(4, 5, 6, 8)),
            equalTo(39L)
        )
    }

    @Test
    fun minDamage2() {
        assertThat(
            Solution().minDamage(1, intArrayOf(1, 1, 1, 1), intArrayOf(1, 2, 3, 4)),
            equalTo(20L)
        )
    }

    @Test
    fun minDamage3() {
        assertThat(Solution().minDamage(8, intArrayOf(40), intArrayOf(59)), equalTo(320L))
    }
}
