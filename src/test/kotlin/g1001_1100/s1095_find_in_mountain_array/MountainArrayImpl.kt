package g1001_1100.s1095_find_in_mountain_array

internal class MountainArrayImpl(private val ints: IntArray) : MountainArray() {
    override operator fun get(index: Int): Int {
        return ints[index]
    }

    override fun length(): Int {
        return ints.size
    }
}
