def check_logs(log):
    if not log:
        return 0
    c=1
    for i in range(len(log)-1):
        if log[i]>=log[i+1]:
            c+=1
    return c
    return 0