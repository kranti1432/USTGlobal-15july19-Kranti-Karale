console.log("******************* primitive data types*******************");

           //string
var string="kranti";
console.log("string is"+string);      
console.log("type of string="+typeof string)
//number  

var age=23;
console.log("age is "+age);
console.log("type of number="+typeof age)
//boolean
var condition=true;
console.log("condition is "+condition);
console.log("type of boolean="+typeof condition)
//null
var kranti=null;
console.log("null is "+kranti);
console.log("type of null="+typeof kranti)
//undefined
var kk;
console.log("var is "+kk);
console.log("type of undefined="+typeof kk)

var hobbies=['gaming','dancing'];
console.log("type of array= "+typeof hobbies);
var value=Array.isArray(hobbies);
console.log("is this array ="+value);

console.log("******************* referance data types*******************");

var person={
    name:"kranti",
    age:23,
    getname:function() {
        return this.name;
    },
    getage:function(){
        return this.age;
    }
};
console.log(this.age)
console.log("name = "+person.name);
var name1=person.getname();
console.log("getname()"+name1);
var age=person.getage();
console.log(age);


var num1=10;
var name="kranti";
var num2='10';
if(num1===num2){
    console.log("equals");
}
else{
    console.log("not equals");
}
var equals=(num1===num2)?"true":"false";
console.log(equals);

console.log("******************complex arra************************")

//-----------------------------------------complex array-------------------------
 var library=[
     {author:"kk",title:"kk1",price:100},
 {author:"kkkk",title:"kkkk1",price:300}];
 for(var i=0;i<library.length;i++){
console.log(library[i]);
console.log(library[i].author);
console.log(library[i].title);
console.log(library[i].price);
 }
//______________________________for of and for in and for each________________________________
console.log("**************************************Array method*****************************");

var person1={
    name:'kk',
    age:22
};
for(var index in person1)
{
    console.log("for in index for object="+person1 [index])
}
var person2=['kk','kkk','kkkkkk']
for(var index in person2){                           //for of if [] it gives array with length ,value etc, without [] itgives kk,kkk
    console.log("for of index="+person2 [index]);
}
for(var value of person2){                             // for in gives 0,1,2
    console.log("for in value="+value)
}

var array1=['dancing','singing','playing','reading'];
array1.forEach(function(index,value){
    console.log(index,value)
})



//-----------------------------------------------------------------------------------
var name2=['ka','ks','dk'];
name2[3]='kks';                    //add kks at 3rd index
name2['hobbies']='paw';      //it add as hobbies:"paw"
console.log(name2)
for(var value in name2){
    console.log("for in for name2="+value);
}
for(var value of name2){
    console.log("for of for name2 ="+value)
}

//_____________________________________________FUNCTIONS_________________________________
console.log("*********************************functions*******************")
//_______________________________________named function_________________________________

function getsum(n1,n2){
    var n2=n1+n2;
    return n2;
}
var result=getsum(3,6);                           //we can write above the function
console.log("named function getsum(n1,n2)= "+result);


//___________________________________function expression________________________

var sumdata=function (n3,n4){
    var n3=n3+n4;
    return n3;
}
var value1=sumdata(33,6);
console.log("function expression = "+value1)

//___________________________________________________fatArrow function______________________

var fataar=(n4,n6)=>{               //function keyword not required
 n6=n4*n6;
return n6;
}
var value2=fataar(3,4);
console.log("fat arrow function = "+value2)

//_________________________________________________immidiate invoke fun exp(IIFE)-----------ananymous function__________

// (function(n5 ,n7){
//     var n8=n5-n7;
//     console.log("ananymous function = "+n8)                   //error
// }(90,10));


// _____________________________________Array method/properties__________________________________

var names=['kranti','deepak','shama','jyoti','aarti'];
names.push('mukta','manchak');            //add item to last
console.log("after push "+names)
names.pop();                            //remove from last
console.log("after pop "+names)
names.shift();                          //remove from first
console.log("after shift "+names)
names.unshift('kkkkk');
console.log("after unshift "+names)       //add from first
names.includes('jjj')
//console.log("include= "+n)      //can store true or false in n then print
names.splice(2,2,'ll');                   //modify orignal array
console.log("after splice= "+names)           //4 argumnet left
var nm=names.slice(0,5)                       //gives another array
console.log("after slice= "+nm) 
var k=names.join('$');               //add $ after each element
console.log("after join $ = "+k) 
var s=names.indexOf('aarti');
console.log("after splice= "+s) 
//____________________________________________map modify each and every element)__________________________
var numbers=[10,20,30,];
var newnum=numbers.map((value,index)=>{
     var value=value+10;
    return value ;
})
console.log("before map= "+numbers)
console.log("after map= "+newnum)


//__________________________________________filter= filter out according to condition____________________________________________
var num3=numbers.filter((val,index)=>{
    return val>20;
})
console.log("after filter= "+num3)
//_______________________________________________aaray object_____________________________

var items=[{name:'kk',price:300},{name:'ss',price:400},{name:'ssdd',price:500},{name:'sjshds',price:600},];

var newitems=items.map((value,index)=>{
   value.price=value.price*10;
    return value;
});
//console.log("after map array object= "+newitems)     //it gives only object array
console.log(newitems)

var newnew=items.filter((value,index)=>{
    return value.price>100;
});
//console.log("after filter array object= "+newnew) //it gives only object array
console.log(newnew)


console.log("**********************************JSON**********************************")

var forjson={
    name:'dinga',
    age:23,
    hobbies:['dancing','playing','cooking']
};
console.log(`my name is ${forjson.name}`);
//console.log("my name is "+this.forjson.name)
console.log(forjson);         //detailed object
let jsonObject=JSON.stringify(forjson)       //string object
console.log(jsonObject);   
let jObject=JSON.parse(jsonObject)
console.log(jObject)   

console.log("**************************promises*******************************************")

let prom=new Promise(function(reject,resolve){
    if(10==11){
        reject('success')
    }else{
        resolve('failed')
    }
});
prom.then((data)=>{
    console.log("then block: "+data)
    //return data;
}).catch((error)=>{
console.log("catch block: "+error)
});

console.log("********************************WINDOWS METHOD*****************************")
window.alert("hii kranti welcome")



