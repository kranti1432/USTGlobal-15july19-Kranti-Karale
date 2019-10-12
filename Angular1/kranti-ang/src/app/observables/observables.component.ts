import { Component, OnInit ,OnDestroy} from '@angular/core';
// import { interval } from 'rxjs';

@Component({
  selector: 'app-observables',
  templateUrl: './observables.component.html',
  styleUrls: ['./observables.component.css']
})
export class ObservablesComponent implements OnInit {                             //,OnDestroy after onInit
  //  mysubscription:any='';
  constructor() { }

  ngOnInit() {
//     this.mysubscription=interval(1000).subscribe(data=>{
//       console.log(data);
//     }, err=>{
// console.log(err);
//     },()=>{
//       console.log('subscription complete');
//     });

// this.userService.printdetails();
  }
ngOnDestroy(){
//  this.mysubscription.unsubscribe();
}
}
