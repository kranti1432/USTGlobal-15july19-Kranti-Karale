import { Component, OnInit } from '@angular/core';
import{HttpClient} from '@angular/common/http';
import { map } from 'rxjs/operators';
@Component({
  selector: 'app-forget',
  templateUrl: './forget.component.html',
  styleUrls: ['./forget.component.css']
})
export class ForgetComponent implements OnInit {
array:any[]=[];
url='https://api.github.com/users'
  constructor(private http:HttpClient) { 
     http.get<any>('https://api.github.com/users').subscribe(resData=>{
    return this.array=resData;
    console.log(this.array);
  })}

  remove(user){
   return this.http.delete('https://api.github.com/users').subscribe(user=>{
      let index:any=user;
              this.array.slice(index,1);
    })
 
  }
  ngOnInit() {
  }

}