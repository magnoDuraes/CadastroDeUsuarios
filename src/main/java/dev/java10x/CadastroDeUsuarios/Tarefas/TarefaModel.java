package dev.java10x.CadastroDeUsuarios.Tarefas;

import dev.java10x.CadastroDeUsuarios.Usuarios.UsuarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_tarefa")
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private boolean finalizada;
    @OneToMany(mappedBy = "tarefas")
    private List<UsuarioModel> usuarios;
}
