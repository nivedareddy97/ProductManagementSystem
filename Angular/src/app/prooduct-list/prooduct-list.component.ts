import { Component, OnInit } from '@angular/core';
import { Products, MyserviceService } from '../myservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-prooduct-list',
  templateUrl: './prooduct-list.component.html',
  styleUrls: ['./prooduct-list.component.css']
})
export class ProoductListComponent implements OnInit {
  message: string;
  products: Products[];
  constructor(private myservice: MyserviceService, public router: Router) { }

  ngOnInit(): any { 
    this.myservice.getProducts().subscribe(
    response => this.handleSuccessfulResponse(response),
  );
  }
  handleSuccessfulResponse(response) {
    console.log(response);
    this.products = response;
  }
  update(updateproduct: Products) {
    this.myservice.update(updateproduct);
    this.router.navigate(['/updatepro']);
  }
  delete(deleteproduct: Products): any {
    this.myservice.delete(deleteproduct.id).subscribe(data => {
      this.message = data
    });
    this.router.navigate(['/listpro']);
  }

}
