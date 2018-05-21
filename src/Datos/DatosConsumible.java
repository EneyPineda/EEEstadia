/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Mayra
 */
public class DatosConsumible {
   private String IdConsumible;
   private String Codigo;
   private String Nombre;
   private String FechaC;
   private String FormaC;
   private String ValorT;
   private String Categoria;
   
   public DatosConsumible(){
   }

   public DatosConsumible(String IdConsumible, String Codigo, String Nombre, String FechaC, String FormaC, String ValorT, String Categoria) {
        this.IdConsumible = IdConsumible;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.FechaC = FechaC;
        this.FormaC = FormaC;
        this.ValorT = ValorT;
        this.Categoria = Categoria;
   }
   
   

    public String getIdConsumible() {
        return IdConsumible;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getFechaC() {
        return FechaC;
    }

    public String getFormaC() {
        return FormaC;
    }

    public String getValorT() {
        return ValorT;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setIdConsumible(String IdConsumible) {
        this.IdConsumible = IdConsumible;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFechaC(String FechaC) {
        this.FechaC = FechaC;
    }

    public void setFormaC(String FormaC) {
        this.FormaC = FormaC;
    }

    public void setValorT(String ValorT) {
        this.ValorT = ValorT;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
   
    
}
