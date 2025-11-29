package g2501_2600.s2549_count_distinct_numbers_on_board

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distinctIntegers() {
        assertThat(
            Solution().distinctIntegers(5),
            equalTo(4),
        )
    }

    @Test
    fun distinctIntegers2() {
        assertThat(
            Solution().distinctIntegers(3),
            equalTo(2),
        )
    }

    @Test
    fun distinctIntegers3() {
        assertThat(Solution().distinctIntegers(1), equalTo(1))
    }

    @Test
    fun distinctIntegers4() {
        assertThat(Solution().distinctIntegers(2), equalTo(1))
    }

    @Test
    fun distinctIntegers5() {
        assertThat(Solution().distinctIntegers(1000), equalTo(999))
    }
}
