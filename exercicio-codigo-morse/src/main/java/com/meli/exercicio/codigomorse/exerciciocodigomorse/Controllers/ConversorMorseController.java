package com.meli.exercicio.codigomorse.exerciciocodigomorse.Controllers;


import com.meli.exercicio.codigomorse.exerciciocodigomorse.Classes.CodigoMorse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

@RestController
public class ConversorMorseController {

    /*textos para teste

     ... --- ... SOS
     .- ... .- ASA
     .... --- .-.. .- OLA
     -- . .-. -.-. .- -.. ---   .-.. .. -... .-. . MERCADO LIBRE
     ... .--. .-. .. -. --. SPRING
     .-. ..- -. ..-. --- .-. . ... - .-. ..- -. RUN FOREST RUN
     . ..- ... --- ..- --- ... . ..- .--. .- .. EU SOU O SEU PAI
     */

    @RequestMapping("/tradutorMorse/{codigo}")
    public String tradutorMorse(@PathVariable String codigo){
       try {
           return "Recebido: " + codigo + " Sua tradução é: " + CodigoMorse.portugues(codigo);

       }catch (Exception e){

           return e.getMessage();

       }
    }
}
