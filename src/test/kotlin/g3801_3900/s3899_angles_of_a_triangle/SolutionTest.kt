package g3801_3900.s3899_angles_of_a_triangle

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun internalAngles() {
        Assertions.assertArrayEquals(
            doubleArrayOf(36.869897646, 53.130102354, 90.0),
            Solution().internalAngles(intArrayOf(3, 4, 5)),
            0.00001,
        )
    }

    @Test
    fun internalAngles2() {
        Assertions.assertArrayEquals(
            doubleArrayOf(36.869897646, 53.130102354, 90.0),
            Solution().internalAngles(intArrayOf(5, 3, 4)),
            0.00001,
        )
    }

    @Test
    fun internalAngles3() {
        Assertions.assertArrayEquals(
            doubleArrayOf(60.0, 60.0, 60.0),
            Solution().internalAngles(intArrayOf(1000, 1000, 1000)),
            0.00001,
        )
    }

    @Test
    fun internalAngles4() {
        Assertions.assertArrayEquals(
            DoubleArray(0),
            Solution().internalAngles(intArrayOf(2, 4, 2)),
            0.00001,
        )
    }

    @Test
    fun internalAngles5() {
        Assertions.assertArrayEquals(
            DoubleArray(0),
            Solution().internalAngles(intArrayOf(5, 1, 2)),
            0.00001,
        )
    }

    @Test
    fun internalAngles6() {
        Assertions.assertArrayEquals(
            DoubleArray(0),
            Solution().internalAngles(intArrayOf(1, 2, 5)),
            0.00001,
        )
    }
}
