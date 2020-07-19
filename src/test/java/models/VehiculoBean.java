package models;

import com.opencsv.bean.CsvBindByPosition;

public class VehiculoBean extends CsvBean {

    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String idFiltro;

    @CsvBindByPosition(position = 2)
    private String marca;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdFiltro() {
        return idFiltro;
    }

    public void setIdFiltro(String idFiltro) {
        this.idFiltro = idFiltro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString(){
        return "id: "+id+
                "\n idFiltro: "+idFiltro+
                "\n marca: "+marca;
    }
}
