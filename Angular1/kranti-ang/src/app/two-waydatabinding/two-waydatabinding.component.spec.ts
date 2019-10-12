import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TwoWaydatabindingComponent } from './two-waydatabinding.component';

describe('TwoWaydatabindingComponent', () => {
  let component: TwoWaydatabindingComponent;
  let fixture: ComponentFixture<TwoWaydatabindingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TwoWaydatabindingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TwoWaydatabindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
