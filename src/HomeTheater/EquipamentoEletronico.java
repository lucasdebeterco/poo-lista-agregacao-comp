package HomeTheater;

public class EquipamentoEletronico {
    private float tensao;
    private float consumo;

    public float getTensao() {
        return tensao;
    }

    public void setTensao(float tensao) {
            this.tensao = tensao;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Tensao: ").append(tensao);
        sb.append(", Consumo: ").append(consumo);
        return sb.toString();
    }
}
