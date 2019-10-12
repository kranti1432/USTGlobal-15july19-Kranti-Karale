function sayHello(){
    alert("hello!!");
}
let buttonElement=document.getElementById("clickbutton")
    buttonElement.onclick=function()
    {
        alert('hello world!');
    }
    function createpElement(){
let pElementData=document.createElement('p');
pElementData.textContent='This is p';
document.body.appendChild(pElementData);
}
let alertElement=document.getElementById('alerthi');
alertElement.addEventListener('click', function(){
    alert('good evening');
});

function showText(){
let textElement=document.getElementById("showData");
console.log(textElement.value);
document.createElement('h1');
hElement.textContent=textElement.value;
document.body.appendChild(h1Element);
}