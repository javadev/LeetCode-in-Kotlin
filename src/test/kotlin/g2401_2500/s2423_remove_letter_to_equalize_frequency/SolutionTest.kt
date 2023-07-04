package g2401_2500.s2423_remove_letter_to_equalize_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun equalFrequency() {
        assertThat(Solution().equalFrequency("abcc"), equalTo(true))
    }

    @Test
    fun equalFrequency2() {
        assertThat(Solution().equalFrequency("aazz"), equalTo(false))
    }
}
