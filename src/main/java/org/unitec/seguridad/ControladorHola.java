package org.unitec.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class ControladorHola {
@Autowired
UserDetailsService userDetailsService;
   // @CrossOrigin(origins = { "http://localhost:4200" }, allowCredentials = "true")
    @GetMapping("/")
    public Estatus hola(){
        System.out.println("se lelvo a cabo la autenticasasasasacion");

        System.out.println("estatusito "+ SecurityContextHolder.getContext().getAuthentication().getPrincipal());
      Estatus estatus=new Estatus();


      estatus.setMensaje("auntenticando con corsito");
        return estatus;
    }


    @GetMapping("/borrego")
    public Estatus borrego(){
        System.out.println("Llego borreo");
        Estatus estatus=new Estatus();
        estatus.setMensaje("jajajaja");
        return estatus;
    }
}
