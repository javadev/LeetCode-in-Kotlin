914\. X of a Kind in a Deck of Cards

Easy

You are given an integer array `deck` where `deck[i]` represents the number written on the <code>i<sup>th</sup></code> card.

Partition the cards into **one or more groups** such that:

*   Each group has **exactly** `x` cards where `x > 1`, and
*   All the cards in one group have the same integer written on them.

Return `true` _if such partition is possible, or_ `false` _otherwise_.

**Example 1:**

**Input:** deck = [1,2,3,4,4,3,2,1]

**Output:** true

**Explanation:**: Possible partition [1,1],[2,2],[3,3],[4,4].

**Example 2:**

**Input:** deck = [1,1,1,2,2,2,3,3]

**Output:** false

**Explanation:**: No possible partition.

**Constraints:**

*   <code>1 <= deck.length <= 10<sup>4</sup></code>
*   <code>0 <= deck[i] < 10<sup>4</sup></code>