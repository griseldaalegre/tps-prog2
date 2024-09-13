package tp5;

import java.util.ArrayList;

//cntains reemplaza al for
public class EJ5Cooperativa {
    private ArrayList<EJ5Lote> lotes;
    private ArrayList<EJ5Cereal> cereales;
    private ArrayList<String> mineralesPrimarios;

    public EJ5Cooperativa() {
        this.lotes = new ArrayList<EJ5Lote>();
        this.cereales = new ArrayList<EJ5Cereal>();
        this.mineralesPrimarios = new ArrayList<String>();
    }

    public void addLote(EJ5Lote lote) {
        if(this.esEspecial(lote) && !lotes.contains(lote)){ //equals de lote
            this.lotes.add(lote);
        }
    }

    public void removeLote(EJ5Lote lote) {
        lotes.remove(lote);//Se usa el equals de String
    }

    public void addCereal(EJ5Cereal cereal) {
        this.cereales.add(cereal);
    }

    public void removeCereal(String mineral) {
        cereales.remove(mineral);//Se usa el equals de String
    }

    public void addMineralPrimario(String mineral) {
    if ((!mineralesPrimarios.contains(mineral))){//equals de string
        this.mineralesPrimarios.add(mineral);
    }
    }

    public void removeMineralPrimario(String mineral) {
        mineralesPrimarios.remove(mineral);//Se usa el equals de String
    }

    // Obtengo los ceeales q puedo sebrar en x lote
    public ArrayList<EJ5Cereal> getCerealesPara(EJ5Lote lote) {
        ArrayList<EJ5Cereal> cerealesParaLote = new ArrayList<EJ5Cereal>();
        int i = 0;
        while (i < cereales.size()) {
            if (cereales.get(i).acepta(lote)) {
                cerealesParaLote.add(cereales.get(i));
            }
            i++; // Incrementa el índice
        }
        return cerealesParaLote; //
    }

    public ArrayList<EJ5Lote> getLotesPara(EJ5Cereal c) {
        ArrayList<EJ5Lote> lotesParaCereal = new ArrayList<>();
        int i = 0;
        while (i < lotes.size()) {
            if (c.acepta(lotes.get(i))) {
                lotesParaCereal.add(lotes.get(i));
            }
            i++;
        }
        return lotesParaCereal;
    }

    public boolean esEspecial(EJ5Lote lote) {
        int i = 0;
        boolean encontre = false;
        while (i < mineralesPrimarios.size() && !encontre) {

            if (lote.tieneMineral(mineralesPrimarios.get(i))) {
                encontre = true;
                return encontre;
            }
            i++;
        }
        return encontre;
    }

    public boolean sirve(EJ5Lote lote, EJ5Cereal cereal) {
        return cereal.acepta(lote);
    }
    //La coperativa delega responsabillidad

}
