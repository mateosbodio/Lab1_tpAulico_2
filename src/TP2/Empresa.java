package TP2;

import java.util.ArrayList;
import java.util.Objects;

public class Empresa {
    private String razonSocial;
    private int cuit;
    public static ArrayList<Empleado> empleados;
    
    public Empresa(String razonSocial, int cuit){
        this.razonSocial= razonSocial;
        this.cuit = cuit;
        this.empleados = new ArrayList<Empleado>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
     public void agregarEmpleado(Empleado e){
      this.empleados.add(e);
   }
     private void mostrarEmpleado(){
         for(Empleado emp: empleados ){
             System.out.println(emp);
         }
     }

    @Override
    public String toString() {
        return razonSocial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.razonSocial, other.razonSocial)) {
            return false;
        }
        return true;
    }

}