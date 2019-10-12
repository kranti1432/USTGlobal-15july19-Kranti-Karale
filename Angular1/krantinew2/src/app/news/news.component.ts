import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  newsdata:any='';
 newss= [{ place:'News1',
  img:'https://i.ytimg.com/vi/7H9vizC9mQs/maxresdefault.jpg',
  discription:' केंद्र सरकार द्वारा जम्मू कश्मीर में अनुच्छेद 370 खत्म होने के बाद जयपुर व अजमेर सहित कई जगहों पर जश्न का माहौल रहा। कई जगहों पर शहर की सड़कों पर लोगों ने जमकर आतिशबाजी की। एक दूसरे को गुलाल लगाई और मुंह मीठा करवाया। लोगों ने जम्मू कश्मीर से धारा 370 हटाए जाने के फैसले का स्वागत किया। खुशी का माहौल में लोग ढोल ताशे पर जमकर नाचे।'
  },
  { place:'News2',
  img:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAV6bqRR7SHrbe4qgdvtn1mQLP7mOBRNkkdzCy5jerilaG5ODSLg',
  discription:' पिछले चार दिन से महाराष्ट्र के कई जिलों में जारी बारिश ने अब रौद्र रूप दिखाना शुरू कर दिया। मंगलवार से जारी भारी बारिश के चलते कोल्हापुर और सांगली, दोनों शहरों के निचले इलाकों में बाढ़ की स्थिति उत्पन्न हो गई। कोल्हापुर से अब तक 11,432 लोगों और रायगढ़ से 3000 लोगों को सुरक्षित रेस्क्यू किया गया। वहीं, सांगली जिले के 53,000 लोग सुरक्षित स्थानों पर चले गए हैं। नौसेना और सेना राहत और बचाव कार्य में जुटी है।'
  },
  { place:'News3',
  img:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8dhZ7PFd75CSfOwhh_V3y4WvTTdPIL8kOiHR1Jz3jwRV0y2_Y',
  discription:' देश की पूर्व विदेश मंत्री और भाजपा नेता सुषमा स्वराज की 6 अगस्त को दिल का दौरा पड़ने से हुई मौत के बाद पूरा देश जहां शोक में डूबा है'
  },
  { place:'News4',
  img:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnu97GJaQGdlCe2maeX0Xi_96-Nl3A_E62j0CYjJjET8lrZolc',
  discription:'सुब्रत राय की सहारा कंपनी के खिलाफ जिला उपभोक्ता फोरम शिवपुरी ने फैसला सुनाया है। सहारा सोसायटी में पांच सौ रुपए प्रतिमाह रुपए अदा करने के बाद खाता परिपक्व हो जाने पर ब्याज सहित राशि नहीं दी जा रही थी। उपभोक्ता फोरम ने ब्याज सहित रकम लौटाने का आदेश दिया है। प्रकरण में पैरवी एडवोकेट अजय जैन, संजय सिंह व जितेंद्र समाधिया ने की है।'
  },
  { place:'News5',
  img:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgPe1oBWLYmTRT5kADWQGzR3y4jpUTzOPpD9eLIv3mHscee27S',
  discription:'ममता बनर्जी ने अल्पसंख्यक समुदाय के लोगों को संबोधित करते हुए कहा, ‘इतने दिन तक, आप लोगों ने एक महीने तक रमजान किया, रोजा किया। इतनी तकलीफ के साथ अल्लाह को याद किया। आसमान भी आपके साथ में है। आप डरो मत, आप बिखरो मत, आप आगे बढ़ो। आप भी इंसान की इंसानियत के लिए काम करो।’'
  }
];
  constructor() { }
sendnews(news){
  this.newsdata=news;
}
  ngOnInit() {
  }

}
