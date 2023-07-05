package g2401_2500.s2454_next_greater_element_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun secondGreaterElement() {
        assertThat(
            Solution().secondGreaterElement(intArrayOf(2, 4, 0, 9, 6)),
            equalTo(intArrayOf(9, 6, 6, -1, -1))
        )
    }

    @Test
    fun secondGreaterElement2() {
        assertThat(
            Solution().secondGreaterElement(intArrayOf(3, 3)), equalTo(intArrayOf(-1, -1))
        )
    }
}
