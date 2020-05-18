import { Component, OnInit } from '@angular/core';
import { MyserviceService, Products } from '../myservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-prooduct',
  templateUrl: './add-prooduct.component.html',
  styleUrls: ['./add-prooduct.component.css']
})
export class AddProoductComponent implements OnInit {
  message: string;

  constructor(private myservice: MyserviceService,private router: Router) { }

  ngOnInit(): void {
  }
  onSubmit(addpro:Products):any{
    console.log(addpro);
     this.myservice.addPro(addpro).subscribe(data => {
      this.message=data});
  }
}
