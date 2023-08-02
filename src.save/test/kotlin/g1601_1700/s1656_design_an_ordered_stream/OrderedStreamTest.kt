package g1601_1700.s1656_design_an_ordered_stream

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class OrderedStreamTest {
    @Test
    fun orderedStream() {
        val os = OrderedStream(5)
        // Inserts (3, "ccccc"), returns [].
        assertThat(os.insert(3, "ccccc"), equalTo(emptyList()))
        // Inserts (1, "aaaaa"), returns ["aaaaa"].
        assertThat(os.insert(1, "aaaaa"), equalTo(mutableListOf("aaaaa")))
        // Inserts (2, "bbbbb"), returns ["bbbbb", "ccccc"].
        assertThat(os.insert(2, "bbbbb"), equalTo(mutableListOf("bbbbb", "ccccc")))
        // Inserts (5, "eeeee"), returns [].
        assertThat(os.insert(5, "eeeee"), equalTo(emptyList()))
        // Inserts (4, "ddddd"), returns ["ddddd", "eeeee"].
        assertThat(os.insert(4, "ddddd"), equalTo(mutableListOf("ddddd", "eeeee")))
    }
}
