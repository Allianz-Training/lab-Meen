// let propN = {N : 'wee' , age : 30}
// console.log('N' in propN)
// console.log('last' in propN)


// let a = {};
// let b = {};
// console.log(a=b)

let numberic = 1.23456;
console.log(Math.floor(numberic*100)/100);
console.log(Math.floor((numberic*100)/100));
console.log("---------------------------------------------------------------------------------")
function randomMNMX(min: number,max : number){
  return Math.random()*(max-min)+min;

}
console.log(randomMNMX(-20,39));
console.log("---------------------------------------------------------------------------------")
let A:boolean ,C:boolean = false;
let B : boolean = true;
console.log("A || ( B&&C) = ",A||(B&&C))
console.log("A||(B||C) =",A||(B||C));
console.log("B&&(A||C) =",B&&(A||C));
console.log("---------------------------------------------------------------------------------")
let arr=[false,"ABD",113113,null,"",'13qed'];
arr.map(item=>console.log(`type ${item} = `,typeof item))
console.log("---------------------------------------------------------------------------------")

let student :any= {
    Name: "Weerawat",
    LastN: "Rattanachai",
    age :  22,
    ishere: false,
    sizes: {
      height: 180,
      weight: 84
    }

  };
  console.log(   student.Name ,student.LastN ,student.sizes.height, "Age"+" "+ student.age , student.ishere ); 
  console.log("---------------------------------------------------------------------------------")
let student2: any = {};
for(let key in student){
  student2[key]= student[key]
}
// console.log(student2)

student2.Name = null;
console.log(student2.Name ,student2.LastN ,student2.sizes.height, "Age"+" "+ student2.age , student2.ishere )
console.log("---------------------------------------------------------------------------------")

student2.isActive=true;
for(let key in student){
    console.log(`${key} : ${student[key]}`)
}

delete student2.isActive;
for(let key in student){
  console.log(`${key} : ${student[key]}`)
}
console.log("---------------------------------------------------------------------------------")
let stringAssign: string = 'app;e , cat ,zoo , Bird, dog'
let input: string[]= stringAssign.split(', ').sort();
console.log(input)
console.log("---------------------------------------------------------------------------------")
let array2:number[]=[123,132,423,423,12345,5343,52,10904,64];
console.log(array2.filter(item=>(item+'').startsWith('1')));
let array3:string[]=["Apple","Mango","Cat","Banana"];
array3.splice(2,1,"Orange");
console.log(array3)
console.log("---------------------------------------------------------------------------------")
const heroes= [
  {
      id:"a001",
      name:"Thor",
      weapons:["axe","hammer"],
  },
  {
      id:"a002",
      name:"Tony",
      weapons:["iron suite"],
  },
]
let heroesMap=new Map();
heroes.map(item=>heroesMap.set(item.id,item));
console.log(heroesMap);
console.log(heroesMap.get('a001'));
console.log(heroesMap.get('a002'));
heroesMap.delete('a001');
console.log('Delete a001');
console.log(heroesMap);

console.log("---------------------------------------------------------------------------------")

let areaRectangle = (width:number,lengthh:number)=>{
  let area=width*lengthh;
  return area;
}
console.log("Area 3,7 : "+areaRectangle(3,7));
let isPrime = (num:number) => {
  for(let i = 2; i < num; i++){
      if(num % i == 0) {
          return false;
      }            
  }
  return num > 1;
}
console.log("37 isPrime : "+isPrime(37));
console.log("39 isPrime : "+isPrime(39));

console.log("---------------------------------------------------------------------------------")


console.log("---------------------------------------------------------------------------------")
interface IdCard{
  idNumber:number;
  name:string;
  surname:string;
  address:string;
}
interface subject{
  subjectName:string;
}
interface subjectDetail{
  subject:subject;
  subjectCode:string;
  subjectCredit:number;
}
console.log("interface example");
console.log("---------------------------------------------------------------------------------")

console.log("---------------------------------------------------------------------------------")
enum translationEnum{
  English='English',
  Thai='Thai',
  French='French',
  Dutch='Dutch'
}
let switchEnum=(code:number) =>{
  switch (code) {
      case 1:
          return translationEnum.English;
      case 2:
          return translationEnum.Thai;
      case 3:
          return translationEnum.French;
      case 4:
          return translationEnum.Dutch;
      default:
          return translationEnum.English;
  }
}
console.log("input 1 :",switchEnum(1));
console.log("input 2 :",switchEnum(2));
console.log("input 3 :",switchEnum(3));
console.log("input 4 :",switchEnum(4));
console.log("---------------------------------------------------------------------------------")


console.log("---------------------------------------------------------------------------------")
let arrNumber = new Array<number>();
arrNumber.push(3);
// arrNumber.push('3'); //error
interface StudentDetail{
    studentID:number;
    name:string;
    surname:string;
}
let studentDetail = new Map<string, StudentDetail>()
let std: StudentDetail={
    studentID:9999,
    name:'John',
    surname:'Doe'
}
studentDetail.set('007',std);
console.log(studentDetail);
console.log("---------------------------------------------------------------------------------")






//   let clone = student;  

//   clone.Name = null;
// // let clone = Object.assign({},student)

// console.log("8;p",clone)

// //  console.log(clone)
//   console.log( student.sizes.height , student.Name , student.LastN ,student.age , student.ishere ); 

//   for (let key in student) {
    
//     console.log(key,student[key])
// }

// Object.assign(clone, {isActive:true})
// console.log("john",clone)

// // delete clone.isActive
// // console.log("sdsd",clone)
