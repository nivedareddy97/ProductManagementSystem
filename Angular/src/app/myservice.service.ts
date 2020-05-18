import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class MyserviceService {
  http: any;
  
  updateproduct:   Products;
  constructor(private httpService: HttpClient) { }
  public getProducts() {
    console.log("ins service get products");
    const headers =new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
    return this.httpService.get<Products>("http://localhost:4488/products/GetAllProducts");
  }
  public addPro(addpro: Products) {
    console.log("ins service add");
    console.log(addpro);
    const headers =new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
    return this.httpService.post("http://localhost:2341/products/ProductCreation", addpro,  { headers, responseType: 'text'});
  }
  public update(updateproduct: Products) {
    this.updateproduct = updateproduct;
  }
  public updateMethod() {
    return this.updateproduct;
  }
  public onUpdate(updatepro: Products) {
    console.log("ins service update");
    const headers =new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
    return this.httpService.put("http://localhost:2345/products/UpdateProduct", updatepro,  { headers, responseType: 'text'});
  }
  delete(id: number) {
    console.log("ins service delete");
    const headers =new HttpHeaders().set('Content_Type', 'text/plain ;charset=utf-8');
    return this.httpService.delete("http://localhost:2330/products/DeleteProduct/" + id,  { headers, responseType: 'text'});
  }
  public onSubmitSearch(catogery:string) {
    console.log("inservice"+catogery);
    return this.httpService.get<Products>("http://localhost:2335/products/SearchProducts/"+catogery);
  }
  public getProductsData(minprice:number,maxprice:number)
  {
	  console.log("inservice");
    return this.httpService.get<Products>("http://localhost:6565/products/FilterProducts/"+minprice+"/"+maxprice);
  }	
  
}
export class Products {
  id: number;
  colour: string;
  prize: number;
  dimensions: string;
  specifications: string;
  manufacture: string;
  quantity: number;
  productCatogery:string;
  productName: string;
  retailerId:number;
}
