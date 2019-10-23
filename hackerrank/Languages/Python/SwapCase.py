def swap_case(s):
  str = ""
  for x in s:
    if ord(x) > 96 and ord(x) < 123:
      str += chr(ord(x) - 32)
    elif ord(x) > 64 and ord(x) < 91:
      str += chr(ord(x) + 32)
    else:
      str += x
  return str 
 
if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
