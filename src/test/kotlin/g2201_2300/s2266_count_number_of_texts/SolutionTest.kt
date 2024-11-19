package g2201_2300.s2266_count_number_of_texts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countTexts() {
        assertThat(Solution().countTexts("22233"), equalTo(8))
    }

    @Test
    fun countTexts2() {
        assertThat(
            Solution().countTexts("222222222222222222222222222222222222"),
            equalTo(82876089),
        )
    }
}
