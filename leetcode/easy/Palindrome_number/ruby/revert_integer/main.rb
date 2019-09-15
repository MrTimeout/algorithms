#!/usr/bin/ruby

# @param {Integer} x
# @return {Boolean}
def is_palindrome(x)
    if x < 0 or (x != 0 and x % 10 == 0)
        return false
    end
    if x == 0 
        return true
    end
    revert_num = 0
    until revert_num >= x
        revert_num = revert_num * 10 + x % 10
        x /= 10
    end
    x == revert_num or x == revert_num / 10
end

print is_palindrome(11)