import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent implements OnInit {
issuccess=true;
classArray=["text-danger","bg-dark", "mt-5"]
  constructor() { }

  ngOnInit() {
  
setTimeout(() => {
  this.issuccess=false;
}, 2000);

  }
}