import { Directive, ElementRef, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appMyDirective]'
})
export class MyDirectiveDirective {

  constructor(private elememtRef:ElementRef) { 
    elememtRef.nativeElement.style.background='pink';
    elememtRef.nativeElement.style.color='white';
    elememtRef.nativeElement.style.padding='10px';
    elememtRef.nativeElement.style.fontSize='10px';
    elememtRef.nativeElement.style.fontFamily='cursive';
    // elememtRef.nativeElement.style.transform='scale(1.3)';
  }

@HostBinding ('style.background') background:string;

@HostListener('mouseenter')
 mouseEnter(){

this.background='skyblue';


// this.elememtRef.nativeElement.style.background='red';
// this.elememtRef.nativeElement.style.color='white';
// this.elememtRef.nativeElement.style.fontSize='40px';



}
@HostListener('mouseleave')
 mouseleave(){

  this.background='purple';

// this.elememtRef.nativeElement.style.background='hotpink';
// this.elememtRef.nativeElement.style.color='black';
// this.elememtRef.nativeElement.style.fontFamily='cursive';
// this.elememtRef.nativeElement.style.fontSize='20px';

}
}
