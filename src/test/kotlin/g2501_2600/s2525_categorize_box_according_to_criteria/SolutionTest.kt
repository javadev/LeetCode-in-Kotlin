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

    @Test
    fun categorizeBox3() {
        assertThat(Solution().categorizeBox(10000, 1, 1, 10), equalTo("Bulky"))
    }

    @Test
    fun categorizeBox4() {
        assertThat(Solution().categorizeBox(1000, 1000, 1000, 10), equalTo("Bulky"))
    }

    @Test
    fun categorizeBox5() {
        assertThat(Solution().categorizeBox(10000, 10000, 1, 200), equalTo("Both"))
    }

    @Test
    fun categorizeBox6() {
        assertThat(Solution().categorizeBox(9999, 9999, 1, 99), equalTo("Neither"))
    }

    @Test
    fun categorizeBox7() {
        assertThat(Solution().categorizeBox(10000, 10000, 1, 100), equalTo("Both"))
    }

    @Test
    fun categorizeBox8() {
        assertThat(Solution().categorizeBox(1000, 1000, 1000, 1), equalTo("Bulky"))
    }
}
