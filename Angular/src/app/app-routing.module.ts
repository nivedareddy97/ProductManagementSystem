import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProoductListComponent } from './prooduct-list/prooduct-list.component';
import { AddProoductComponent } from './add-prooduct/add-prooduct.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { FilterProductComponent } from './filter-product/filter-product.component';
import { SearchProductComponent } from './search-product/search-product.component';


const routes: Routes = [{path:'listpro',component: ProoductListComponent},
{path:'addpro',component: AddProoductComponent},
{path:'updatepro',component:UpdateProductComponent},
{path:'filter',component:FilterProductComponent},
{path:'search',component:SearchProductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
