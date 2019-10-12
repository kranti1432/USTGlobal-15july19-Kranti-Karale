import { Component, OnInit } from '@angular/core';
import{FormGroup,FormControl,Validators, NgForm} from '@angular/forms';
import { from } from 'rxjs';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }
  

  get name(){
    return this.registerForm.get('name');
  }
  get email(){
    return this.registerForm.get('email');
  }
  get phono(){
    return this.registerForm.get('phono');
  }

registerForm=new FormGroup({
  name : new FormControl('',[Validators.minLength(3),Validators.required]),
  email :new FormControl('',[Validators.email,Validators.minLength(5),Validators.required]),
  phono: new FormControl('', [Validators.minLength(10),Validators.required])
})
  ngOnInit() {
  }
printForm(registerForm:NgForm){
  console.log(registerForm.value);
  registerForm.reset();
}
}
