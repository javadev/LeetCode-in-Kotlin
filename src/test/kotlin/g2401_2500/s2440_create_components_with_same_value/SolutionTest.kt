package g2401_2500.s2440_create_components_with_same_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun componentValue() {
        assertThat(
            Solution()
                .componentValue(
                    intArrayOf(6, 2, 2, 2, 6),
                    arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(3, 4)),
                ),
            equalTo(2),
        )
    }

    @Test
    fun componentValue2() {
        assertThat(Solution().componentValue(intArrayOf(2), arrayOf()), equalTo(0))
    }
}
