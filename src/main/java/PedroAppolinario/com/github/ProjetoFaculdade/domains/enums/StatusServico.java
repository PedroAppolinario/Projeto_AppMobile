package PedroAppolinario.com.github.ProjetoFaculdade.domains.enums;

public enum StatusServico {

    ABERTO(0,"Pedido Aberto"),
    EM_ANDAMENTO(1,"Pedido Em Andamento"),
    FECHADO(2,"Pedido Fecado"),
    CONCLUIDO(3,"Pedido Concluido"),
    PENDENCIA(4,"Pedido Possui Pendencias");

    private int cod;
    private String descricao;

    StatusServico(int id, String descricao) {
        this.cod = id;
        this.descricao = descricao;
    }
    public int getCod() {
        return cod;
    }
    public String getDescricao() {
        return descricao;
    }

    public static StatusServico toEnum(Integer cod){
        if(cod == null){
            return null;
        }
        for(StatusServico x : StatusServico.values()){
            if(cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id Invalido: " + cod);
    }
}