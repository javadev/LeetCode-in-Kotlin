package g2701_2800.s2719_count_of_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun count() {
        assertThat(
            Solution().count("1", "12", 1, 8),
            equalTo(11),
        )
    }

    @Test
    fun count2() {
        assertThat(
            Solution().count("1", "5", 1, 5),
            equalTo(5),
        )
    }
}
