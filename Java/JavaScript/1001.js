const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (A) => {  
  rl.question('', (B) => {  

    A = parseInt(A);
    B = parseInt(B);

    let X = A + B;
    console.log(`X = ${X}`);
    rl.close();
  });
});
