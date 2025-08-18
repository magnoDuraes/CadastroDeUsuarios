package dev.java10x.CadastroDeUsuarios.Tarefas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class TarefaController {

    @GetMapping("/")
    public String listarTarefa(){
        return "Tarefa listadas com sucesso!";
    }

    @PostMapping("/criar")
    public String criarTarefa(){
        return "Tarefa criada com sucesso!";
    }

    @PutMapping("/alterar")
    public String alterarTarefa(){
        return "Tarefa alterada com sucesso!";
    }

    @DeleteMapping("/criar")
    public String deletarTarefa(){
        return "Tarefa deletada com sucesso!";
    }
}
