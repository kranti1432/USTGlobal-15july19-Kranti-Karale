//getelementbyid
let pElement=document.getElementById('demo');
console.log(pElement);

pElement.textContent="new text";

//getelementbyclass name
let divElement=document.getElementsByClassName('kk');
console.log(divElement);

//getelementbytagname
let pElements=document.getElementsByTagName('p');
console.log(pElements);

// pElements.textContent="hii";
let nameElement=document.getElementsByName('helement');
console.log(nameElement);


let demoElement=document.querySelector('#demo');
console.log(demoElement);


let kkclassName=document.querySelectorAll('.kk');
console.log(kkclassName);


let buttonElement=document.createElement('button');
buttonElement.textContent='click me';
console.log(buttonElement);


document.body.appendChild(buttonElement);

let buttonElement1=document.getElementById('buttonEle');
// buttonElement1.className='add';
buttonElement1.className='add add1';


let pElementData=document.getElementById('demo1');
// // pElementData.style.color='blue';
// pElementData.className='blue';
pElementData.classList='blue fonts'

