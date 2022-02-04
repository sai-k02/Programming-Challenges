"""

Determine if two strings are valid anagrams

Method: Iterate through all unique characters and make sure the count is the same in both strings

"""

def isAnagram(s, t):
    if(len(s) != len(t)):
        return False

    for element in set(s):
        if (s.count(element) != t.count(element)):
            return False

    return True

def main():
    print(isAnagram("abc", "cba"))

main()



