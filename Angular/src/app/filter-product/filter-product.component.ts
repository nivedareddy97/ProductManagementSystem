import { Component, OnInit } from '@angular/core';
import { Products, MyserviceService } from '../myservice.service';

@Component({
  selector: 'app-filter-product',
  templateUrl: './filter-product.component.html',
  styleUrls: ['./filter-product.component.css']
})
export class FilterProductComponent implements OnInit {

  //throw new Error("Method not implemented.");

  minprice: number;
  maxprice:number;
  message:string;
  mstatus:boolean;
  productlist:Products[];
  status:boolean;
  constructor(private service:MyserviceService ) {
    this.status=false;
   }

  ngOnInit(): void {
  }
  submit(minprice:number,maxprice:number){
  this.service.getProductsData(minprice,maxprice).subscribe(
    response => this.handleSuccessfulResponse(response),
  );
  }
  handleSuccessfulResponse(response) {
    console.log(response);
    this.productlist = response;
    this.status=true;
  }
  minPrice(minprice:number)
  {
    this.minprice=minprice;
  }
  maxPrice(maxprice:number)
  {
    if(this.minprice>maxprice)
    {
	this.message="Max price should be greater than Min price";
    this.mstatus=true;
	}
  }
 
}