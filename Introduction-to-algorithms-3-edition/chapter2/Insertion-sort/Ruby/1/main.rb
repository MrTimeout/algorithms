
# @param {Array} arr
# @return {Array}
def insertion_sort(arr)
    j = 1
    for j in j...arr.length do
        key = arr[j]
        i = j - 1
        while i > 0 and arr[i] > key
            arr[i + 1] = arr[i]
            i--
        end
        arr[i + 1] = key
    end
end
