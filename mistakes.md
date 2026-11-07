My DSA Mistakes Diary

I will record my mistakes here so that I don't repeat them.

-> Day 1(Nov 7 2026)

> Problem: find Max in array
My mistake: i didnt handle empty array
I only handled the empty array, and `null` would still crash.

> What did I do wrong?
Correct approach:
**Lesson:** Check for null and empty arrays before using the array**
if (arr == null || arr.length == 0) {
    throw new IllegalArgumentException("Array cannot be null or empty");
}

> What is the right way to solve it?
What I learned: To Check `arr == null` first, then `arr.length`.

> Write one important thing you understood.
1.wee need to handle empty  array .
2.that wee nned to write loggic inside a seperate method useful for companies and leetcode practise
3.java we dont use explicit pointers instead we use 2 variables that store the array index.
4.for counting frequency use hashmap and to check element exits or duplicates use hashset.
5.You write Integer (capital I) in syntax of hashmap, not int, because HashMap only works with object types. Java converts between int and Integer automatically.
Revision:
> Revise find Max.
