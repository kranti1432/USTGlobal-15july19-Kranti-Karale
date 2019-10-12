var fruits=['apple','banana','orange'];
console.log(fruits);
for(var i=0;i<fruits.length;i++){
    console.log(fruits[i]);
}
var  todayDate=new Date();
console.log("todayts date="+todayDate);
var date=new Date(2019,7,4,45,46,44)
console.log(Date);
var datetoday=new Date(0);
console.log(datetoday);

var datestring= new Date('October 13, 2014 11:13:00');

console.log(datestring);
var datefull= new Date();
var month=['jan','feb','mar','apr','may','june','july','aug','sep','oct','nov','dec'];
var days=['sun','mon','tues','wed','thur','fri','sat'];
console.log(month[datefull.getMonth()]);
console.log(days[datefull.getDay()]);
console.log(Math.ceil(4.4));
console.log(Math.log10(5));
console.log(Math.random());
console.log(Math.floor(4.5));
console.log(Math.round(7.9));
console.log(Math.pow(2,3));
// --------------------------------------------------MUTABLE--------------------------------------
var name='rahul';
console.log(name);
var name1=name;
console.log(name1);
name1='gandhi';
console.log(name);
console.log(name1);
// -------------------------------------------------------IMMUTABLE-----------------------------------
var person={
    name:'kranti'
}
console.log(person.name);
var person1=person;
console.log(person1.name);
person1.name='karale';

