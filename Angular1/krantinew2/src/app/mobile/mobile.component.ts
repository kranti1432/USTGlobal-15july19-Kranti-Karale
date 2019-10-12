import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {
  mobiledata:any='';
  mobiles= [{ name:'Redmi MI',
  img:'https://image.shutterstock.com/image-photo/man-glueing-protective-glass-on-260nw-1235257978.jpg',
  discription:'Redmi is a China-based smartphone and a sub-brand owned by the Chinese electronics company Xiaomi. It was introduced as a budget smartphone line manufactured by Xiaomi, that was first announced in July 2013. It became a sub-brand, separated from Xiaomi, on 10 January 2019.'
  },
  { name:'Nokia',
  img:'https://cdn.pixabay.com/photo/2013/07/12/16/01/smartphone-150753__340.png',
  discription:'HMD Global is a mobile phone company based at the same building as Nokias headquarters in Espoo, Finland. The Nokia brand has been licensed by former Nokia employees who founded HMD Global and introduced Nokia-branded Android-based devices to the market in 2017'
  },
  { name:'Apple',
  img:'https://cdn.pixabay.com/photo/2014/09/23/21/23/iphone-6-458159__340.jpg',
  discription:'The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface. The iPhone runs the iOS operating system (OS), and as of 2017, there were 2.2 million apps available for it through the Apple App Store, according to Statista.'
  },
  { name:'Oppo',
  img:'https://image.shutterstock.com/image-vector/applestyle-smartphone-gold-color-isolated-260nw-699853585.jpg',
  discription:'Guangdong OPPO Mobile Telecommunications Corp., Ltd, commonly referred to as Oppo, is a Chinese consumer electronics and mobile communications company headquartered in Dongguan, Guangdong, in China, and known for its smartphones, Blu-ray players and other electronic devices that are made in China.'
  },
  { name:'Samsung',
  img:'https://cdn.pixabay.com/photo/2016/06/09/09/43/smartphone-1445448__340.jpg',
  discription:'50% of Samsung Mobile Phones Made in VietnamAt present, Samsung Electronics is running six mobile phone manufacturing facilities in the six countries of Vietnam, China, India, Brazil, Indonesia, and Korea. Thetwo plants in Vietnam have a combined annual production capacity of 240 million units.'
  }
];
  constructor() { }
senddata(data){
  this.mobiledata=data;
}
  ngOnInit() {
  }

}
