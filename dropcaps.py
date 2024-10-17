def drop_cap(words):
    return ' '.join(w.capitalize() if len(w)>2 else w for w in words.split(' '))
if __name__ == "__main__":
    words=input()
    print(drop_cap(words))