import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent {
  redcolor=true;
name='raja';
textClasses='bg-success text-black';
padding='50px';
paragraphstyle=true;
columnspan=2;
imgURL = "https://cdn.pixabay.com/photo/2019/07/24/10/22/rose-4359808__340.jpg"
  constructor() { 
    setTimeout(()=>{
      this.redcolor=false;
      this.paragraphstyle=false;
    },5000)
  }

  

}
