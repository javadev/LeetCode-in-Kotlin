package g1101_1200.s1146_snapshot_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotArrayTest {
    @Test
    fun snapshotArrayTest() {
        val snapshotArr = SnapshotArray(3)
        snapshotArr[0] = 5
        assertThat(snapshotArr.snap(), equalTo(0))
        snapshotArr[0] = 6
        assertThat(snapshotArr[0, 0], equalTo(5))
    }
}
