package g1901_2000.s1912_design_movie_rental_system

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MovieRentingSystemTest {
    @Test
    fun movieRentingSystemTest() {
        val movieRentingSystem = MovieRentingSystem(
            3,
            arrayOf(
                intArrayOf(0, 1, 5), intArrayOf(0, 2, 6), intArrayOf(0, 3, 7),
                intArrayOf(1, 1, 4), intArrayOf(1, 2, 7), intArrayOf(2, 1, 5)
            )
        )
        assertThat(movieRentingSystem.search(1), equalTo(mutableListOf(1, 0, 2)))
        movieRentingSystem.rent(0, 1)
        movieRentingSystem.rent(1, 2)
        assertThat(
            movieRentingSystem.report(),
            equalTo(listOf(mutableListOf(0, 1), mutableListOf(1, 2)))
        )
        movieRentingSystem.drop(1, 2)
        assertThat(movieRentingSystem.search(2), equalTo(mutableListOf(0, 1)))
    }
}
