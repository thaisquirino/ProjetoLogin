import { UsuarioService } from './../service/usuario-service';
import { Usuario } from './../model/usuario';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
   msg:string="";
  usuario:Usuario;
  usuarios:Usuario[]=[];

  constructor(private service:UsuarioService) { 
    this.usuario=new Usuario();
  }

  ngOnInit() {
    this.listar();
  }

 

  public listar (){
    this.service.listAll().subscribe(res=>{
      this.usuarios=res;
    })
  }
  public cadastrar(){
    this.service.register(this.usuario).subscribe(res=>{
      if (res==null){
        console.log('error na gravação')
      }
      this.usuario=new Usuario();
      console.log('gravou');
      this.msg='gravados os dados'  + res;
      this.usuario=new  Usuario();
    },error=>{
console.log('nao gravou',error);
this.msg='error na gravacao'+error;
    this.listar();
    });
  }

}
