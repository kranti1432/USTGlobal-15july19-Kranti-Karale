import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
  condition=false;
users=[{
  name:'krantu',
  id:111,
  city:'pune'
},
{
  name:'ashwini',
  id:222,
  city:'aurangabad'
},
{
  name:'rosh',
  id:333,
  city:'nasik'
},
{
  name:'raj',
  id:444,
  city:'mumbai'
},
{
  name:'sagar',
  id:555,
  city:'banglore'
}




]
  constructor() { }
  removeUser(user1){
let index=this.users.indexOf(user1);
this.users.splice(index,1);
this.condition=true;
  }

  ngOnInit() {
  }

}
