function validateForm(){
let formData=document.forms[0];
// console.log(formData);
//console.log(formData.uname.value);
let userName=formData.uname.value;
let passwordData=formData.password.value;
if(userName.length>4 && passwordData.length>5){
    console.log("sucessful");
    formData.uname.style.border="4px solid green";
    formData.password.style.border="4px solid green";
    formData.loginSubmit.disabled=false;
}
else 
{
    formData.uname.style.border='4px solid red';
    formData.password.style.border='4px solid red';
  
    formData.loginSubmit.disabled=true;
}

}
// function validateForm1(){
//     let formData=document.forms[0];
//     let passwordData=formData.password.value;
//     if(passwordData.length>5){
//         console.log("sucessful");
//     formData.password.style.border="4px solid green";

//     }
//     else{
//         formData.password.style.border='4px solid red';
//     }
// }