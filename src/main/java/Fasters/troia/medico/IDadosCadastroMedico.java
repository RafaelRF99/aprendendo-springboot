package Fasters.troia.medico;

import Fasters.troia.endereco.IEndereco;

public record IDadosCadastroMedico(String nome, String email, String crm, IEspacialidade especialidade, IEndereco endereco) {
}
