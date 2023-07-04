package g2501_2600.s2526_find_consecutive_integers_from_a_data_stream

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class DataStreamTest {
    @Test
    fun dataStreamTest() {
        val dataStream = DataStream(4, 3)
        assertThat(dataStream.consec(4), equalTo(false))
        assertThat(dataStream.consec(4), equalTo(false))
        assertThat(dataStream.consec(4), equalTo(true))
        assertThat(dataStream.consec(3), equalTo(false))
    }
}
