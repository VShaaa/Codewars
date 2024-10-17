function getScore(dice) { 
    let c = Array(7).fill(0);
    for (let d of dice) {
        c[d]++;
    }

    let s = 0;

    if (c.slice(1).every(count => count === 1)) {
        return 1000;
    }

    let p = c.filter(count => count === 2).length;
    if (p === 3) {
        return 750;
    }

    for (let i = 1; i <= 6; i++) {
        if (c[i] >= 3) {
            let baseS = (i === 1) ? 1000 : i * 100;
            switch (c[i]) {
                case 3:
                    s += baseS;
                    break;
                case 4:
                    s += baseS * 2;
                    break;
                case 5:
                    s += baseS * 3;
                    break;
                case 6:
                    s += baseS * 4;
                    break;
            }
            c[i] = 0;
        }
    }

    s += c[1] * 100;
    s += c[5] * 50;

    return s;
}