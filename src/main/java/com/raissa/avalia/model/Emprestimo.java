package com.raissa.avalia.model;
//começar por aqui
import lombok.*; //assim, ele importa td do lombok
import java.time.LocalDate;
import java.util.List;

@Getter //get
@Setter //set
@NoArgsConstructor //const sem argumentos
@AllArgsConstructor // com argmentos

public class Emprestimo {
    private Long idEmprest;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Cliente cliente;
    private List<Livro> livrosEmprestados;
}
