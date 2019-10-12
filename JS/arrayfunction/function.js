var hobbies=['singing','coding','dancing','sleeping','reading'];
hobbies.forEach(function(value,index){
    console.log('hobbies='+value);
});
console.log("================================================================");



hobbies.forEach((value,index)=>{         //fat arrow==========================
    console.log('hobbies='+value);
});
hobbies.push('bike riding','travelling');
console.log("hobbies after push="+hobbies);
console.log("____________________________");
hobbies.pop();
console.log("hobbies after pop="+hobbies);
hobbies.unshift('reading','writing');
console.log("hobbies after unshift="+hobbies);
hobbies.shift();
console.log("hobbies aftrt shift="+hobbies);
console.log("-------------------------------------------");

var hashobbies=hobbies.includes('cooking');
console.log(hashobbies);
var hashobbies=hobbies.includes('reading');
console.log(hashobbies);
console.log("-----------------------");
hobbies.splice(2,0,'reading','writing');
console.log(hobbies);
console.log("----------------------");
var hobbies1=hobbies.slice(0,1);                        // not modify orignal array ..create new array from 0 1(1-1)=0
console.log(hobbies);
console.log(hobbies1);
console.log("---------------------------------");
 var joinhobbies=hobbies.join('@');                         //join add after every value of array
console.log(joinhobbies);
console.log("---------------------------------");
var value=hobbies.indexOf('singing');                       //gives index of value
console.log(value);
console.log("---------------------------------");
var value=hobbies.indexOf('cooking');
console.log(value);
console.log("---------------------------------");
var numbers=[10,20,30,40,50];
var newnumbers=numbers.map((val,index)=>{                          // mpa modify each and every element
    val=val+10;
    return val;
});
console.log("old array="+numbers);
console.log("---------------------------------");
console.log("new array="+newnumbers);
console.log("---------------------------------");
var kranti=[20,30,40,50,60,70];                                        //filter
var kranti2=kranti.filter((val,index)=>{
    return val>40;
});
console.log(kranti2);
console.log("---------------------------------");
var items=[{
    item:'pen',
    price:200
},
{
    item:'book',
    price:300
},
{
    item:'pencil',
    price:500
},
{
    item:'notebook',
    price:100
},
];
var newitem=items.map((value,index)=>{            //====================     modify price of item     
    value.price=value.price+10;
    return value;
});
console.log(newitem);

var newitem=items.filter((value,index)=>{                 
        
        return value.price>200 && value.item.length>3;                    //================ filteration
    });
    // console.log(newitem);
    // var newitem=items.map((value,index)=>{  
    //     retrun value.price>200 && value.item.price>3;
    // });             
    
        console.log("---------------------------------");
        // ***************************************************************string ****************

        var namee='omnamahshivay';
var newnamee=namee.toLowerCase();
console.log(newnamee);

var namee='omnamahshivay';
var nameo=namee.toUpperCase();
console.log(nameo);

var namee='omnamahshivay';
var nameo=namee.charAt(4);
console.log(nameo);

var namee='omnamahshivay';
var nameo=namee.indexOf('y',5);
console.log(nameo);

var namee='omnamahshivay';
var nameo=namee.concat('namo','namo');
console.log(nameo);

var namee='omnamahshivay';
var nameo=namee.includes('y',7);
console.log(nameo);

var namee='omnamahshivay';
var nameo=namee.replace('n','N');
console.log(nameo);

var namee='omnamahshivay';
var nameo=namee.split('n',2);
console.log(nameo);

var namee='omnamahshivay';
var nameo=namee.substr(0,3);
console.log(nameo);

var namee='omnamahshivay';
var nameo=namee.search('y');
console.log(nameo);

var namee='         omnamahshivay     ';
var nameo=namee.trim();
console.log(nameo);