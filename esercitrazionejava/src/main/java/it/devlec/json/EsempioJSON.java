package it.devlec.json;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

public class EsempioJSON {
    private static final Logger logger = LogManager.getLogger(EsempioJSON.class);

    public void esempioJSONOggetto(){
        JSONObject dati = new JSONObject();
        dati.put("nome", "Giovanni");
        dati.put("nome", "Tamborra");
        dati.put("eta", "22");
        dati.put("citta", "Foggia");
        dati.put("email", "giovannonetamb22@gmail.com");
        logger.info("JSON "+ dati);

        JSONObject dati2 = new JSONObject();
        dati2.put("nome", "Valerio");
        dati2.put("cognome", "Sigrisi");
        dati2.put("eta", "26");
        dati2.put("citta", "Lecce");
        dati2.put("email", "val.sig026@libero.it");
        logger.info("JSON "+ dati2);
    }
    public void esempioJSONArray(){
        JSONArray ja = new JSONArray();

        ja.put("Ciao a tutti, sono Marco e questi sono i miei dati personali");

        JSONObject dati = new JSONObject();
        dati.put("Nome", "Marco");
        dati.put("Cognome", "Tria");
        dati.put("eta", "23");
        dati.put("citta", "Bari");
        dati.put("email", "marco.tria00@hotmail.it");

        ja.put(dati);
        logger.info("JSON "+ dati);
    }
}
