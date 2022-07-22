package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O ID do aluno precisa ser positivo!")
  private Long alunoId;

  @NotNull(message = "Campo vazio! Preencha o campo corretamente!")
  @Positive(message = "'${validetedValue}' precisa ser positivo!")
  private double peso;

  @NotNull(message = "Campo vazio! Preencha o campo corretamente!")
  @Positive(message = "'${validetedValue}' precisa ser positivo!")
  @DecimalMin(value = "100", message = "'${validetedValue} precisa ser no mínimo {value}!'")
  private double altura;
}
