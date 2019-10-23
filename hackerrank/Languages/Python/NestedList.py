if __name__ == '__main__':
    l = list()
    ll = list()
    minn = 100
    for _ in range(int(input())):
        name = input()
        score = float(input())
        l.append([name, score])
        ll.append(score)
        if score < minn:
            minn = score
    lll = list()
    for i in ll:
        if i != minn:
            lll.append(i)
    minn = 100
    for i in lll:
        if i < minn:
            minn = i
    ll = list()
    for i in range(len(l)):
        if l[i][1] == minn:
            ll.append(l[i][0])
    ll.sort()
    for i in ll:
        print(i, end='\n')

