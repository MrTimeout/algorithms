#!/usr/bin/ruby

# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    for i in 0...nums.length
        for j in i+1...nums.length
            if nums[i] + nums[j] == target
                return [i, j]
            end
        end
    end
    return nil
end

print two_sum([3, 2, 4], 6)