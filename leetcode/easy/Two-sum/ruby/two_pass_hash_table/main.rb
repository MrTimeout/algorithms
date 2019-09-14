#!/usr/bin/ruby

# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    map = Hash.new
    for i in 0...nums.length do
        if map[nums[i]] == nil
            map[nums[i]] = i
        end
    end
    for i in 0...nums.length do
        temp = map[target - nums[i]]
        if temp != nil and i != temp
            return [i, temp]
        end
    end
    return nil
end

print two_sum([3, 2, 4], 6)
