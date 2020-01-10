import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { GraphcreatorComponent } from './components/map/graphcreator/graphcreator.component';
import { PolygonsComponent } from './components/map/polygons/polygons.component';
import { MapUploadComponent } from './components/map/map-upload/map-upload.component';
import {StandCreatorComponent} from "./components/map/stand-creator/stand-creator.component";


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'graphcreator', component: GraphcreatorComponent},
  {path: 'polygons', component: PolygonsComponent},
  {path: 'mapupload', component: MapUploadComponent},
  {path: 'stands', component: StandCreatorComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
