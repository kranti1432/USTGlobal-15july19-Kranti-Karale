import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class Head2serivceService {
  
  url='https://kranti2-70fd5.firebaseio.com/';

  constructor(private http:HttpClient) { }
  sendData(data){
return this.http.post(`${this.url}/product.json`,data);
}
  getData(){
return this.http.get(`${this.url}/product.json`).pipe(map(data=>{
let newArray:any[]=[];
for (let key in data){
  newArray.push({...data[key], id:key });
}
return newArray;
    }))
  }
}
