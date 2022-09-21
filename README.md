# LeetCode-in-Kotlin

[![Maven Central](https://img.shields.io/maven-central/v/com.github.javadev/leetcode-in-kotlin.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.github.javadev%22%20AND%20a%3A%22leetcode-in-kotlin%22)
[![MIT License](http://img.shields.io/badge/license-MIT-green.svg) ](https://github.com/javadev/leetcode-in-kotlin/blob/main/LICENSE)
[![Java CI with Maven](https://github.com/javadev/LeetCode-in-Kotlin/actions/workflows/maven.yml/badge.svg)](https://github.com/javadev/LeetCode-in-Kotlin/actions/workflows/maven.yml)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=javadev_LeetCode-in-Kotlin&metric=sqale_rating)](https://sonarcloud.io/summary/overall?id=javadev_LeetCode-in-Kotlin)
[![javadoc](https://javadoc.io/badge2/com.github.javadev/leetcode-in-kotlin/javadoc.svg)](https://javadoc.io/doc/com.github.javadev/leetcode-in-kotlin)
[![](https://img.shields.io/github/stars/javadev/LeetCode-in-Kotlin?style=flat-square)](https://github.com/javadev/LeetCode-in-Kotlin)
[![](https://img.shields.io/github/forks/javadev/LeetCode-in-Kotlin?style=flat-square)](https://github.com/javadev/LeetCode-in-Kotlin/fork)

Kotlin Solution for LeetCode algorithm problems, continually updating.

## Installation

Include the following in your `pom.xml` for Maven:

```xml
<dependencies>
  <dependency>
    <groupId>com.github.javadev</groupId>
    <artifactId>leetcode-in-kotlin</artifactId>
    <version>1.4</version>
  </dependency>
  ...
</dependencies>
```

Gradle:

```groovy
implementation 'com.github.javadev:leetcode-in-kotlin:1.4'
```

> ["For coding interview preparation, LeetCode is one of the best online resource providing a rich library of more than 300 real coding interview questions for you to practice from using one of the 7 supported languages - C, C++, Java, Python, C#, JavaScript, Ruby."](https://www.quora.com/How-effective-is-Leetcode-for-preparing-for-technical-interviews)

##
* [Algorithm II](#algorithm-ii)
* [Binary Search I](#binary-search-i)
* [Binary Search II](#binary-search-ii)
* [Dynamic Programming I](#dynamic-programming-i)
* [Programming Skills I](#programming-skills-i)
* [Programming Skills II](#programming-skills-ii)
* [Graph Theory I](#graph-theory-i)
* [SQL I](#sql-i)
* [Level 1](#level-1)
* [Level 2](#level-2)
* [Udemy](#udemy)
* [Data Structure I](#data-structure-i)
* [Data Structure II](#data-structure-ii)
* [Algorithm I](#algorithm-i)

### Algorithm II

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0034 |[Find First and Last Position of Element in Sorted Array](src/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 228 | 83.38
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 184 | 86.08
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17

#### Day 2 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search | 262 | 60.96

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0015 |[3Sum](src/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 1059 | 55.28

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0011 |[Container With Most Water](src/main/kotlin/g0001_0100/s0011_container_with_most_water/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers | 635 | 64.22

#### Day 5 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 561 | 54.68

#### Day 6 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 9 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0078 |[Subsets](src/main/kotlin/g0001_0100/s0078_subsets/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking | 353 | 30.14

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0047 |[Permutations II](src/main/kotlin/g0001_0100/s0047_permutations_ii/Solution.kt)| Medium | Array, Backtracking | 406 | 76.36
| 0039 |[Combination Sum](src/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking | 317 | 86.85
| 0040 |[Combination Sum II](src/main/kotlin/g0001_0100/s0040_combination_sum_ii/Solution.kt)| Medium | Array, Backtracking | 348 | 80.92

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0017 |[Letter Combinations of a Phone Number](src/main/kotlin/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking | 132 | 100.00
| 0022 |[Generate Parentheses](src/main/kotlin/g0001_0100/s0022_generate_parentheses/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking | 210 | 78.51
| 0079 |[Word Search](src/main/kotlin/g0001_0100/s0079_word_search/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Backtracking | 463 | 68.49

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0055 |[Jump Game](src/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 670 | 66.67

#### Day 13 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0045 |[Jump Game II](src/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy | 227 | 98.14
| 0062 |[Unique Paths](src/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics | 209 | 49.18

#### Day 14 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 359 | 69.08

#### Day 15 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0139 |[Word Break](src/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization | 197 | 87.17

#### Day 16 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 318 | 82.28

#### Day 17 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 307 | 38.36

#### Day 18 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0072 |[Edit Distance](src/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming | 320 | 63.53
| 0322 |[Coin Change](src/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search | 332 | 50.68

#### Day 19 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 20 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 21 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Binary Search I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0035 |[Search Insert Position](src/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search | 267 | 50.32

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0034 |[Find First and Last Position of Element in Sorted Array](src/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 228 | 83.38

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 184 | 86.08

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search | 262 | 60.96

### Binary Search II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 318 | 82.28

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0287 |[Find the Duplicate Number](src/main/kotlin/g0201_0300/s0287_find_the_duplicate_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Two_Pointers, Bit_Manipulation | 656 | 66.21

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src/main/kotlin/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer | 460 | 66.08

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Dynamic Programming I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 156 | 92.24

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0055 |[Jump Game](src/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 670 | 66.67
| 0045 |[Jump Game II](src/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy | 227 | 98.14

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer | 662 | 82.48

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0152 |[Maximum Product Subarray](src/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 253 | 88.42

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 609 | 94.06

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0139 |[Word Break](src/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization | 197 | 87.17
| 0042 |[Trapping Rain Water](src/main/kotlin/g0001_0100/s0042_trapping_rain_water/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack | 196 | 100.00

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0096 |[Unique Binary Search Trees](src/main/kotlin/g0001_0100/s0096_unique_binary_search_trees/Solution.kt)| Medium | Top_100_Liked_Questions, Dynamic_Programming, Math, Tree, Binary_Tree, Binary_Search_Tree | 237 | 26.76

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0062 |[Unique Paths](src/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics | 209 | 49.18

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0064 |[Minimum Path Sum](src/main/kotlin/g0001_0100/s0064_minimum_path_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix | 222 | 95.70
| 0221 |[Maximal Square](src/main/kotlin/g0201_0300/s0221_maximal_square/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix | 614 | 44.00

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 359 | 69.08

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 318 | 82.28

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 307 | 38.36
| 0072 |[Edit Distance](src/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming | 320 | 63.53

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0322 |[Coin Change](src/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search | 332 | 50.68

#### Day 21

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Programming Skills I

#### Day 1 Basic Data Type

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 2 Operator

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 3 Conditional Statements

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 4 Loop

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 5 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 6 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0283 |[Move Zeroes](src/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers | 516 | 79.07

#### Day 7 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10 Linked List and Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 11 Containers and Libraries

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 12 Class and Object

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Programming Skills II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0028 |[Find the Index of the First Occurrence in a String](src/main/kotlin/g0001_0100/s0028_implement_strstr/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, String_Matching | 257 | 32.35

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0043 |[Multiply Strings](src/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 390 | 56.25

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0739 |[Daily Temperatures](src/main/kotlin/g0701_0800/s0739_daily_temperatures/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack | 936 | 80.54

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0048 |[Rotate Image](src/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 287 | 46.50

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0054 |[Spiral Matrix](src/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 224 | 62.50

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0049 |[Group Anagrams](src/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting | 506 | 86.55

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 561 | 54.68

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0138 |[Copy List with Random Pointer](src/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List | 274 | 80.58

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src/main/kotlin/g0001_0100/s0002_add_two_numbers/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion | 212 | 93.71

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Graph Theory I

#### Day 1 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41

#### Day 2 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 3 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 4 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 5 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 6 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 7 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 9 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 11 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 12 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 13 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 14 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### SQL I

#### Day 1 Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 2 Select and Order

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 3 String Processing Functions

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 4 Union and Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 5 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 6 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 7 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 9 Control of Flow

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 10 Where

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Level 1

#### Day 1 Prefix Sum

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 2 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 3 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 148 | 99.90
| 0206 |[Reverse Linked List](src/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 309 | 15.90

#### Day 4 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0142 |[Linked List Cycle II](src/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List | 192 | 63.39

#### Day 5 Greedy

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 609 | 94.06

#### Day 6 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0102 |[Binary Tree Level Order Traversal](src/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 355 | 29.37

#### Day 7 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 330 | 41.38

#### Day 9 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41

#### Day 10 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06

#### Day 11 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0062 |[Unique Paths](src/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics | 209 | 49.18

#### Day 12 Sliding Window/Two Pointer

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window | 561 | 54.68

#### Day 13 Hashmap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0001 |[Two Sum](src/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 234 | 92.75

#### Day 14 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0394 |[Decode String](src/main/kotlin/g0301_0400/s0394_decode_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Stack, Recursion | 268 | 23.13

#### Day 15 Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Level 2

#### Day 1 Implementation/Simulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0054 |[Spiral Matrix](src/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 224 | 62.50

#### Day 2 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0014 |[Longest Common Prefix](src/main/kotlin/g0001_0100/s0014_longest_common_prefix/Solution.kt)| Easy | Top_Interview_Questions, String | 269 | 48.51
| 0043 |[Multiply Strings](src/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 390 | 56.25

#### Day 3 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0019 |[Remove Nth Node From End of List](src/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List | 172 | 85.17
| 0234 |[Palindrome Linked List](src/main/kotlin/g0201_0300/s0234_palindrome_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion | 641 | 79.53

#### Day 4 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0148 |[Sort List](src/main/kotlin/g0101_0200/s0148_sort_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Linked_List, Divide_and_Conquer, Merge_Sort | 820 | 61.70

#### Day 5 Greedy

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 6 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0226 |[Invert Binary Tree](src/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 275 | 13.68

#### Day 7 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0543 |[Diameter of Binary Tree](src/main/kotlin/g0501_0600/s0543_diameter_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree | 307 | 43.93
| 0437 |[Path Sum III](src/main/kotlin/g0401_0500/s0437_path_sum_iii/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree | 403 | 54.12

#### Day 8 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 184 | 86.08

#### Day 9 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0230 |[Kth Smallest Element in a BST](src/main/kotlin/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 393 | 33.33

#### Day 10 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0994 |[Rotting Oranges](src/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 308 | 57.93

#### Day 11 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 156 | 92.24
| 0322 |[Coin Change](src/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search | 332 | 50.68

#### Day 13 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0416 |[Partition Equal Subset Sum](src/main/kotlin/g0401_0500/s0416_partition_equal_subset_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming | 509 | 57.56
| 0152 |[Maximum Product Subarray](src/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 253 | 88.42

#### Day 14 Sliding Window/Two Pointer

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 212 | 91.24
| 0016 |[3Sum Closest](src/main/kotlin/g0001_0100/s0016_3sum_closest/Solution.kt)| Medium | Array, Sorting, Two_Pointers | 219 | 89.56
| 0076 |[Minimum Window Substring](src/main/kotlin/g0001_0100/s0076_minimum_window_substring/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 346 | 85.20

#### Day 15 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0101 |[Symmetric Tree](src/main/kotlin/g0101_0200/s0101_symmetric_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 290 | 26.98
| 0199 |[Binary Tree Right Side View](src/main/kotlin/g0101_0200/s0199_binary_tree_right_side_view/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 194 | 92.89

#### Day 16 Design

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88
| 0208 |[Implement Trie (Prefix Tree)](src/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie | 689 | 61.00

#### Day 17 Interval

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0056 |[Merge Intervals](src/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 323 | 99.68

#### Day 18 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 19 Union Find

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 20 Brute Force/Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0039 |[Combination Sum](src/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking | 317 | 86.85
| 0046 |[Permutations](src/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking | 186 | 100.00

### Udemy

#### Udemy Integers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0136 |[Single Number](src/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation | 344 | 83.63
| 0007 |[Reverse Integer](src/main/kotlin/g0001_0100/s0007_reverse_integer/Solution.kt)| Medium | Top_Interview_Questions, Math | 230 | 57.36
| 0009 |[Palindrome Number](src/main/kotlin/g0001_0100/s0009_palindrome_number/Solution.kt)| Easy | Math | 208 | 94.88

#### Udemy Strings

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0014 |[Longest Common Prefix](src/main/kotlin/g0001_0100/s0014_longest_common_prefix/Solution.kt)| Easy | Top_Interview_Questions, String | 269 | 48.51
| 0003 |[Longest Substring Without Repeating Characters](src/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 212 | 91.24
| 0020 |[Valid Parentheses](src/main/kotlin/g0001_0100/s0020_valid_parentheses/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack | 196 | 71.08
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 359 | 69.08
| 0394 |[Decode String](src/main/kotlin/g0301_0400/s0394_decode_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Stack, Recursion | 268 | 23.13
| 0049 |[Group Anagrams](src/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting | 506 | 86.55

#### Udemy Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search | 184 | 86.08
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search | 262 | 60.96

#### Udemy Arrays

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 609 | 94.06
| 0283 |[Move Zeroes](src/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers | 516 | 79.07
| 0001 |[Two Sum](src/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 234 | 92.75
| 0189 |[Rotate Array](src/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers | 483 | 86.95
| 0055 |[Jump Game](src/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 670 | 66.67
| 0075 |[Sort Colors](src/main/kotlin/g0001_0100/s0075_sort_colors/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 198 | 85.66
| 0238 |[Product of Array Except Self](src/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum | 669 | 48.96
| 0041 |[First Missing Positive](src/main/kotlin/g0001_0100/s0041_first_missing_positive/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 345 | 100.00
| 0239 |[Sliding Window Maximum](src/main/kotlin/g0201_0300/s0239_sliding_window_maximum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue | 1059 | 86.14

#### Udemy Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0026 |[Remove Duplicates from Sorted Array](src/main/kotlin/g0001_0100/s0026_remove_duplicates_from_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Two_Pointers | 361 | 77.19
| 0042 |[Trapping Rain Water](src/main/kotlin/g0001_0100/s0042_trapping_rain_water/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack | 196 | 100.00
| 0015 |[3Sum](src/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 1059 | 55.28

#### Udemy Famous Algorithm

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer | 662 | 82.48
| 0169 |[Majority Element](src/main/kotlin/g0101_0200/s0169_majority_element/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer | 460 | 51.25

#### Udemy Sorting Algorithms

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Udemy 2D Arrays/Matrix

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17
| 0054 |[Spiral Matrix](src/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation | 224 | 62.50
| 0048 |[Rotate Image](src/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 287 | 46.50
| 0073 |[Set Matrix Zeroes](src/main/kotlin/g0001_0100/s0073_set_matrix_zeroes/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Matrix | 255 | 100.00
| 0056 |[Merge Intervals](src/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 323 | 99.68

#### Udemy Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0114 |[Flatten Binary Tree to Linked List](src/main/kotlin/g0101_0200/s0114_flatten_binary_tree_to_linked_list/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Linked_List | 305 | 26.30
| 0024 |[Swap Nodes in Pairs](src/main/kotlin/g0001_0100/s0024_swap_nodes_in_pairs/Solution.kt)| Medium | Top_100_Liked_Questions, Linked_List, Recursion | 149 | 99.39
| 0142 |[Linked List Cycle II](src/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List | 192 | 63.39
| 0141 |[Linked List Cycle](src/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 223 | 91.85
| 0206 |[Reverse Linked List](src/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 309 | 15.90
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 148 | 99.90
| 0160 |[Intersection of Two Linked Lists](src/main/kotlin/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 262 | 83.50
| 0234 |[Palindrome Linked List](src/main/kotlin/g0201_0300/s0234_palindrome_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion | 641 | 79.53
| 0138 |[Copy List with Random Pointer](src/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List | 274 | 80.58
| 0025 |[Reverse Nodes in k-Group](src/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion | 194 | 87.72
| 0146 |[LRU Cache](src/main/kotlin/g0101_0200/s0146_lru_cache/LRUCache.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Design, Linked_List, Doubly_Linked_List | 1116 | 97.93

#### Udemy Tree Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0094 |[Largest Rectangle in Histogram](src/main/kotlin/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack | 283 | 17.97
| 0102 |[Binary Tree Level Order Traversal](src/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 355 | 29.37
| 0543 |[Diameter of Binary Tree](src/main/kotlin/g0501_0600/s0543_diameter_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree | 307 | 43.93
| 0226 |[Invert Binary Tree](src/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 275 | 13.68
| 0124 |[Binary Tree Maximum Path Sum](src/main/kotlin/g0101_0200/s0124_binary_tree_maximum_path_sum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 331 | 74.42
| 0098 |[Validate Binary Search Tree](src/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 330 | 41.38
| 0236 |[Lowest Common Ancestor of a Binary Tree](src/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree | 386 | 45.21

#### Udemy Trie and Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0208 |[Implement Trie (Prefix Tree)](src/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie | 689 | 61.00

#### Udemy Graph

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 252 | 95.41

#### Udemy Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0139 |[Word Break](src/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization | 197 | 87.17
| 0152 |[Maximum Product Subarray](src/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 253 | 88.42
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 156 | 92.24
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06
| 0064 |[Minimum Path Sum](src/main/kotlin/g0001_0100/s0064_minimum_path_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix | 222 | 95.70
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search | 318 | 82.28
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 307 | 38.36
| 0072 |[Edit Distance](src/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming | 320 | 63.53
| 0044 |[Wildcard Matching](src/main/kotlin/g0001_0100/s0044_wildcard_matching/Solution.kt)| Hard | Top_Interview_Questions, String, Dynamic_Programming, Greedy, Recursion | 401 | 86.11
| 0010 |[Regular Expression Matching](src/main/kotlin/g0001_0100/s0010_regular_expression_matching/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Recursion | 234 | 85.18

#### Udemy Backtracking/Recursion

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0022 |[Generate Parentheses](src/main/kotlin/g0001_0100/s0022_generate_parentheses/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking | 210 | 78.51
| 0039 |[Combination Sum](src/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking | 317 | 86.85
| 0078 |[Subsets](src/main/kotlin/g0001_0100/s0078_subsets/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking | 353 | 30.14
| 0017 |[Letter Combinations of a Phone Number](src/main/kotlin/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking | 132 | 100.00
| 0046 |[Permutations](src/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking | 186 | 100.00

#### Udemy Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0338 |[Longest Increasing Subsequence](src/main/kotlin/g0301_0400/s0338_counting_bits/Solution.kt)| Easy | Top_100_Liked_Questions, Dynamic_Programming, Bit_Manipulation | 413 | 26.03
| 0029 |[Divide Two Integers](src/main/kotlin/g0001_0100/s0029_divide_two_integers/Solution.kt)| Medium | Top_Interview_Questions, Math, Bit_Manipulation | 281 | 31.67

#### Udemy Design

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88

### Data Structure I

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer | 662 | 82.48

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0001 |[Two Sum](src/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table | 234 | 92.75

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 609 | 94.06

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0036 |[Valid Sudoku](src/main/kotlin/g0001_0100/s0036_valid_sudoku/Solution.kt)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix | 346 | 65.03
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix | 290 | 40.17

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 7 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0141 |[Linked List Cycle](src/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 223 | 91.85
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 148 | 99.90

#### Day 8 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0206 |[Reverse Linked List](src/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 309 | 15.90

#### Day 9 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0020 |[Valid Parentheses](src/main/kotlin/g0001_0100/s0020_valid_parentheses/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack | 196 | 71.08

#### Day 10 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0094 |[Largest Rectangle in Histogram](src/main/kotlin/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack | 283 | 17.97

#### Day 11 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0102 |[Binary Tree Level Order Traversal](src/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 355 | 29.37
| 0101 |[Symmetric Tree](src/main/kotlin/g0101_0200/s0101_symmetric_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 290 | 26.98

#### Day 12 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0226 |[Invert Binary Tree](src/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 275 | 13.68

#### Day 13 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 14 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 330 | 41.38

### Data Structure II

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0136 |[Single Number](src/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation | 344 | 83.63
| 0169 |[Majority Element](src/main/kotlin/g0101_0200/s0169_majority_element/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer | 460 | 51.25
| 0015 |[3Sum](src/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 1059 | 55.28

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0075 |[Sort Colors](src/main/kotlin/g0001_0100/s0075_sort_colors/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers | 198 | 85.66
| 0056 |[Merge Intervals](src/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting | 323 | 99.68

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0048 |[Rotate Image](src/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix | 287 | 46.50

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src/main/kotlin/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer | 460 | 66.08

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0238 |[Product of Array Except Self](src/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum | 669 | 48.96
| 0560 |[Subarray Sum Equals K](src/main/kotlin/g0501_0600/s0560_subarray_sum_equals_k/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Hash_Table, Prefix_Sum | 692 | 53.27

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 7 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0763 |[Partition Labels](src/main/kotlin/g0701_0800/s0763_partition_labels/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers | 235 | 84.75

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0049 |[Group Anagrams](src/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting | 506 | 86.55
| 0043 |[Multiply Strings](src/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 390 | 56.25

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming | 359 | 69.08

#### Day 10 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src/main/kotlin/g0001_0100/s0002_add_two_numbers/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion | 212 | 93.71
| 0142 |[Linked List Cycle II](src/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List | 192 | 63.39

#### Day 11 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0160 |[Intersection of Two Linked Lists](src/main/kotlin/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List | 262 | 83.50

#### Day 12 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0024 |[Swap Nodes in Pairs](src/main/kotlin/g0001_0100/s0024_swap_nodes_in_pairs/Solution.kt)| Medium | Top_100_Liked_Questions, Linked_List, Recursion | 149 | 99.39

#### Day 13 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0025 |[Reverse Nodes in k-Group](src/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion | 194 | 87.72

#### Day 14 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design | 331 | 84.88

#### Day 15 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0105 |[Construct Binary Tree from Preorder and Inorder Traversal](src/main/kotlin/g0101_0200/s0105_construct_binary_tree_from_preorder_and_inorder_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer | 370 | 58.31

#### Day 16 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0199 |[Binary Tree Right Side View](src/main/kotlin/g0101_0200/s0199_binary_tree_right_side_view/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 194 | 92.89

#### Day 17 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0230 |[Kth Smallest Element in a BST](src/main/kotlin/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 393 | 33.33

#### Day 18 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0236 |[Lowest Common Ancestor of a Binary Tree](src/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree | 386 | 45.21

#### Day 19 Graph

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 20 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0215 |[Kth Largest Element in an Array](src/main/kotlin/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect | 839 | 34.43
| 0347 |[Top K Frequent Elements](src/main/kotlin/g0301_0400/s0347_top_k_frequent_elements/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Divide_and_Conquer, Quickselect, Bucket_Sort | 268 | 99.74

#### Day 21 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

### Algorithm I

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0035 |[Search Insert Position](src/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search | 267 | 50.32

#### Day 2 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0189 |[Rotate Array](src/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers | 483 | 86.95

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0283 |[Move Zeroes](src/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers | 516 | 79.07

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 5 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0019 |[Remove Nth Node From End of List](src/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List | 172 | 85.17

#### Day 6 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window | 212 | 91.24

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 9 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0994 |[Rotting Oranges](src/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 308 | 57.93

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 148 | 99.90
| 0206 |[Reverse Linked List](src/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion | 309 | 15.90

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0046 |[Permutations](src/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking | 186 | 100.00

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization | 127 | 97.06
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 156 | 92.24

#### Day 13 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-

#### Day 14 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0136 |[Single Number](src/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation | 344 | 83.63

## Algorithms

| #    |      Title     | Difficulty  | Tag         | Time, ms | Time, %
|------|----------------|-------------|-------------|----------|---------
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, Algorithm_II_Day_17_Dynamic_Programming, Dynamic_Programming_I_Day_19, Udemy_Dynamic_Programming | 307 | 38.36
| 0994 |[Rotting Oranges](src/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix, Algorithm_I_Day_9_Breadth_First_Search_Depth_First_Search, Level_2_Day_10_Graph/BFS/DFS | 308 | 57.93
| 0864 |[Shortest Path to Get All Keys](src/main/kotlin/g0801_0900/s0864_shortest_path_to_get_all_keys/Solution.kt)| Hard | Breadth_First_Search, Bit_Manipulation | 176 | 100.00
| 0763 |[Partition Labels](src/main/kotlin/g0701_0800/s0763_partition_labels/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers, Data_Structure_II_Day_7_String | 235 | 84.75
| 0739 |[Daily Temperatures](src/main/kotlin/g0701_0800/s0739_daily_temperatures/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack, Programming_Skills_II_Day_6 | 936 | 80.54
| 0647 |[Palindromic Substrings](src/main/kotlin/g0601_0700/s0647_palindromic_substrings/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming | 266 | 67.83
| 0560 |[Subarray Sum Equals K](src/main/kotlin/g0501_0600/s0560_subarray_sum_equals_k/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Hash_Table, Prefix_Sum, Data_Structure_II_Day_5_Array | 692 | 53.27
| 0543 |[Diameter of Binary Tree](src/main/kotlin/g0501_0600/s0543_diameter_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Level_2_Day_7_Tree, Udemy_Tree_Stack_Queue | 307 | 43.93
| 0494 |[Target Sum](src/main/kotlin/g0401_0500/s0494_target_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Backtracking | 308 | 89.61
| 0438 |[Find All Anagrams in a String](src/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window, Algorithm_II_Day_5_Sliding_Window, Programming_Skills_II_Day_12, Level_1_Day_12_Sliding_Window/Two_Pointer | 561 | 54.68
| 0437 |[Path Sum III](src/main/kotlin/g0401_0500/s0437_path_sum_iii/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Level_2_Day_7_Tree | 403 | 54.12
| 0416 |[Partition Equal Subset Sum](src/main/kotlin/g0401_0500/s0416_partition_equal_subset_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Level_2_Day_13_Dynamic_Programming | 509 | 57.56
| 0394 |[Decode String](src/main/kotlin/g0301_0400/s0394_decode_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Stack, Recursion, Level_1_Day_14_Stack, Udemy_Strings | 268 | 23.13
| 0378 |[Kth Smallest Element in a Sorted Matrix](src/main/kotlin/g0301_0400/s0378_kth_smallest_element_in_a_sorted_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Sorting, Binary_Search, Matrix, Heap_Priority_Queue | 522 | 59.78
| 0347 |[Top K Frequent Elements](src/main/kotlin/g0301_0400/s0347_top_k_frequent_elements/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Divide_and_Conquer, Quickselect, Bucket_Sort, Data_Structure_II_Day_20_Heap_Priority_Queue | 268 | 99.74
| 0338 |[Longest Increasing Subsequence](src/main/kotlin/g0301_0400/s0338_counting_bits/Solution.kt)| Easy | Top_100_Liked_Questions, Dynamic_Programming, Bit_Manipulation, Udemy_Bit_Manipulation | 413 | 26.03
| 0322 |[Coin Change](src/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Breadth_First_Search, Algorithm_II_Day_18_Dynamic_Programming, Dynamic_Programming_I_Day_20, Level_2_Day_12_Dynamic_Programming | 332 | 50.68
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Binary_Search, Algorithm_II_Day_16_Dynamic_Programming, Binary_Search_II_Day_3, Dynamic_Programming_I_Day_18, Udemy_Dynamic_Programming | 318 | 82.28
| 0295 |[Find Median from Data Stream](src/main/kotlin/g0201_0300/s0295_find_median_from_data_stream/MedianFinder.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Design, Heap_Priority_Queue, Data_Stream | 2289 | 33.60
| 0287 |[Find the Duplicate Number](src/main/kotlin/g0201_0300/s0287_find_the_duplicate_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Two_Pointers, Bit_Manipulation, Binary_Search_II_Day_5 | 656 | 66.21
| 0283 |[Move Zeroes](src/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Two_Pointers, Algorithm_I_Day_3_Two_Pointers, Programming_Skills_I_Day_6_Array, Udemy_Arrays | 516 | 79.07
| 0240 |[Search a 2D Matrix II](src/main/kotlin/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer, Data_Structure_II_Day_4_Array, Binary_Search_II_Day_8 | 460 | 66.08
| 0239 |[Sliding Window Maximum](src/main/kotlin/g0201_0300/s0239_sliding_window_maximum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue, Udemy_Arrays | 1059 | 86.14
| 0238 |[Product of Array Except Self](src/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Prefix_Sum, Data_Structure_II_Day_5_Array, Udemy_Arrays | 669 | 48.96
| 0236 |[Lowest Common Ancestor of a Binary Tree](src/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Data_Structure_II_Day_18_Tree, Udemy_Tree_Stack_Queue | 386 | 45.21
| 0234 |[Palindrome Linked List](src/main/kotlin/g0201_0300/s0234_palindrome_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Stack, Linked_List, Recursion, Level_2_Day_3_Linked_List, Udemy_Linked_List | 641 | 79.53
| 0230 |[Kth Smallest Element in a BST](src/main/kotlin/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_II_Day_17_Tree, Level_2_Day_9_Binary_Search_Tree | 393 | 33.33
| 0226 |[Invert Binary Tree](src/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_12_Tree, Level_2_Day_6_Tree, Udemy_Tree_Stack_Queue | 275 | 13.68
| 0221 |[Maximal Square](src/main/kotlin/g0201_0300/s0221_maximal_square/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_16 | 614 | 44.00
| 0215 |[Kth Largest Element in an Array](src/main/kotlin/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect, Data_Structure_II_Day_20_Heap_Priority_Queue | 839 | 34.43
| 0208 |[Implement Trie (Prefix Tree)](src/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie, Level_2_Day_16_Design, Udemy_Trie_and_Heap | 689 | 61.00
| 0207 |[Course Schedule](src/main/kotlin/g0201_0300/s0207_course_schedule/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 416 | 40.10
| 0206 |[Reverse Linked List](src/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Data_Structure_I_Day_8_Linked_List, Algorithm_I_Day_10_Recursion_Backtracking, Level_1_Day_3_Linked_List, Udemy_Linked_List | 309 | 15.90
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Algorithm_II_Day_6_Breadth_First_Search_Depth_First_Search, Graph_Theory_I_Day_1_Matrix_Related_Problems, Level_1_Day_9_Graph/BFS/DFS, Udemy_Graph | 252 | 95.41
| 0199 |[Binary Tree Right Side View](src/main/kotlin/g0101_0200/s0199_binary_tree_right_side_view/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_II_Day_16_Tree, Level_2_Day_15_Tree | 194 | 92.89
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Algorithm_I_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_3, Level_2_Day_12_Dynamic_Programming, Udemy_Dynamic_Programming | 156 | 92.24
| 0189 |[Rotate Array](src/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers, Algorithm_I_Day_2_Two_Pointers, Udemy_Arrays | 483 | 86.95
| 0169 |[Majority Element](src/main/kotlin/g0101_0200/s0169_majority_element/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer, Data_Structure_II_Day_1_Array, Udemy_Famous_Algorithm | 460 | 51.25
| 0160 |[Intersection of Two Linked Lists](src/main/kotlin/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Data_Structure_II_Day_11_Linked_List, Udemy_Linked_List | 262 | 83.50
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Data_Structure_II_Day_14_Stack_Queue, Programming_Skills_II_Day_18, Level_2_Day_16_Design, Udemy_Design | 331 | 84.88
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Algorithm_II_Day_2_Binary_Search, Binary_Search_I_Day_12, Udemy_Binary_Search | 262 | 60.96
| 0152 |[Maximum Product Subarray](src/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Dynamic_Programming_I_Day_6, Level_2_Day_13_Dynamic_Programming, Udemy_Dynamic_Programming | 253 | 88.42
| 0148 |[Sort List](src/main/kotlin/g0101_0200/s0148_sort_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Linked_List, Divide_and_Conquer, Merge_Sort, Level_2_Day_4_Linked_List | 820 | 61.70
| 0146 |[LRU Cache](src/main/kotlin/g0101_0200/s0146_lru_cache/LRUCache.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Design, Linked_List, Doubly_Linked_List, Udemy_Linked_List | 1116 | 97.93
| 0142 |[Linked List Cycle II](src/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List, Data_Structure_II_Day_10_Linked_List, Level_1_Day_4_Linked_List, Udemy_Linked_List | 192 | 63.39
| 0141 |[Linked List Cycle](src/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Data_Structure_I_Day_7_Linked_List, Udemy_Linked_List | 223 | 91.85
| 0139 |[Word Break](src/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Algorithm_II_Day_15_Dynamic_Programming, Dynamic_Programming_I_Day_9, Udemy_Dynamic_Programming | 197 | 87.17
| 0138 |[Copy List with Random Pointer](src/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List, Programming_Skills_II_Day_14, Udemy_Linked_List | 274 | 80.58
| 0136 |[Single Number](src/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Data_Structure_II_Day_1_Array, Algorithm_I_Day_14_Bit_Manipulation, Udemy_Integers | 344 | 83.63
| 0131 |[Palindrome Partitioning](src/main/kotlin/g0101_0200/s0131_palindrome_partitioning/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking | 820 | 87.27
| 0128 |[Longest Consecutive Sequence](src/main/kotlin/g0101_0200/s0128_longest_consecutive_sequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Union_Find | 460 | 97.77
| 0124 |[Binary Tree Maximum Path Sum](src/main/kotlin/g0101_0200/s0124_binary_tree_maximum_path_sum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree, Udemy_Tree_Stack_Queue | 331 | 74.42
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Data_Structure_I_Day_3_Array, Dynamic_Programming_I_Day_7, Level_1_Day_5_Greedy, Udemy_Arrays | 609 | 94.06
| 0114 |[Flatten Binary Tree to Linked List](src/main/kotlin/g0101_0200/s0114_flatten_binary_tree_to_linked_list/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Linked_List, Udemy_Linked_List | 305 | 26.30
| 0105 |[Construct Binary Tree from Preorder and Inorder Traversal](src/main/kotlin/g0101_0200/s0105_construct_binary_tree_from_preorder_and_inorder_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer, Data_Structure_II_Day_15_Tree | 370 | 58.31
| 0102 |[Binary Tree Level Order Traversal](src/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_11_Tree, Level_1_Day_6_Tree, Udemy_Tree_Stack_Queue | 355 | 29.37
| 0101 |[Symmetric Tree](src/main/kotlin/g0101_0200/s0101_symmetric_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Data_Structure_I_Day_11_Tree, Level_2_Day_15_Tree | 290 | 26.98
| 0098 |[Validate Binary Search Tree](src/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Data_Structure_I_Day_14_Tree, Level_1_Day_8_Binary_Search_Tree, Udemy_Tree_Stack_Queue | 330 | 41.38
| 0096 |[Unique Binary Search Trees](src/main/kotlin/g0001_0100/s0096_unique_binary_search_trees/Solution.kt)| Medium | Top_100_Liked_Questions, Dynamic_Programming, Math, Tree, Binary_Tree, Binary_Search_Tree, Dynamic_Programming_I_Day_11 | 237 | 26.76
| 0094 |[Largest Rectangle in Histogram](src/main/kotlin/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Data_Structure_I_Day_10_Tree, Udemy_Tree_Stack_Queue | 283 | 17.97
| 0084 |[Largest Rectangle in Histogram](src/main/kotlin/g0001_0100/s0084_largest_rectangle_in_histogram/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Stack, Monotonic_Stack | 525 | 100.00
| 0079 |[Word Search](src/main/kotlin/g0001_0100/s0079_word_search/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Backtracking, Algorithm_II_Day_11_Recursion_Backtracking | 463 | 68.49
| 0078 |[Subsets](src/main/kotlin/g0001_0100/s0078_subsets/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking, Algorithm_II_Day_9_Recursion_Backtracking, Udemy_Backtracking/Recursion | 353 | 30.14
| 0076 |[Minimum Window Substring](src/main/kotlin/g0001_0100/s0076_minimum_window_substring/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Level_2_Day_14_Sliding_Window/Two_Pointer | 346 | 85.20
| 0075 |[Sort Colors](src/main/kotlin/g0001_0100/s0075_sort_colors/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Data_Structure_II_Day_2_Array, Udemy_Arrays | 198 | 85.66
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Data_Structure_I_Day_5_Array, Algorithm_II_Day_1_Binary_Search, Binary_Search_I_Day_8, Level_2_Day_8_Binary_Search, Udemy_2D_Arrays/Matrix | 290 | 40.17
| 0073 |[Set Matrix Zeroes](src/main/kotlin/g0001_0100/s0073_set_matrix_zeroes/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Matrix, Udemy_2D_Arrays/Matrix | 255 | 100.00
| 0072 |[Edit Distance](src/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming, Algorithm_II_Day_18_Dynamic_Programming, Dynamic_Programming_I_Day_19, Udemy_Dynamic_Programming | 320 | 63.53
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Algorithm_I_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_2, Level_1_Day_10_Dynamic_Programming, Udemy_Dynamic_Programming | 127 | 97.06
| 0064 |[Minimum Path Sum](src/main/kotlin/g0001_0100/s0064_minimum_path_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Dynamic_Programming_I_Day_16, Udemy_Dynamic_Programming | 222 | 95.70
| 0062 |[Unique Paths](src/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics, Algorithm_II_Day_13_Dynamic_Programming, Dynamic_Programming_I_Day_15, Level_1_Day_11_Dynamic_Programming | 209 | 49.18
| 0056 |[Merge Intervals](src/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Data_Structure_II_Day_2_Array, Level_2_Day_17_Interval, Udemy_2D_Arrays/Matrix | 323 | 99.68
| 0055 |[Jump Game](src/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Algorithm_II_Day_12_Dynamic_Programming, Dynamic_Programming_I_Day_4, Udemy_Arrays | 670 | 66.67
| 0054 |[Spiral Matrix](src/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_Interview_Questions, Array, Matrix, Simulation, Programming_Skills_II_Day_8, Level_2_Day_1_Implementation/Simulation, Udemy_2D_Arrays/Matrix | 224 | 62.50
| 0053 |[Maximum Subarray](src/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Data_Structure_I_Day_1_Array, Dynamic_Programming_I_Day_5, Udemy_Famous_Algorithm | 662 | 82.48
| 0051 |[N-Queens](src/main/kotlin/g0001_0100/s0051_n_queens/Solution.kt)| Hard | Top_100_Liked_Questions, Array, Backtracking | 243 | 95.10
| 0049 |[Group Anagrams](src/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting, Data_Structure_II_Day_8_String, Programming_Skills_II_Day_11, Udemy_Strings | 506 | 86.55
| 0048 |[Rotate Image](src/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Data_Structure_II_Day_3_Array, Programming_Skills_II_Day_7, Udemy_2D_Arrays/Matrix | 287 | 46.50
| 0047 |[Permutations II](src/main/kotlin/g0001_0100/s0047_permutations_ii/Solution.kt)| Medium | Array, Backtracking, Algorithm_II_Day_10_Recursion_Backtracking | 406 | 76.36
| 0046 |[Permutations](src/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Algorithm_I_Day_11_Recursion_Backtracking, Level_2_Day_20_Brute_Force/Backtracking, Udemy_Backtracking/Recursion | 186 | 100.00
| 0045 |[Jump Game II](src/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy, Algorithm_II_Day_13_Dynamic_Programming, Dynamic_Programming_I_Day_4 | 227 | 98.14
| 0044 |[Wildcard Matching](src/main/kotlin/g0001_0100/s0044_wildcard_matching/Solution.kt)| Hard | Top_Interview_Questions, String, Dynamic_Programming, Greedy, Recursion, Udemy_Dynamic_Programming | 401 | 86.11
| 0043 |[Multiply Strings](src/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation, Data_Structure_II_Day_8_String, Programming_Skills_II_Day_4, Level_2_Day_2_String | 390 | 56.25
| 0042 |[Trapping Rain Water](src/main/kotlin/g0001_0100/s0042_trapping_rain_water/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack, Dynamic_Programming_I_Day_9, Udemy_Two_Pointers | 196 | 100.00
| 0041 |[First Missing Positive](src/main/kotlin/g0001_0100/s0041_first_missing_positive/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Udemy_Arrays | 345 | 100.00
| 0040 |[Combination Sum II](src/main/kotlin/g0001_0100/s0040_combination_sum_ii/Solution.kt)| Medium | Array, Backtracking, Algorithm_II_Day_10_Recursion_Backtracking | 348 | 80.92
| 0039 |[Combination Sum](src/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking, Algorithm_II_Day_10_Recursion_Backtracking, Level_2_Day_20_Brute_Force/Backtracking, Udemy_Backtracking/Recursion | 317 | 86.85
| 0038 |[Count and Say](src/main/kotlin/g0001_0100/s0038_count_and_say/Solution.kt)| Medium | Top_Interview_Questions, String | 317 | 41.11
| 0037 |[Sudoku Solver](src/main/kotlin/g0001_0100/s0037_sudoku_solver/Solution.kt)| Hard | Array, Matrix, Backtracking | 294 | 79.69
| 0036 |[Valid Sudoku](src/main/kotlin/g0001_0100/s0036_valid_sudoku/Solution.kt)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix, Data_Structure_I_Day_5_Array | 346 | 65.03
| 0035 |[Search Insert Position](src/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search, Algorithm_I_Day_1_Binary_Search, Binary_Search_I_Day_2 | 267 | 50.32
| 0034 |[Find First and Last Position of Element in Sorted Array](src/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Algorithm_II_Day_1_Binary_Search, Binary_Search_I_Day_5 | 228 | 83.38
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Algorithm_II_Day_1_Binary_Search | 184 | 86.08
| 0032 |[Longest Valid Parentheses](src/main/kotlin/g0001_0100/s0032_longest_valid_parentheses/Solution.kt)| Hard | Top_100_Liked_Questions, String, Dynamic_Programming, Stack | 215 | 95.71
| 0031 |[Next Permutation](src/main/kotlin/g0001_0100/s0031_next_permutation/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Two_Pointers | 211 | 94.23
| 0030 |[Substring with Concatenation of All Words](src/main/kotlin/g0001_0100/s0030_substring_with_concatenation_of_all_words/Solution.kt)| Hard | String, Hash_Table, Sliding_Window | 441 | 85.84
| 0029 |[Divide Two Integers](src/main/kotlin/g0001_0100/s0029_divide_two_integers/Solution.kt)| Medium | Top_Interview_Questions, Math, Bit_Manipulation, Udemy_Bit_Manipulation | 281 | 31.67
| 0028 |[Find the Index of the First Occurrence in a String](src/main/kotlin/g0001_0100/s0028_implement_strstr/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, String_Matching, Programming_Skills_II_Day_1 | 257 | 32.35
| 0027 |[Remove Element](src/main/kotlin/g0001_0100/s0027_remove_element/Solution.kt)| Easy | Array, Two_Pointers | 293 | 32.19
| 0026 |[Remove Duplicates from Sorted Array](src/main/kotlin/g0001_0100/s0026_remove_duplicates_from_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Two_Pointers | 361 | 77.19
| 0025 |[Reverse Nodes in k-Group](src/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion, Data_Structure_II_Day_13_Linked_List | 194 | 87.72
| 0024 |[Swap Nodes in Pairs](src/main/kotlin/g0001_0100/s0024_swap_nodes_in_pairs/Solution.kt)| Medium | Top_100_Liked_Questions, Linked_List, Recursion, Data_Structure_II_Day_12_Linked_List, Udemy_Linked_List | 149 | 99.39
| 0023 |[Merge k Sorted Lists](src/main/kotlin/g0001_0100/s0023_merge_k_sorted_lists/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Heap_Priority_Queue, Linked_List, Divide_and_Conquer, Merge_Sort | 323 | 75.14
| 0022 |[Generate Parentheses](src/main/kotlin/g0001_0100/s0022_generate_parentheses/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking, Algorithm_II_Day_11_Recursion_Backtracking | 210 | 78.51
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Data_Structure_I_Day_7_Linked_List, Algorithm_I_Day_10_Recursion_Backtracking | 148 | 99.90
| 0020 |[Valid Parentheses](src/main/kotlin/g0001_0100/s0020_valid_parentheses/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack, Data_Structure_I_Day_9_Stack_Queue | 196 | 71.08
| 0019 |[Remove Nth Node From End of List](src/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List, Algorithm_I_Day_5_Two_Pointers | 172 | 85.17
| 0018 |[4Sum](src/main/kotlin/g0001_0100/s0018_4sum/Solution.kt)| Medium | Array, Sorting, Two_Pointers | 467 | 81.25
| 0017 |[Letter Combinations of a Phone Number](src/main/kotlin/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking, Algorithm_II_Day_11_Recursion_Backtracking | 132 | 100.00
| 0016 |[3Sum Closest](src/main/kotlin/g0001_0100/s0016_3sum_closest/Solution.kt)| Medium | Array, Sorting, Two_Pointers | 219 | 89.56
| 0015 |[3Sum](src/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Data_Structure_II_Day_1_Array, Algorithm_II_Day_3_Two_Pointers | 1059 | 55.28
| 0014 |[Longest Common Prefix](src/main/kotlin/g0001_0100/s0014_longest_common_prefix/Solution.kt)| Easy | Top_Interview_Questions, String | 269 | 48.51
| 0013 |[Roman to Integer](src/main/kotlin/g0001_0100/s0013_roman_to_integer/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Math | 293 | 78.06
| 0012 |[Integer to Roman](src/main/kotlin/g0001_0100/s0012_integer_to_roman/Solution.kt)| Medium | String, Hash_Table, Math | 300 | 72.89
| 0011 |[Container With Most Water](src/main/kotlin/g0001_0100/s0011_container_with_most_water/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers, Algorithm_II_Day_4_Two_Pointers | 635 | 64.22
| 0010 |[Regular Expression Matching](src/main/kotlin/g0001_0100/s0010_regular_expression_matching/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Recursion | 234 | 85.18
| 0009 |[Palindrome Number](src/main/kotlin/g0001_0100/s0009_palindrome_number/Solution.kt)| Easy | Math | 208 | 94.88
| 0008 |[String to Integer (atoi)](src/main/kotlin/g0001_0100/s0008_string_to_integer_atoi/Solution.kt)| Medium | Top_Interview_Questions, String | 152 | 99.64
| 0007 |[Reverse Integer](src/main/kotlin/g0001_0100/s0007_reverse_integer/Solution.kt)| Medium | Top_Interview_Questions, Math | 230 | 57.36
| 0006 |[Zigzag Conversion](src/main/kotlin/g0001_0100/s0006_zigzag_conversion/Solution.kt)| Medium | String | 351 | 78.99
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Data_Structure_II_Day_9_String, Algorithm_II_Day_14_Dynamic_Programming, Dynamic_Programming_I_Day_17 | 359 | 69.08
| 0004 |[Median of Two Sorted Arrays](src/main/kotlin/g0001_0100/s0004_median_of_two_sorted_arrays/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Divide_and_Conquer | 276 | 91.12
| 0003 |[Longest Substring Without Repeating Characters](src/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Algorithm_I_Day_6_Sliding_Window | 212 | 91.24
| 0002 |[Add Two Numbers](src/main/kotlin/g0001_0100/s0002_add_two_numbers/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion, Data_Structure_II_Day_10_Linked_List, Programming_Skills_II_Day_15 | 212 | 93.71
| 0001 |[Two Sum](src/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Data_Structure_I_Day_2_Array, Level_1_Day_13_Hashmap, Udemy_Arrays | 234 | 92.75

## Contributing
Your ideas/fixes/algorithms are more than welcome!

1. Fork this repo
2. Clone your forked repo (`git clone https://github.com/YOUR_GITHUB_USERNAME/LeetCode-in-Kotlin.git`) onto your local machine
3. `cd` into your cloned directory, create your feature branch (`git checkout -b my-awesome-fix`)
4. `git add` your desired changes to this repo
5. Commit your changes (`git commit -m 'Added some awesome features/fixes'`)
6. Push to the branch (`git push origin my-awesome-feature`)
7. Open your forked repo on Github website, create a new Pull Request to this repo!
