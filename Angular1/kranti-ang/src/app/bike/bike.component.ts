import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {
  bikedata:any='';
bikes=[
  {
    brand:'KTM',
    img:'data:image/jpeg;base64,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',
    discription:'KTM is among the renowned bike manufacturers in the world and have it’s headquarter based in Austria. KTM are renowned for their off-road, endure and street bikes. The slogan for KTM is “Ready to Race” and this character is reflected well in its range of motorcycles.'
  },
  {
    brand:'ROYAL Enfield',
    img:'https://media.zigcdn.com/media/model/2016/Feb/royalenfield_classic350_320x160.jpg',
    discription:'Royal Enfield, as it is known today, is an Indian motorcycle manufacturing company based in Chennai. Known for its rich heritage and history, Royal Enfield is the oldest motorcycle brand to be in continuous production, with the first motorcycle manufactured in 1901. '
  },
  {
    brand:'Shine',
    img:'https://media.zigcdn.com/media/model/2018/Feb/shine-sp-right-side-view_320x160.jpg',
    discription:'Honda Offers 2 Shine models in India. Honda CB Shine is the lowest priced model at Rs. 55,858 (Ex-Showroom) and Honda CB Shine SP is the highest priced model at Rs. 60,710 (Ex-Showroom). The Shines refined and fuel efficient engine stands as a true testimony for the fact that the Shine is one of Indias highest selling 125 cc motorcycles. The bike gives a commendable mileage of around 55- 60 kmpl and the only drawback was that the bike felt a little out of breath with the four speed gearbox.'
  },
  {
    brand:'Honda',
    img:'https://media.zigcdn.com/media/model/2016/Feb/honda_shine_320x160.jpg',
    discription:'Honda Motorcycle and Scooter India (HMSI) is an Indian two-wheeler arm of the Japanese auto major Honda. The brand entered the country back in 1999 and is well-known for its popular Activa scooter range. Apart from its bread-and-butter models like the CB Shine and CB Unicorn 150, the company also sells'
  },
  {
    brand:'TVs',
    img:'https://media.zigcdn.com/media/model/2018/May/apache-rtr160-full-right-side-view_320x160.jpg',
    discription:'TVS Motor Company is a two- and three-wheeler manufacturer headquartered in Hosur, Karnataka. The company has come a long way from starting off with the humble TVS XL 100 to gracing the sub-400cc segment with the Apache RR 310. Its rich history with racing and its partnership with the premium German	marque BMW has helped the company grow considerably in numerous markets abroad.'
  },
  {
    brand:'Yamaha',
    img:'https://media.zigcdn.com/media/model/2018/Feb/yzf-r15-v3-right-side-view_320x160.jpg',
    discription:''
  },
  {
    brand:'Pulser',
    img:'https://media.zigcdn.com/media/model/2018/Jan/pulsar-220f-full-right-side-view_600x300.jpg',
    discription:'Bajaj Offers 7 Pulsar models in India. Bajaj Pulsar 135 LS is the lowest priced model at Rs. 60,434 (Ex-Showroom) and Bajaj Pulsar RS200 is the highest priced model at Rs. 1.22 lakh (Ex-Showroom). The Pulsar was one of the first affordable performance bikes in the country. The Pulsar brand received various updates and additions to the portfolio to make it even more accessible to enthusiasts.'
  },
  {
    brand:'Pleasure',
    img:'https://media.zigcdn.com/media/model/2019/May/pleasure-plus-right-side-view_600x300.jpg',
    discription:'Hero MotoCorp has launched the 2019 Pleasure Plus. It has been priced at Rs 47,400 for the standard variant and Rs 49,300 for the cast wheel variant. This makes it Rs 2,200 dearer than the older generation model. Speaking of which, compared to the older model, the Pleasure Plus gets a subtle redesign and a larger motor, which is also seen on the Duet and Maestro Edge'
  },
  {
    brand:'Activa',
    img:'https://media.zigcdn.com/media/model/2016/Feb/honda_activa125_320x160.jpg',
    discription:'The Honda Activa 125 has always attracted customers who want a little more power in the tried and trusted design of the Honda Activa. The scooter gets a host of features such as LED pilot lamps, alloy wheels and a mobile charging socket. Powering the Activa 125 is 124.9cc single-cylinder engine, which produces 8.6PS of power at 6500rpm and 10.54Nm of torque at 5000rpm. Braking duties are still handled by the same drum units on both sides.'
  },
  {
    brand:'KTM Duke',
    img:'https://imgd.aeplcdn.com/1280x720/bw/models/ktm-duke-200.jpg?20190103151915&q=80',
    discription:'Ever since KTM entered the India two-wheeler segment, it has completely changed the rules of the performance game. One of the USPs of the Austrian brand is that it has always offered feature-rich motorcycles and the European styling is cherry on the cake. The 200 Duke was the first naked motorcycle from KTM to be launched in India. For customers who were looking for an aggressive motorcycle, the 200 Duke was a perfect choice. Since then, KTM has added a number of motorcycles to the Duke family. And now, it consists of four motorcycles: 125 Duke, 200 Duke, 250 Duke and the 390 Duke.'
  }
];
  constructor() { }
sendbike(bike){
  this.bikedata=bike;
}
  ngOnInit() {
  }

}
