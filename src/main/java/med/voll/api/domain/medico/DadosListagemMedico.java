package med.voll.api.domain.medico;

public record DadosListagemMedico(Long id, String nome, String email) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail());
    }

}
