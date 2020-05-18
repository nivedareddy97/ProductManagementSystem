import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddProoductComponent } from './add-prooduct.component';

describe('AddProoductComponent', () => {
  let component: AddProoductComponent;
  let fixture: ComponentFixture<AddProoductComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddProoductComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddProoductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
