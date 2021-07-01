package com.meli.exercicioobterdiploma.obterdiploma;

import com.meli.exercicioobterdiploma.obterdiploma.DTO.AlunoDTO;
import com.meli.exercicioobterdiploma.obterdiploma.model.Aluno;
import com.meli.exercicioobterdiploma.obterdiploma.model.Disciplina;
import com.meli.exercicioobterdiploma.obterdiploma.utils.CalculaNota;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/diploma")
public class ObterDiplomaController {

    /*Lista para o payload
    {
    "nome" : "Adriana",
    "listaDisciplinas" : [
        {
            "nome" : "Matemática",
            "nota" : 9.0
        },
         {
            "nome" : "PG",
            "nota" : 9.0
        },
         {
            "nome" : "Portugues",
            "nota" : 9.0
        }
     ]
     }
*/
    @PostMapping
    public String cadastra (@RequestBody Aluno aluno) {

        for(Disciplina d : aluno.getListaDisciplinas()){
            if(d.getNota() > 10 || d.getNota() < 0){
                return "Valor " + d.getNota() + " nota inválida! Verifique e digite novamente!";
            }
        }

        AlunoDTO al = new AlunoDTO(aluno.getNome(), aluno.getListaDisciplinas(), CalculaNota.resultado(CalculaNota.mediaCalculada(aluno)));
        al.setMedia(CalculaNota.mediaCalculada(aluno));
        String mediaFinal = CalculaNota.arredondar(al.getMedia());

        return "Diploma para o aluno(a) " + al.getNome() + " sua nota final no Curso foi: " + mediaFinal + " Seu resultado foi: " + al.getResultado();
    }
}
