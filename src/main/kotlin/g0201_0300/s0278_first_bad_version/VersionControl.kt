package g0201_0300.s0278_first_bad_version

open class VersionControl {
    fun isBadVersion(version: Int): Boolean {
        return version % 2 == 0
    }
}
