# return the number of times c occurs in s, e.g.,
# number_c("a", "ababccaad") -> 4
def number_c(c, s):
    # print(s[1:])
    if(len(s) == 0):
        return 0
    if(s[:1] != c):
        return number_c(c,s[1:])
    return 1 + number_c(c,s[1:])

# return the number of chars in s that are not c, e.g.,
# number_not_c("a", "ababccaad") -> 5
def number_not_c(c, s):
    if(len(s) == 0):
        return 0
    if(s[:1] != c):
        print(s[:])
        return 1 + number_not_c(c,s[1:])
    return number_not_c(c,s[1:])

# return a copy of s but with all occurrences of c replaced by d, e.g.,
# replace("abeabe", 'e', '$') -> "ab$ab$"
# you are not allowed to use any Python libraries
def replace(s, c, d):
    if(s == ''):
        return '' 
    if(s[:1] == c):
        return d + replace(s[1:], c, d)
    return s[:1] + replace(s[1:], c, d)

# print(replace("abeabe", 'e', '$'))


# return a copy of s with char_to_remove removed, e.g.,
# remove_char("abeabe", 'e') -> "abab"
# you are not allowed to use any Python libraries
def remove_char(s, char_to_remove):
    if(s == ''):
        return '' 
    if(s[:1] == char_to_remove):
        return remove_char(s[1:],char_to_remove)
    return s[:1] + remove_char(s[1:],char_to_remove)

# print(remove_char("abeabe", 'e'))

# return a copy of s with characters in reverse order, e.g.,
# reverse("abcdefg") = "gfedcab"
def reverse(s):
    if(s == ''):
        return ''
    # print(s[-1])
    return reverse(s[1:])+s[0]

# print(reverse("abcdefg"))

# return a copy of s with adjacent duplicates removed, e.g.,
# rem1("abbcccdeaaa") -> "abcdea"
def rem1(s):
    if(s == ''):
        return ''
    if(s[:1] == s[1:2]):
        return rem1(s[1:])
    else: return s[:1] + rem1(s[1:])
# print(rem1("abbcccdeaaa"))

# return the number of the digits in the decimal representation of n, e.g.,
# num_digits(0) -> 1, num_digits(34) -> 2, num_digits(1356) -> 4
# Precondition: n >= 0
def num_digits(n):
    n = int(n)
    if n < 10: 
        return 1
    else:
        return 1 + num_digits(n /10)
# print(num_digits(12340))

# return the sum of the digits in the decimal representation of n, e.g.,
# sum_digits(0) -> 0, sum_digits(3) -> 3, sum_digits(345) -> 12
# Precondition: n >= 0
def sum_digits(n):
    n = int(n)
    if n <= 0:
        return 0
    else:
        return (n%10) + sum_digits(n/10)
# print(sum_digits(1))

# print("number_c")
# print(number_not_c('c', "aaabbbaccabda"))
# print(number_c('b', "aaabbbaccabda"))
# print(number_c('c', "aaabbbaccabda"))
# print(number_c('d', "aaabbbaccabda"))
# print()
# print("number_not_c")
# print(number_not_c('a', "aaabbbaccabda"))
# print(number_not_c('b', "aaabbbaccabda"))
# print(number_not_c('c', "aaabbbaccabda"))
# print(number_not_c('d', "aaabbbaccabda"))
# print()
# print("replace")
# print(replace("aaabbbaccabda", 'a', 'b'))
# print(replace("aaabbbaccabda", 'b', 'c'))
# print(replace("aaabbbaccabda", 'c', 'd'))
# print(replace("aaabbbaccabda", 'd', 'a'))
# print(replace("a", 'a', 'd'))
# print(replace("a", 'd', 'a'))
# print(replace("", 'a', 'a'))
# print()
# print("remove_char")
# print(remove_char("eawabbcceccddeeaaeeeee", 'e'))
# print(remove_char("acacacacac", 'a'))
# print(remove_char("a", 'a'))
# print(remove_char("", 'a'))
# print()
# print("reverse")
# print(reverse("aaabbbaccabda"))
# print(reverse("abbcccdeaaa"))
# print(reverse("AMANAPLANACANALPANAMA"))
# print()
# print('rem1')
# print(rem1("aaabbbaccabda"))
# print(rem1("abbcccdeaaa"))
# print(rem1("aaaaaaaaaaaaaaaaaaa"))
# print(rem1("aabbbccccdddddeeeeeee"))
# print(rem1("a"))
# print(rem1(""))
# print()
# print("num_digits")
# print(num_digits(123))
# print(num_digits(123456))
# print(num_digits(1))
# print(num_digits(0))
# print()
# print("sum_digits")
# print(sum_digits(123))
# print(sum_digits(123456))
# print(sum_digits(1))
# print(sum_digits(0))
