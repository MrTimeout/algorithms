/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let map = new Map();
    for(let i = 0; i < nums.length; i++)
        map.set(nums[i], i);
    
    for(let i = 0; i < nums.length; i++)
    {
        let temp = target - nums[i];
        if(map.has(temp) && map.get(temp) != i)
            return new Array(i, map.get(temp));
    }
    return null;
};
