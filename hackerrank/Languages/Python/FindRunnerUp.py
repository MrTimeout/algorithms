from functools import reduce

if __name__ == '__main__':
    n = int(input())
    li = list(map(int, input().split(' ')))
    max = reduce(lambda x, y: x if x > y else y, li)
    second = -101
    for i in range(0, len(li)):
      if li[i] > second and li[i] < max:
        second = li[i]

    print(second)
