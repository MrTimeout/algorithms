'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

const getMaxLessThanK = (n, k) => {
    let r = 0, o;
    let is = (n) => {
        let m = 0;
        for(let i = 0; i < n.length; i++) {
            if(n[i] == '1') {
                m++;
            }
        }
        return m;
    }
    for(let i = 1; i <= n; i++) {
        for(let j = i+1; j <= n; j++) {
            o = i&j
            if(o < k && o > r) {
                r = o;
            }
        }
    }
    return r;
}

