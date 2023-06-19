package g1901_2000.s1912_design_movie_rental_system

import java.util.TreeSet

// #Hard #Array #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set
class MovieRentingSystem(n: Int, entries: Array<IntArray>) {
    private class Point(var movie: Int, var shop: Int, var price: Int)

    private val unrentedMovies = HashMap<Int, TreeSet<Point>>()
    private val shopMovieToPrice = HashMap<String, Int>()
    private val comparator = Comparator { o1: Point, o2: Point ->
        if (o1.price != o2.price) {
            return@Comparator Integer.compare(o1.price, o2.price)
        } else if (o1.shop != o2.shop) {
            return@Comparator Integer.compare(o1.shop, o2.shop)
        } else {
            return@Comparator Integer.compare(o1.movie, o2.movie)
        }
    }
    private val rented = TreeSet(comparator)

    init {
        for (entry in entries) {
            val shop = entry[0]
            val movie = entry[1]
            val price = entry[2]
            unrentedMovies.putIfAbsent(movie, TreeSet(comparator))
            unrentedMovies[movie]!!.add(Point(movie, shop, price))
            shopMovieToPrice["$shop+$movie"] = price
        }
    }

    fun search(movie: Int): List<Int> {
        if (!unrentedMovies.containsKey(movie)) {
            return ArrayList()
        }
        val iterator: Iterator<Point> = unrentedMovies[movie]!!.iterator()
        val listOfShops: MutableList<Int> = ArrayList()
        while (iterator.hasNext() && listOfShops.size < 5) {
            listOfShops.add(iterator.next().shop)
        }
        return listOfShops
    }

    fun rent(shop: Int, movie: Int) {
        val price = shopMovieToPrice["$shop+$movie"]!!
        rented.add(Point(movie, shop, price))
        unrentedMovies[movie]!!.remove(Point(movie, shop, price))
    }

    fun drop(shop: Int, movie: Int) {
        val price = shopMovieToPrice["$shop+$movie"]!!
        rented.remove(Point(movie, shop, price))
        unrentedMovies[movie]!!.add(Point(movie, shop, price))
    }

    fun report(): List<List<Int>> {
        val ans: MutableList<List<Int>> = ArrayList()
        val iterator: Iterator<Point> = rented.iterator()
        while (iterator.hasNext() && ans.size < 5) {
            val point = iterator.next()
            ans.add(listOf(point.shop, point.movie))
        }
        return ans
    }
}
