package g3101_3200.s3186_maximum_total_damage_with_spell_casting

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumTotalDamage() {
        assertThat(Solution().maximumTotalDamage(intArrayOf(1, 1, 3, 4)), equalTo(6L))
    }

    @Test
    fun maximumTotalDamage2() {
        assertThat(Solution().maximumTotalDamage(intArrayOf(7, 1, 6, 6)), equalTo(13L))
    }

    @Test
    fun maximumTotalDamage3() {
        assertThat(
            Solution().maximumTotalDamage(intArrayOf(1000001, 1, 6, 6)),
            equalTo(1000014L)
        )
    }
}
