import { Component, OnInit } from '@angular/core';
import{NgForm,FormControl,Validators,FormGroup,FormBuilder} from '@angular/forms';
import{customvalidation} from './customvalidation'
import { from } from 'rxjs';

@Component({
  selector: 'app-practice',
  templateUrl: './practice.component.html',
  styleUrls: ['./practice.component.css']
})
export class PracticeComponent implements OnInit {
 public haserror=false;                                             //STYLE BINDNG **********************************
  public heightlight="blue";
  public kranti={                                               // object for style binding use ngStyle instead [style.color]
    color:"pink",
    fontStyle:'italic'
  };

  public greeting="";                                          //event binding
  public name="";                                          //two-way
  
  public display=true;                                              //ngIf

  public colors=['red','blue','pink'];                                  //ngFor
name1="kranti";                                   //@Input

applicable=false;                       //time interval
img="https://cdn.pixabay.com/photo/2019/09/25/20/52/sun-4504661__340.jpg";


  

  constructor() {
    setInterval(()=>{
      this.applicable=!this.applicable;
    },1000)
   }

  ngOnInit() {
  }
  
Onclick(event){                                                   //event binding
console.log('welcome kranti');
console.log(event);
alert("hii");
//this.greeting="welcome kranti";
this.greeting=event.returnValue;                                  //properties dom object

}

OnData(value){                                                         //template referance variable
  console.log(value);

}
public getData="";                                             //@output

getData1(data){                                           //template driven form
console.log(data)
}

//--------------------------for reactive-------------------
get uname(){
  return this.loginform.get('uname')
}

get pass(){
  return this.loginform.get('pass')
}

loginform=new FormGroup({
  uname:new FormControl('',[Validators.email,Validators.minLength(6),Validators.required]),
  pass:new FormControl('',[Validators.minLength(4),Validators.required])
})
formData(loginform){
  console.log(loginform)
}

}
