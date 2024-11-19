package g2301_2400.s2328_number_of_increasing_paths_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPaths() {
        assertThat(
            Solution().countPaths(arrayOf(intArrayOf(1, 1), intArrayOf(3, 4))),
            equalTo(8),
        )
    }

    @Test
    fun countPaths2() {
        assertThat(Solution().countPaths(arrayOf(intArrayOf(1), intArrayOf(2))), equalTo(3))
    }

    @Test
    fun countPaths3() {
        assertThat(
            Solution()
                .countPaths(
                    arrayOf(
                        intArrayOf(
                            73884, 15322, 92124, 16515, 54702, 88526, 61879, 14125,
                            21161, 42701, 35686, 75932, 8696,
                        ),
                        intArrayOf(
                            59537, 80396, 65708, 32310, 46753, 39759, 4746, 71413,
                            84723, 13233, 23640, 62230, 11825,
                        ),
                        intArrayOf(
                            6414, 96122, 64501, 32523, 55259, 2935, 44772, 48912, 26516,
                            56256, 69201, 21079, 52979,
                        ),
                        intArrayOf(
                            50951, 1748, 42645, 73435, 81511, 21445, 26066, 27605,
                            40388, 43702, 47233, 15333, 86291,
                        ),
                        intArrayOf(
                            87914, 90237, 95947, 97341, 93670, 79822, 32591, 44096,
                            55112, 89104, 36097, 82759, 15504,
                        ),
                        intArrayOf(
                            3604, 74013, 74414, 68295, 58798, 7050, 71657, 33463, 38040,
                            46180, 61730, 82754, 57179,
                        ),
                        intArrayOf(
                            86867, 1972, 13704, 11581, 99042, 24825, 77747, 38671,
                            40628, 38626, 54719, 7366, 36309,
                        ),
                        intArrayOf(
                            69272, 98273, 16474, 15204, 40263, 99956, 36072, 68173,
                            77076, 18094, 97439, 61968, 7435,
                        ),
                        intArrayOf(
                            95263, 39616, 37983, 61376, 256, 7169, 45149, 94957, 66151,
                            13256, 37776, 25331, 29659,
                        ),
                        intArrayOf(
                            90001, 12571, 31093, 46714, 52347, 44882, 76055, 53662,
                            69928, 37486, 44020, 2211, 67466,
                        ),
                    ),
                ),
            equalTo(925),
        )
    }

    @Test
    fun countPaths4() {
        assertThat(
            Solution()
                .countPaths(
                    arrayOf(
                        intArrayOf(
                            12469, 18741, 68716, 30594, 65029, 44019, 92944, 84784,
                            92781, 5655, 43120, 81333, 54113, 88220, 23446, 6129, 2904,
                            48677, 20506, 79604, 82841, 3938, 46511, 60870, 10825,
                            31759, 78612, 19776, 43160, 86915, 74498, 38366, 28228,
                            23687, 40729, 42613, 61154, 22726, 51028, 45603, 53586,
                            44657, 97573, 61067, 27187, 4619, 6135, 24668, 69634, 24564,
                            30255, 51939, 67573, 87012, 4106, 76312, 28737, 7704, 35798,
                        ),
                    ),
                ),
            equalTo(148),
        )
    }
}
