import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddProoductComponent } from './add-prooduct/add-prooduct.component';

import { ProoductListComponent } from './prooduct-list/prooduct-list.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { FilterProductComponent } from './filter-product/filter-product.component';
import { SearchProductComponent } from './search-product/search-product.component';

@NgModule({
  declarations: [
    AppComponent,
    AddProoductComponent,
    UpdateProductComponent,
    ProoductListComponent,
    FilterProductComponent,
    SearchProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, HttpClientModule,FormsModule
  ],
  providers: [HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
