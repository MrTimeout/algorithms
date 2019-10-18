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

function getGrade(score) {
    if(score < 6) return 'F';
    else if(score < 11) return 'E';
    else if(score < 16) return 'D';
    else if(score < 21) return 'C';
    else if(score < 26) return 'B';
    else return 'A';
}

