/*
 UNIANDES PUYO
Sistema de Facturacion 2016 
Octavo Semestre
Franklin Cando
26/05/2016
 */

package animalesenum;
import java.util.Date;
/**
 *
 * @author FRANKLIN
 */
public class clsanimales { 
  
public enum estructura{ vertebrados, invertebrados}
public enum clase{oviparos,  mamiferos}
private int _id;
private String _nombre;
private estructura _estructur;
private clase _clasea;
private Date _apareamiento;// <no imprimir esto>poner null
private float _peso;


    public clsanimales() {
    }

    public clsanimales(int _id, String _nombre, estructura _estructur, clase _clasea, Date _apareamiento, float _peso) {
        this._id = _id;
        this._nombre = _nombre;
        this._estructur = _estructur;
        this._clasea = _clasea;
        this._apareamiento = _apareamiento;
        this._peso = _peso;
    }

    
 public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public Date Apareamiento() {
        return _apareamiento;
    }

    public void Apareamiento(Date _apareamiento) {
        this._apareamiento = _apareamiento;
    }

    public float Peso() {
        return _peso;
    }

    public void Peso(float _peso) {
        this._peso = _peso;
    }
 public estructura Estructur() {
        return _estructur;
    }

    public void Estructur(estructura _estructur) {
        this._estructur = _estructur;
    }

    public clase Clasea() {
        return _clasea;
    }

    public void Clasea(clase _clasea) {
        this._clasea = _clasea;
    }
}
