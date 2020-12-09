console.log("----1----")
let test : string ="Weerawat Rattanachai"
console.log(test.length);

console.log("---------")

console.log("")
console.log("----2----")
console.log(test.charAt(0));
console.log(test.charAt(1));
console.log(test.charAt(2));
console.log(test.charAt(3));
console.log(test.charAt(4));
console.log(test.charAt(5));
console.log(test.charAt(6));
console.log(test.charAt(7));
console.log("---------")
console.log("")
console.log("----3----")
console.log (test[7])
console.log("---------")
console.log("")
console.log("----4----")
console.log (test.charAt(20))
console.log (test[20])
console.log("---------")
console.log("")
console.log("----5----")
let test1: string = "hello ";
let test2: string= "World";
console.log(`${test1}${test2}`);
console.log("---------")
console.log("")
console.log("----6----")
let micro : string = "microsoft excel"
let appl : string = "GOOGLE AND APPLE"
console.log(micro.toLocaleUpperCase())


console.log("---------")
console.log("")
console.log("----7----")
console.log(appl.toLocaleLowerCase())
console.log("---------")
console.log("")
console.log("----8----")
let test4 :string = "hello world"
test4 = "H" + test4.substring(1,6)+"W"+test4.substring(7)
console.log(test4)
console.log("---------")
console.log("")
console.log("----9----")
console.log(test4.startsWith("Hello"));
console.log(test4.startsWith("World"));
console.log(test4.endsWith("Hello"));
console.log(test4.endsWith("World"));
console.log("---------")
console.log("")
console.log("----10----")
console.log("Computer".slice(3,6));
console.log("Death Race".slice(0,4));
console.log("Republican".slice(2,8));
console.log("---------")
console.log("")
console.log("---11----")
console.log("1,000,000 = "+1e6)
console.log("10,000,000 = "+1e7)
console.log("43,000,000,000 = "+4.3e10)
console.log("0.000012 = "+1.2e-5)
console.log("0.0000001234 = "+1.234e-7)
console.log("1e10 = "+1*(10**10))
console.log("2e5 = "+2*(10**5))
console.log("122e8 = "+122*(10**8))
console.log("1e-8 = "+1*(10**-8))
console.log("12e-5 = "+(1.2*(10**-4)).toFixed(5))
console.log("---------")
console.log("")
console.log("----12----")
let num:number[]=[100,111,55,21,99];
num.map(item =>console.log(`${item} "to octa = " ${item.toString(8)}`))
num.map(items =>console.log(`${items} "to hexa = " ${items.toString(16)}`))
console.log("round 12.423 = "+Math.round(12.423))
console.log("round 31313.135 = "+Math.round(31313.135))
console.log("round 42.809 = "+Math.round(42.809))
console.log("---------")
console.log("")



// let test1 : string;
// let test2 : string;
// var test3 : Number;

// test3 = 1234566;



// console.log(`${typeof test}  ${typeof test1}`);
// console.log(typeof test , typeof test1, typeof test2, typeof test3);

// console.log( String.fromCodePoint(55));



// for (let index = 0; index <= 500; index++) {
//     console.log( String.fromCodePoint(index),index);
    
// }


// //1.
// var test10 : string = "This is hello world ";
// console.log("1",test10)

// //2.
// console.log ("2",test10.charAt(3))

// //3.
// console.log ("3",test10[2])

// //4.
// console.log ("4",test10.charAt(20))
// console.log ("4",test10[20])

// //5.
// var str1: string = "hello"
// var str2: string = "World"
// console.log ("5",`${str1} ${str2}`)

// console.log(str1.startsWith("rr"))
// console.log(str1.startsWith("h"))