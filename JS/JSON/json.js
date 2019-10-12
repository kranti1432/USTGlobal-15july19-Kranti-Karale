let employeeJSON={
    name:'dinga',
    age:24,
    hobbie:['dancing','singing']
}
console.log(`my name is ${employeeJSON.name}`);
console.log(employeeJSON); //it gives object
let jsonObject=JSON.stringify(employeeJSON); //object to string
console.log(jsonObject);
let jObject=JSON.parse(jsonObject)//agian object
console.log(jObject);

