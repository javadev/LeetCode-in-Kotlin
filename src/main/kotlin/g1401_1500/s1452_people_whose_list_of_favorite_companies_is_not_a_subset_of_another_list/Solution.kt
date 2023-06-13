package g1401_1500.s1452_people_whose_list_of_favorite_companies_is_not_a_subset_of_another_list

// #Medium #Array #String #Hash_Table
class Solution {
    fun peopleIndexes(favoriteCompanies: List<List<String>?>): List<Int> {
        val n = favoriteCompanies.size
        val res: MutableList<Int> = ArrayList()
        val `in`: MutableList<Set<String>> = ArrayList()
        for (list in favoriteCompanies) {
            `in`.add(HashSet(list))
        }
        outer@ for (i in 0 until n) {
            for (j in res) {
                if (isSubset(`in`[i], `in`[j])) {
                    continue@outer
                }
            }
            for (j in i + 1 until n) {
                if (isSubset(`in`[i], `in`[j])) {
                    continue@outer
                }
            }
            res.add(i)
        }
        return res
    }

    private fun isSubset(subset: Set<String>, set: Set<String>): Boolean {
        return if (subset.size >= set.size) {
            false
        } else set.containsAll(subset)
    }
}
