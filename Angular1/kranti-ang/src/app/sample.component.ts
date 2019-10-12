import { Component } from "@angular/core";
import { Template } from '@angular/compiler/src/render3/r3_ast';

@Component({
    selector:'app-sample',
    template:`<h1>Sample is working</h1>`,           // we can create html and give path by templateUrl
    styles:[`h1{background:red; color:white}`]       // same for css only urls
})
export class Samplecomponent{

}