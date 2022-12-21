package g0401_0500.s0432_all_oone_data_structure

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class AllOneTest {
    @Test
    fun allOne() {
        val allOne = AllOne()
        allOne.inc("hello")
        allOne.inc("hello")
        // return "hello"
        assertThat(allOne.getMaxKey(), equalTo("hello"))
        // return "hello"
        assertThat(allOne.getMinKey(), equalTo("hello"))
        allOne.inc("leet")
        // return "hello"
        assertThat(allOne.getMaxKey(), equalTo("hello"))
        // return "leet"
        assertThat(allOne.getMinKey(), equalTo("leet"))
        allOne.dec("leet")
    }
}
