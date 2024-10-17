function* mt(m) {
    let i = 0
    while (i++ < 10) 
      yield `${m} x ${i} = ${m*i}`
}

function* generator(a, b) {
  while(a <= b) 
    yield mt(a++)
}