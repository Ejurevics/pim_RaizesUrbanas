package ModelClasses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) // Ignora campos JSON não mapeados
public class Endereco {

    private int id;

    @JsonProperty("logradouro") // Mapeia "logradouro" para "rua"
    private String rua;

    private String numero;
    private String complemento;

    private String bairro;

    @JsonProperty("localidade") // Mapeia "localidade" para "cidade"
    private String cidade;

    @JsonProperty("uf") // Mapeia "uf" para "estado"
    private String estado;

    @JsonProperty("cep") // Mapeia "cep" corretamente
    private String cep;

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
}
