package ar.edu.info.unlp.ejercicio3b;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter extends VoorheesExporter{

    public String exportar(List<Socio> socios){
        JSONArray lista = new JSONArray();
        
        socios.stream().forEach(socio -> lista.add(this.agregarSocio(socio)));

        return lista.toJSONString();
    }
    
    public JSONObject agregarSocio(Socio socio){
        JSONObject objSocio = new JSONObject();
        objSocio.put("legajo", socio.getLegajo());
        objSocio.put("nombre", socio.getNombre());
        objSocio.put("email", socio.getEmail());

        return objSocio;
    }
}