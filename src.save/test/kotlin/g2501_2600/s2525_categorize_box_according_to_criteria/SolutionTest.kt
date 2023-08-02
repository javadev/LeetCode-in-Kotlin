package g2501_2600.s2525_categorize_box_according_to_criteria

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun categorizeBox() {
        assertThat(Solution().categorizeBox(1000, 35, 700, 300), equalTo("Heavy"))
    }

    @Test
    fun categorizeBox2() {
        assertThat(Solution().categorizeBox(200, 50, 800, 50), equalTo("Neither"))
    }
}
