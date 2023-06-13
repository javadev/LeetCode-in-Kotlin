package g1401_1500.s1476_subrectangle_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SubrectangleQueriesTest {
    @Test
    fun subrectangleQueriesTest() {
        val subrectangleQueries = SubrectangleQueries(
            arrayOf(
                intArrayOf(1, 2, 1),
                intArrayOf(4, 3, 4),
                intArrayOf(3, 2, 1),
                intArrayOf(1, 1, 1)
            )
        )
        assertThat(subrectangleQueries.getValue(0, 2), equalTo(1))
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5)
        assertThat(subrectangleQueries.getValue(0, 2), equalTo(5))
        assertThat(subrectangleQueries.getValue(3, 1), equalTo(5))
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10)
        assertThat(subrectangleQueries.getValue(3, 1), equalTo(10))
        assertThat(subrectangleQueries.getValue(0, 2), equalTo(5))
    }

    @Test
    fun subrectangleQueriesTest2() {
        val subrectangleQueries =
            SubrectangleQueries(arrayOf(intArrayOf(1, 1, 1), intArrayOf(2, 2, 2), intArrayOf(3, 3, 3)))
        assertThat(subrectangleQueries.getValue(0, 0), equalTo(1))
        subrectangleQueries.updateSubrectangle(0, 0, 2, 2, 100)
        assertThat(subrectangleQueries.getValue(0, 0), equalTo(100))
        assertThat(subrectangleQueries.getValue(2, 2), equalTo(100))
        subrectangleQueries.updateSubrectangle(1, 1, 2, 2, 20)
        assertThat(subrectangleQueries.getValue(2, 2), equalTo(20))
    }
}
