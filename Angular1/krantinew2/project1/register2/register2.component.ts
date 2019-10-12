import { Component, OnInit } from '@angular/core';
import{FormGroup,FormControl,Validators,NgForm} from '@angular/forms';

@Component({
  selector: 'app-register2',
  templateUrl: './register2.component.html',
  styleUrls: ['./register2.component.css']
})
export class Register2Component implements OnInit {

  constructor() { }

  ngOnInit() {
  }



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