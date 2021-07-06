package com.meli.exercicios.linktracker.exerciciolinktracker;

import com.meli.exercicios.linktracker.exerciciolinktracker.DTO.MetricasDTO;
import com.meli.exercicios.linktracker.exerciciolinktracker.Forms.LinkForm;
import com.meli.exercicios.linktracker.exerciciolinktracker.Models.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/api")
public class LinkController {

    private LinkService linkService;

    public LinkController() {
    }

    @Autowired
    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping("/link")
    public ResponseEntity<?> criar(@RequestBody LinkForm linkForm) {
        return ResponseEntity.ok(linkService.criar(linkForm));
    }

    @PostMapping("/invalidar/{linkId}")
    public ResponseEntity<?> invalidar(@PathVariable long linkId) throws Exception {
        linkService.invalidar(linkId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/link/{id}/{senha}")
    public RedirectView redirecionar( @PathVariable long id, @PathVariable String senha) throws Exception {
        String url = linkService.redirecionar(id, senha);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(url);
        return redirectView;
    }

    @GetMapping("/contador/{linkId}")
    public ResponseEntity<?> getRedirecionar(@PathVariable long linkId) throws Exception {
        return ResponseEntity.ok(new MetricasDTO(linkService.contador(linkId)));
    }
}
