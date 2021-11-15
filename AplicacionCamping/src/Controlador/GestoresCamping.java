/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Camping;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Epic
 */
public class GestoresCamping {
    
    private Camping camping;
    private XStream xstream = null;
    
       
    public GestoresCamping() throws Exception{
        xstream = new XStream(new DomDriver());
        
        try{
            FileInputStream file_input_xml = new FileInputStream(new File("src/AplicacionCamping.xml"));
            camping = (Camping) xstream.fromXML(file_input_xml);
            if(camping==null)
                throw new Exception ("Excepción no se encuentra Camping");
        }
        catch(FileNotFoundException e){
            camping = new Camping();
            camping.cargarDatos();
            this.guardarXML();
        }
        catch (IOException e){
            throw new Exception ("IOExcepcion al cargar los datos " + e.getMessage());
        }
        catch (Exception e){
            throw new Exception ("Excepción al cargar los datos "+e.getMessage());
        }
        
    }   
    
    public Gerente iniciarPersonal(){        
        Gerente personal = new Gerente("", "", this.camping);
        return personal;
    }
    
    public void salir(){
        this.guardarXML();
    }
    
    private void guardarXML(){
        String xml = xstream.toXML(camping);
        try{
            FileWriter file_output_xml = new FileWriter(new File("src/AplicacionCamping.xml"));
            file_output_xml.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            file_output_xml.write(xml);
            file_output_xml.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public UsuarioRegistrado login (String nombre, String contrasenya){
        return camping.login(nombre,contrasenya);
    }
}
