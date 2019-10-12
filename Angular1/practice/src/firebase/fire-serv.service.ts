import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import{ map} from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class FireServService {
  
  url="https://kranti2-70fd5.firebaseio.com/";

  constructor(private http:HttpClient ) { }
  sendData(senduser){
    return this.http.post(`${this.url}/asses.json`,senduser);
  }
  getData(){
     return this.http.get(`${this.url}/asses.json`)
     .pipe(map(data=>{
       let array1:any[]=[];
       for(let key in data){
         array1.push({...data[key],id:key})
       }
       return array1;
     }))
  }
  
  }
  

