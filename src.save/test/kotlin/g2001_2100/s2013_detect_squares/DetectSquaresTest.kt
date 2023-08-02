package g2001_2100.s2013_detect_squares

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class DetectSquaresTest {
    @Test
    fun detectSquaresTest() {
        val detectSquares = DetectSquares()
        detectSquares.add(intArrayOf(3, 10))
        detectSquares.add(intArrayOf(11, 2))
        detectSquares.add(intArrayOf(3, 2))
        assertThat(detectSquares.count(intArrayOf(11, 10)), equalTo(1))
        assertThat(detectSquares.count(intArrayOf(14, 8)), equalTo(0))
        detectSquares.add(intArrayOf(11, 2))
        assertThat(detectSquares.count(intArrayOf(11, 10)), equalTo(2))
    }
}
