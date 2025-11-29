package g0201_0300.s0295_find_median_from_data_stream

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MedianFinderTest {
    @Test
    fun medianFinder() {
        val medianFinder = MedianFinder()
        // arr = [1]
        medianFinder.addNum(1)
        // arr = [1, 2]
        medianFinder.addNum(2)
        // return 1.5 (i.e., (1 + 2) / 2)
        assertThat(medianFinder.findMedian(), equalTo(1.5))
        // arr[1, 2, 3]
        medianFinder.addNum(3)
        // return 2.0
        assertThat(medianFinder.findMedian(), equalTo(2.0))
    }

    @Test
    fun medianFinder2() {
        val medianFinder = MedianFinder()
        medianFinder.addNum(1)
        medianFinder.addNum(3)
        medianFinder.addNum(-1)
        assertThat(medianFinder.findMedian(), equalTo(1.0))
    }

    @Test
    fun medianFinder3() {
        val medianFinder = MedianFinder()
        medianFinder.addNum(42)
        assertThat(medianFinder.findMedian(), equalTo(42.0))
    }

    @Test
    fun medianFinder4() {
        val medianFinder = MedianFinder()
        medianFinder.addNum(5)
        medianFinder.addNum(5)
        medianFinder.addNum(5)
        medianFinder.addNum(5)
        assertThat(medianFinder.findMedian(), equalTo(5.0))
    }

    @Test
    fun medianFinder5() {
        val medianFinder = MedianFinder()
        medianFinder.addNum(-5)
        medianFinder.addNum(-10)
        medianFinder.addNum(-3)
        assertThat(medianFinder.findMedian(), equalTo(-5.0))
    }

    @Test
    fun medianFinder6() {
        val medianFinder = MedianFinder()
        medianFinder.addNum(1000)
        medianFinder.addNum(1)
        medianFinder.addNum(500)
        medianFinder.addNum(0)
        assertThat(medianFinder.findMedian(), equalTo(250.5))
    }

    @Test
    fun medianFinder7() {
        val medianFinder = MedianFinder()
        medianFinder.addNum(1)
        medianFinder.addNum(2)
        medianFinder.addNum(3)
        medianFinder.addNum(4)
        assertThat(medianFinder.findMedian(), equalTo(2.5))
    }
}
