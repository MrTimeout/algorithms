def print_rangoli(size):
  abc = list(map(chr, range(97+size-1, 96, -1)))
  for j in range(0, 2):
    if j == 1:
      other = 2
    else:
      other = (size-1)*2
    for i in range(0 if j == 0 else size-2, size if j == 0 else -1, 1 if j == 0 else -1):
      print_other(other, '-')
      print_letter_with(i, '-', abc)
      print_other(other, '-')
      print('', end='\n')
      if j == 1:
        other += 2
      else:
        other -= 2

def print_letter_with(f, char, abc):
  i = 0
  while i <= f:
    print(abc[i] if i==f else "{}{}".format(abc[i],char), end='')
    i+=1
  if f != 0:
    print(char, end='')
  i = f-1
  while i >= 0:
    print(abc[i] if i==0 else "{}{}".format(abc[i],char), end='')
    i-=1

def print_other(size, char):
  for i in range(0, size):
    print(char, end='')

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
