import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl,Validators,} from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }
get username(){
  return this.login.get('username')
}

get password(){
  return this.login.get('password')
}
login=new FormGroup({
username: new FormControl(' ',[Validators.maxLength(6),Validators.email,Validators.required]),
password: new FormControl(' ',[Validators.maxLength(6) ,Validators.required]),

})
sendData(login){
  console.log(login)
}
  ngOnInit() {
  }

}
