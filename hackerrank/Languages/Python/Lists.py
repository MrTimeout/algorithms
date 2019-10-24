def parse(l, s):
  split = s.split(' ')
  if split[0] == 'print':
    print(l)
  elif split[0] == 'sort':
    l.sort()
  elif split[0] == 'reverse':
    l.reverse()
  elif split[0] == 'pop':
    l.pop()
  elif split[0] == 'insert':
    l.insert(int(split[1]), int(split[2]))
  elif split[0] == 'remove':
    l.remove(int(split[1]))
  elif split[0] == 'append':
    l.append(int(split[1]))
  return l

if __name__ == '__main__':
  n = int(input())
  l = list()
  for i in range(0, n):
    l = parse(l, input())
