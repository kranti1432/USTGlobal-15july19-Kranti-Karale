import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {
cardata:any;
cars=[{
  brand:'audi',
  img:'data:image/jpeg;base64,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',
  discription:'weirupowfuw;ofjklfjq;oeirioq3uetowiejfe;kojfkdflnkdfjvnsdkmfnwkljerqwpoeuioehgjkgvdfjv'
},
{
  brand:'brezza',
  img:'data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxMSEhUSExMTExUXFRUYFRYVGBYYFhUWFRUWFhcVFRUYHSggGBolIBUXIjEhJSkrLi4wFx8zODMvNygvLisBCgoKDg0OFQ8QFysdFR0rKy0tKysrKy0tKy0tLS0tKy0rKy4rLTctLTctKy0yKysrLS0rLSsrKy02LS0rNzctN//AABEIAKgBKwMBIgACEQEDEQH/xAAcAAEAAgMBAQEAAAAAAAAAAAAABQYDBAcCAQj/xABEEAABAwEFBAcFBAcHBQAAAAABAAIDEQQFEiExBkFRkRMiMmFxgaEHQlKxwSNiktEUcoKi0uHwFSQzQ1Sy8RZEU3OD/8QAFwEBAQEBAAAAAAAAAAAAAAAAAAECA//EABwRAQEBAAMBAQEAAAAAAAAAAAARAQISIUExA//aAAwDAQACEQMRAD8A7iiIgIiICIiAiIgIiICIiAiIgIvhK+oCIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgIi8SytaKuIaOJIA5lB7RQ1o2psjNZmE8GmvrotJ+2kHu5+Lmj6lBZkVW/6yadGA/t1+i8na07oxzJQWtFTpdqpCKANb3gZ+tQtN99zn/uJB4Ni/gQX1eS3hl8lQxfE/wDqZPwxfwL0L5tH+od+CL+FEq9B3HL+ty9Ki/25aP8AzA+LGfRfW7RWgf5kbu4s/Iqwq8oqXFtbLwhdx7TSPEHRbkW1496I/suB+aQq0IoOz7UwO1JZ4jIeJ0UxDM14xNIcOIUVkREQEREBERAREQEREBERAREQEREBERAREQEREBcWv21vfaZqzulb0jgw4iW4a5Bo0puy4K7e0HaLomfo0R+0eOuR7jDu7nO+XkuYyPcC2OMYpXdkbmj4nd2vJEbLrXZ4zSQtrw38gs0d6WHeWcnKkXiwdK4B5koaF5951OsR92tadysOz4hDcL4WvfqXSyBjQNwaM/zVqLBHbLAd7f3wtqM2E6SU8JHD5qIc6wCvSMgbl/lySPNeGTQPVVu9bXC94EEfRtBAxYiXOr3VIaEzSuiMgsx7NqcP/rGfQhbUN2F3YtLH+LGn1Y4Lk8s5EYc2oJLt50qF9sN6Amkrnj7zTXmCCg6y64pu53ew5/gkyP4gsLromwmjm1HEEeThq3kQqZZrQ9orBacf3c2/vNyr4hSdnvuSQAOkkqD8bgQRuOfp5hBOw3XaHdoBn9a5GhHJZv7Mcw/ayRAd5w8wUuq7mTMDnSzPIyc0vNAfPcvNsgjifhYwCgzOpqc1UrG6yRh2LGDlTq43Zd4aCDqc1q2uQNBLWSvp8Lc+RIW9Fa9chln6gfVbdnkBNa03IlUl16zvcWxWZ4dSv2rmx078Oqy2O+LbZ5A58v6O34mtL4zwDgK+q6LJc8ZAJGIga+PCigbyu0srliaePyKzu6VN7NbdxzYY58Mchya8V6KQ9xObD3FXJcMtlz0q6GnfGey79X4T6eCndlNtX2ekU2J8QyNamWH+NnqApWs5OrIsFktkcrGyRva9juy4HI/z7lnVaEREBERAREQEREBERAREQEREBERAUXtHfcdjgdK8gkA4Gb3upk0D5ncF42rvc2SyyTtaHObhDQa0Jc4NFabhWvkuF3xPabdLjtEhc4AluHJoFeyGjTXXu3qXLG8/ny3jvLPzGK27SSSPfI9rXSPJJcSaV/V4DSldy0bTeDmhxY+rpG0eRUONdW9w0FOAW1LdUoAwOxH4XAOA8C5eHXZk0OawSVJIq5tBoDvHFVjc9iMs0O/h8+PzXt0Y/wCVIiwhoqQ5oO+odmN2RFF4/QyTRpaTuFSP9woOaIj8HcOSDJzfGvLNSct0yt1jeO+hI5tqFHWmIg0pu+dVUfJQehb3A+r1ptGSkIhVlOH8X81ifAoNJriDUGh7sit2wXq9rxjJc00B4jgQeIW3YLilnIbAwyONagAdXvJOQHeVPD2X2wipMLT8JcSfMhtAgkbivcxuHWyNNNCDp5K1SxiTrVrXOq5y26LTZKxzsLSM2HItc064XDIitO8VCtGzl7e445HQ/wBeq0m4kXRlgcKA4hTPdmDUd+QWtFOW5FTMzarRtFl3oyl7uvtmEBxNRlot59ojeO0PNU4Wd1eC24MQ3hTcG3brvA60ZB4ivy/JQVvsDZM+y8aOGo7jxCmHw4hu5qsX7cUrT0kMpjO8AmjvLisNdfuNG7rViPVzLXkPhqQHO0dh+F+Wo4BdW9nl6Omge173OfHIW0f/AIjWUBbjGtcyK9y4A60iKd0rpSXE9dtM3GmdQNCp6zbVyNey0RuLXjJrzSr272vb7zfHmtLj9Foqjsxt5BaWgSVhlp1qgmM94foPA+qtkcgcKtII4g1HMI09IiICIiAiIgIiICIiAiIgIiIK9t/ZhJYJxvADh4tcCuRWBmEVOp1+g/riuzbXj+5Wj/1lcXnt0cVAauNBk3M6b1J7Wu+9evxIMR7CcmgOduBcGnyJ0WlBfcJ1xMO7EMuYqpGjXt3OafMFVzYpLIDTG2rhTV2IjuJBoVidYGVLgMzy8KD/AJW2G0yAp4IEVgZaJ4mhrC0tG527PQE7lINtodXpI2vBpu04jOtea1yF4du8foUN2txlksTxRzDGe4EDxoCV5dslZpDhjmBdStKgmngtMx1IrLG0EZtka5pP6pzrpw3L0EG5BZJrtDsBkIfQ4mMDgKVydVrqbjzWvPtzKBlaC3xiYfTogs1nt8jOzI8d1ajkclvM2hlHabHJ4ih5jL0VRRtpdqZp2taZ8eFwcCYwwAgEe62pqCvVltNMJJArTQ1FaV18vl3qXvyMWqVr3sa1rRTCPWuWasl22CwuaGkQ1A3gNNT3kD+igw3RfLSzDJqN/wBFtPveIcT4D81KQbM2XUM5PfT5o/Z2DHQMdQtqKOO456+IVZiElvBruyw+ZooC1368OwRx4jxBqPLefIFXo7Ow6DEPGh+YXg3DTsvb4FtPkUIoE1vvB3+HFStaF2FoHfmankF9iu23PFZrQ0cQG4vXJXh9zSjQNd4EfI0WrNZXt7THDvINOakWqfJshE92OV7nuy0o0ZccjVSFnuezxkFsTSRvdVx/e013KaEdeC+ush4FIVol/kvdntj4zVj3MP3TTnxWc2F3wnkV5dd0nwO5IqWsW2k7MpAyUfhdzGXorFd211nlyJMbuDvoQqG67JPgK1pbE8e6VFdghma8Va4OHEEEeiyLikd5SRHE17mke8D6HiF1HZO9XWiBrn9sAYt3aAINN38kVNIiICIiAiIgIiICIiCt+0CYtsb6b3MB8MVT8l+c75vIsdQULnZknOlV+j9vrMZLDMBq0Bw/ZIJ9Kr8y33AXWjCNTSnJBri/pBkQ1w4EUryU3cF+0dVlQdXRE1DhvLTxXq77iLgRHHipkXGgBdwqcq9y07wup0buyY5Aat4H+uKDpFmmbI0PbmHCo/JeyxQGxdtxExnRwxtHwu0e3mD+Eq2vjA1IRlo4F4kbp4/QrfbhO8I+LLl8wg0C1fCFJOs6xusqDQovi3nWVYnWcoNVZbNICTUDX5L6Y1iDaAkkAAuJJ0AqcygsN2wxO7L3xu+66il2xyCn2gkA0xjMeDhQgrmh2ma0/Zse+m/QHw386KRse3WHtxPA4q0jocUj9559YeufqswlI1A8jT0dpzVcuja2zy0AfQ8HZKedamkKoyPtTBSrg0nQOyJ8OPkvgtrR7/z/ACVN2qlxtLY3mN/uyDceB+78vnFWW8pSwMxPa5rZKhz3F+NxBBDsX2jNQ12gqK5q56OjPdC/thh76Z86LzH0LOxI0dxfUciclzWxi2Ps8mOR7XNY5w+0e15wguAGeZ3ZVqoR17zy1heZI34S1hY+QEuDs3PJca6HTLuCbg7LNaWNFXSMaOOIU5qCt+1tjjr/AHhjjwYcR5NquVXPbHWlnQzuLxUlpdQua8ZEhxFc94ruVtsOzVijGKXHIBmMWGJoJ1JcHEn0WVfLx9okdcMMUkhJoK0aCfU+ijL6vG3k0LQ1ruyWAv3CtfvDhRLztN1NY6IFxJOXROdI5pHwuFGj6pHtBI9jGwWZ8ppRxn7NBTDXUv3mhOR3qK17ru6V1ojfU2jA4PrV2Bjg4OaC8jDiGQ6taZ710HZK9nMtohNA1wcwgaVGJ7T41JHmqb+h3hN/jWgQNp2Iup5Ajr+qkejlhkZICS4FpDnClSymbvGgSjtiLxC+rQeIB5he0UREQEREBERAREQYbZB0kb4zo5rm/iBH1X5gviyOitb2vBa9gII4Hqg/VfqVUD2v3HG+xvtLY2dNGWVkAGMx4sJaXakdYGncgpUcMsboo2srAyOjyCOrMS1wc4Vrm6gH6yh7fdjw6cPla5j3F1nbUucXanD8DciCNKgHxlmmVz4J2xxmB7Os/D12uAbVpIOdS4AD8l82iMzBHLDQF0rWyAMaS2NzsOHFQ5Yw4Iyqdy2oxyB2pa7EM9Q7quHy/ErdHfkLu02Rh4ijh+foqS+jZTnRuJza5aHQ5+AUpZrLI9wYwh5OgI89QQEVbIJYn9iVhPA1aeRzWeWB4BpXQ6HuVWnue0s7UDiPunEtdlvkjyDpY+44qeYzCguzbU8a5+Kzstw3t5Kq2PaeTeY5Rv0B5jL0UpBf0Du2xzDxGY9M/RBOxzMO/mshjBUfZ3QSdiRpPDQ8jmtgWRw7JRH2WBVXaubCGxg0Bq9/gCaDw1PkFb2POjhQrne3c/Wlpwa0eYqfqqK5ar1I06o0GlfE1Wiy+5WntA+IH0oVis8Dp3AaBo6x4ZnTv/JTkFhiaKBrT3mpJ80Vq2e/muP2jMJ+Jvz4/NWy6donR4WSPxRu7EldCdx7lV7Vd7HaDCeY/kta7jgcYX9h+g+F27+uKC83nb8yNT6BaAt8jRkQRrhe1r2fgeCAfBalkxOjoc3MOB3ePcPmAR+ytroeqtI3LNfp3wwHwa9v+x4Wbp4HkF1liqMwQ6UEGtairzTPNZrmwwxBzomEuNGufU8mj5khbks7SCXPjbTcA0cqV+am6RoRxWYUpZsFDiBZI4UPGhBqt+fZqyzOMshfIQaOa49RhAphDjQZLTsMolIDY3AkimKgoddAq7tiJJZ+gYfs4qtaC6gc4f4j8O84iRXgAoLM+23ZZsvscQ3NrI790AeqjrX7Qom5QwuPe4iMfhZmea0bp2AdI1j5Z2sa8MIDGucaSGjMRyDanLmp6wbL2OM0bBJaHgNPXdlQ78LDTyKKqU+1dsnNGHowdRC3CfN/a9VaNng99n6KR5xieMEVqT1XOzPiAa9y3LzvCKKF8TnQxkuZhiiDcTQHYjiDKlpoB2itTZX+8PqwEAzxkDuYJGkmn649EHemCgA7l6REUREQEREBERAREQfCqhtxbCYZI8NWuaQfAq4LVtVgZIKOAKD8/wBz3oIQYJiQ0EuYc6A0PaA3VofELPZLzFns7oxMJXVk6MtzGGXN2PvBzGevmul377OLPPUtrG7cR+Sp9r9k9pFejmjdwxBw9ASiOZ2rgsthfJFR7HOY7cRlSqvEHswtTSTIY3ndTFl5HVfLVsNMNc1NVWJdorS/DjkLsNaHsnPvbRSV17XFhpO0zMPGjnDvBd8ivFr2Xkb7pURPdMjdygsV43zYJMOGBprXFirGRpShAI4r1YLDZJ3YY5JIXHsguDmHuFN/cVT32Rw1BWFzCOKovVt2ZljFemhIrSshDc9wByFV7sslus9D0b3s4Nd0jSO6mnNUf+0pwMPSPIG5xxDk6q2rBtFNC4ObQHuqAe5w0I8kSOmWXaOB2TnGM7w8EU8XaeqoO2zgS51WkOfkRmCCw0zC3rdtZDaAMcb4pG6ObRzTxadDTyNFCX9O2SEOboHDXdk780GLZyxF/Rxt7Uj9eA0qfACqulivGDpX2eCjehMRc7V0jS/DIXE6gYm+GSrWx0oE0JJA6sgBOgcGOoac1YonQPlc4usbpqUMsRc15bWjmOiNRmDTFU7tFTUbbpDLaH2d7Gl5r0b2DrClerMBqDTXIio3Kr3pDTPQt5ih+YXQbznETnOMscZqelkbHWUsxExsa4Cm8jEc/pVdqImiSralr2g9bU+6Se8lpPmgzXBIHyt4Sx0P6zRiHn1SP2lY2WPE4M4n03lUW4rXgDTvikDvKtfzXUWxwvDy2VnWaQCHNqAR6FVNVOe3Gad4YYhGwYWY2lwwMyqAK1JJO5QcG08gJAEIdXLDDHpxqQVdpdlbv+O0N8JY8gRSlaaLS/6buyPSR4P3povoKqDNct8S/o8tstMmJsYwwg0ADzkKYQDqQFSn3mxshe4lxIFNK0OZJqdST6Kw3/hmZDYYHtMQdiOEYiTmBidkHUqTyXtmx1mZ1pZHvpxOBuXh+aio07fytZHHDFG0sYxgc7E9zuj7Jw1DagknQ0qsLReVryJkDOB+yYB+o0D5Kb/tW77NlGIydPs24z5kfUraufaNtpkDSRZ497nAueRwaxuQ8SfJKqOuzYlrSDNLU/CyoHhU5rpns72SdCXTuoInFroIwQcqZSOpvIoRzU9cpsGGkeAkihL+s48ak8eGisUdKClKbqaU7kHpERUEREBERAREQEREBERAREQfCF4fA06gLIiDQmuqN3uhRdq2Vid7oVjRBQbbsJGdAq/b/Z+dwXXl5LAdykHALdsNINGnyUFa9mJG+6eS/S0ljYdQFo2i443bgkH5klup7dxWIxuAIINDqNxX6Itux8TvdCr1v2BYdBRBxqyT9G5rgKYXA0+Y881ZLHdkcbm2iNxLpcmCmTGtOKR58mild9FM3rsE8A0BPgFT4rVNZHOikbVpDhQ1GTsiWnduVRYbFborZZpI3uIj6QRuLj1254on4uFatPiOBVbvuHoS2AuDjG2jiOJe59OTgvcF7xQhxhhDS9tHVJLTwq3fRQs9oLiXONScyTqSgQzYHVArXIhbL7QOC0GHOqyVRWx+kdwT9JPBYQvYBKDNDekkZJY7CSKVoKgdx3LBLO+Q1ke55+8SeVdFmZYnO0BUnYtnZH+6UESyNSNhhdXIFW269i3GlQrldGxjW0q1QVjZ+zTEg5hdY2fDwwBxK+WC42s3KYiiDdEgyIiKgiIgIiICIiAiIgIiICIiAiIgIiICIiAiIgLyWBekQYXWZp3KMvTZmzWgYZYmPH3gDyOoUyiDnVt9kFgfXCJI/wBV7j6OqoK0exOOtWzzeeA/QLsSIOJu9jZGkrj4gL632SEe+u10XyiDjsPsp4uPJSNn9mEbeJXUaJRBRbHsHE3cp2ybNRM3KeRBpw3exugWy2MBe0QEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERAREQEREBERB/9k=',
  discription:'opri3po[it3o4tupiohgejkr3po43tui3roruehjwiowhfjkldjkju23riojioejdfweklfnkldjf;oqwierupoiuerow;jdl;wiueopi2i  wd;oj'
},
{
  brand:'bmw',
  img:'data:image/jpeg;base64,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',
  discription:'outpioeutieutiuweiorupoiwpka;ldma,.m,mdkljdiowuriowuiouoqwijosjklasm,cm,asdklwjwjkldm,asm,msam,sjdklw'
}]
  constructor() { 
    
  }
  sendcar(car){
    this.cardata=car;
  }
  ngOnInit() {
  }

}
