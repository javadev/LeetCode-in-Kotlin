package g0401_0500.s0451_sort_characters_by_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun frequencySort() {
        assertThat(Solution().frequencySort("tree"), equalTo("eetr"))
    }

    @Test
    fun frequencySort2() {
        assertThat(Solution().frequencySort("cccaaa"), equalTo("cccaaa"))
    }

    @Test
    fun frequencySort3() {
        assertThat(Solution().frequencySort("Aabb"), equalTo("bbAa"))
    }
}
