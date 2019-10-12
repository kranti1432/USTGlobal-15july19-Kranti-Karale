/// <reference path="./rectangle.ts"/>



let myName="kranti";                 //type string
// myName=23;                           // cant reassign 
let company;                        // type any
company='ust global';
company=23;                      //reassigning dont throw error
console.log(company);
console.log(myName);



let sample: number | boolean;
sample=10;
sample=true;
console.log(sample);
//---------------------------------------array--------------

let myArray=[1345,'keja','awhajd',true];             // it takes type as any so no error
console.log(myArray);                                      //if we gives string numbrs boolean

//--------------------------------------------tuple---------------------

let myTuple:[string,number,boolean]=['kk',56,true];        // we should take all datatypes maintained in same order


//-----------------------------enum--------------------

enum colors{
    red= 300,                         // if we gives value as numb no need to givs everyon but string need
//   red='jj';
    green,
    blue,
    black
}
console.log(colors.black);



// class Person{
//     name:string='raja';
//     age:number=45;
//     constructor(personName:string, personAge:number){
//         this.name=personName;
//         this.age=personAge;
//     }
// }
 
// let person=new Person('raja', 45);
// console.log(person.name);




// class Person {
//     constructor(public personName:string, public personAge:number){

//     }
// }
 
// let person=new Person('raja', 45);
// console.log(person.personAge);





//----------------------------------------------class-------------------------

// class Car{
//     name:string='raja';
//     static model:string='x5';
// }

// let bmwcar= new Car();
// console.log(bmwcar.name);



//---------------------------constructor---------------

// class Car{
//     constructor(public brand:string,public model:string){

//     }
// }

// let bmwcar=new Car('bmw', 'x5');
// console.log(bmwcar.brand);
// console.log(bmwcar.model);


// //-------------------------------------class extends and access contructor using super keyword


// // class Person{
// //     constructor(public name:string,public age:number){

// //     }
// // }

// // class Student extends Person{
// //     constructor(public myname:string,public myage:number, public USH:number){
// //         super(myname,myage);
// //     }
// }

// let person1=new Person('dinga',23)
// let student1=new Student('dingi',43,2738293);

// console.log(student1.myname);
// console.log(student1.USH);




//-------------------------------------------------optional and object vreation------

// class personn{
//     constructor(public name:string, public age:naumber, public degree?:string)

// }

// let personn:personn1{
//     name:'dinga',
//     age:34                                      //degree optional
// }





//---------------------------interface (only decleartion no initial possible)--------

// interface Student{
//     name:string;
//     age:number;
//     printDetails():void;
// }
// class Person implements Student{
//     name='raja';
//     age=23;
//     printDetails(){
//         console.log("name is"+this.name +' and age is ='+this.age)  //must be give defination to method
//     }
// }
// let person1=new Person();
// person1.printDetails();      //method call



// let student1:Student={
// name:'xyz',
// age:23,
// printDetails:()=>{
//     console.log('name is='+student1.name + ' and age is ='+student1.age);
// }
// }
// student1.printDetails();





//----------------------generic offers way to create reusable components------

// function getArray(items:string[]){                       //string data type
//     return new Array().concat(items);
// }
// console.log(getArray(['ada','adad','dawdasd']));



// function getArray<p>(items:p[]):p[]{                       //string data type
//        return new Array<p>().concat(items);
//      }
//   let strArray=   getArray<string>(['ada','adad','dawdasd']);  //string
// let numarray=getArray<number>([34,45,57,24]);
// console.log(strArray);
// console.log(numarray);


    
//----------------------------------------NAMESPACE---------------
// namespace MathOperations{
//     export namespace Circle{
//     const pi=3.14;
//    export function circumferenceofcircle(radius:number){
//         console.log("circumference of circle="+2*pi*radius);
//     }
//    export function areaofcircle(radius:number){
//         console.log("area  of circle= "+pi*radius*radius);
//     }
// } 
// }
// MathOperations.Circle.circumferenceofcircle(5);


//--------------------------------------------imported rectn.js
MathOperations.rectangle.area(10,5);




