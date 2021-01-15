import { Usuario } from './../model/usuario';
import { Injectable } from "@angular/core";
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

const URLREGISTER="http:localhost:1237/apiregister";
const URLLOGAR="http://localhost:1237/api/login";
const URLLIST="http://localhost:1237/api/listall";
@Injectable()
export class UsuarioService{
   
    constructor(private http:HttpClient){

    }

     public register(usuario:Usuario):Observable<any>{
        
         return this.http.post<any>(`${URLREGISTER})`,usuario);

     }
     public login (usuario:Usuario):Observable<any>{
        return this.http.post<any>(`${URLLOGAR})`,usuario);
    }
    public listAll():Observable<Usuario []>{
        return this.http.get<Usuario[]>(`${URLLIST}`);
    }

    



}