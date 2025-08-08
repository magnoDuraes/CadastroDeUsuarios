package dev.java10x.CadastroDeUsuarios.Usuarios;

import dev.java10x.CadastroDeUsuarios.Tarefas.TarefaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "tarefa_id")
    private TarefaModel tarefa;
}
