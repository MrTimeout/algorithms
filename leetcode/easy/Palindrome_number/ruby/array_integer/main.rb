#!/usr/bin/ruby

# @param {Integer} x
# @return {Boolean}
def is_palindrome(x)
    if x < 0 
        return false
    end
    result = int_segment(x)
    for i in 0...result.length() do
        if result[i] != result[-i-1]
            return false
        end
    end
    return true
end

# @param {Integer} x
# @return {Array}
def int_segment(x)
    arr = []
    until x <= 0
        arr.push(x%10)
        x /= 10
    end
    return arr
end

print is_palindrome(29)
