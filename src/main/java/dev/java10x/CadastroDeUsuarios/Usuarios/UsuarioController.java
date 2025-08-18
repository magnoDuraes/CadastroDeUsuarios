package dev.java10x.CadastroDeUsuarios.Usuarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UsuarioController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar Usuário (CREATE)
    @PostMapping("/criar")
    public String criarUsuario(){
        return "Usuário criado";
    }

    // Procurar Usuário por ID (READ)
    @GetMapping("/todos")
    public String mostrarTodosUsuarios(){
        return "Mostar Usuário";
    }

    // Mostrar todos os usuários (READ)
    @GetMapping("/todosID")
    public String mostrarTodosUsuariosPorId(){
        return "Mostar Usuário por ID";
    }

    // Alterar dados dos usuários (UPDATE)
    @PutMapping("/alterarID")
    public String alterarUsuarioPorId(){
        return "Mostar Usuário por ID";
    }


    // Deletar Usuário (DELETE)
    @DeleteMapping("/alterarID")
    public String deletarUsuarioPorId(){
        return "Deletar Usuário por ID";
    }
}
