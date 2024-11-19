package g2401_2500.s2418_sort_the_people

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortPeople() {
        assertThat(
            Solution()
                .sortPeople(arrayOf("Mary", "John", "Emma"), intArrayOf(180, 165, 170)),
            equalTo(arrayOf("Mary", "Emma", "John")),
        )
    }

    @Test
    fun sortPeople2() {
        assertThat(
            Solution()
                .sortPeople(arrayOf("Alice", "Bob", "Bob"), intArrayOf(155, 185, 150)),
            equalTo(arrayOf("Bob", "Alice", "Bob")),
        )
    }
}
