import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';



import { AppComponent } from './app.component';
import { Samplecomponent } from './sample.component';
import { HeaderComponent } from './header/header.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { TwoWaydatabindingComponent } from './two-waydatabinding/two-waydatabinding.component';
import { DirectivesComponent } from './directives/directives.component';
import { IfSwitchComponent } from './if-switch/if-switch.component';
import { AttributeDirectiveComponent } from './attribute-directive/attribute-directive.component';
import { MyDirectiveDirective } from './my-directive.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { BikeComponent } from './bike/bike.component';
import { BikeDetailsComponent } from './bike-details/bike-details.component';
import { ObservablesComponent } from './observables/observables.component';

@NgModule({
  declarations: [
    AppComponent, Samplecomponent, HeaderComponent, DataBindingComponent, TwoWaydatabindingComponent, DirectivesComponent, IfSwitchComponent, AttributeDirectiveComponent, MyDirectiveDirective, ParentComponent, ChildComponent, BikeComponent, BikeDetailsComponent, ObservablesComponent
  ],
  imports: [
    BrowserModule, FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
