package ObjectData;

import java.util.HashMap;

public class AlertObject {
    private String alerta;
    public AlertObject(HashMap<String, String > testData) {
        populateData(testData);
    }
    public void populateData(HashMap<String, String >testData){
        for (String key:testData.keySet()){
            switch (key){
                case "alertaText":
                    setAlerta(testData.get(key));
                    break;
            }
        }
    }

    public String getAlerta() {
        return alerta;
    }

    public void setAlerta(String alerta) {
        this.alerta = alerta;
    }
}
