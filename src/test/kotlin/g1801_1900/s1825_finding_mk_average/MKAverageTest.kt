package g1801_1900.s1825_finding_mk_average

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MKAverageTest {
    @Test
    fun mKAverage() {
        val obj = MKAverage(3, 1)
        obj.addElement(3)
        obj.addElement(1)
        assertThat(obj.calculateMKAverage(), equalTo(-1))
        obj.addElement(10)
        assertThat(obj.calculateMKAverage(), equalTo(3))
        obj.addElement(5)
        obj.addElement(5)
        obj.addElement(5)
        assertThat(obj.calculateMKAverage(), equalTo(5))
    }
}
