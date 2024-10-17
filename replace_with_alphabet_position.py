def alphabet_position(text):
    alphabets = "abcdefghijklmnopqrstuvwxyz"
    return " ".join([str(alphabets.find(ch) + 1) for ch in text.lower() if ch in alphabets])
pass
