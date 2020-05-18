import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';
import { Products, MyserviceService } from '../myservice.service';

@Component({
  selector: 'app-search-product',
  templateUrl: './search-product.component.html',
  styleUrls: ['./search-product.component.css']
})
export class SearchProductComponent implements OnInit {

  category: string;
  productlist: Products[];
mstatus:boolean;
   constructor(private service:MyserviceService,private router: Router){
   this.mstatus=false;
   }

  ngOnInit(): void {
  }
  onSubmitSearch(category: string) {
    this.service.onSubmitSearch(category).subscribe(
      response => this.handleSuccessfulResponse(response),
    );
  }
  handleSuccessfulResponse(response) {
    console.log(response);
    this.productlist = response;
    this.mstatus=true;
  }

}

