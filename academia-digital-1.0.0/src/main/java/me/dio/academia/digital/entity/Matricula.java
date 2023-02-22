package me.dio.academia.digital.entity;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_matriculas")
public class Matricula {

  private Long id;

  @OneToOne
  private Aluno aluno;

  private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
