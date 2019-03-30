'''John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
    Given an array of integers representing the color of each sock, determine how many pairs of socks
    with matching colors there are.

For example, there are n = 7 socks with colors ar = [1, 2, 1, 2, 1, 3, 2]. There is one pair of color 1
and one of color 2.
There are three odd socks left, one of each color. The number of pairs is 2.'''


# import array as arr
# a = arr.array('i', [10, 20, 10, 30, 20, 50, 10])
# b = a
# n = a.len()

a = [10, 20, 10, 30, 20, 50, 10]
n = len(a)
print("John have {0} socks".format(n))

i = 0
for a[i] in a :
    b = a.count(a[i])
    print("There are {0} no of {1}".format(b, a[i]))
    pair = b // 2
    print("There are {0} pairs of {1} are formed".format(pair, a[i]))
    i = i + 1