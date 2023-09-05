package TP2;

import java.util.ArrayList;

public class Empresa {

    private String razonSocial;

    private int cuit;

    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, int cuit, ArrayList<Empleado> empleados) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = empleados;
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



    public void agregarEmpleado(Empleado e) {
    }


    public void mostrarEmpleados() {
    }

    @Override
    public String toString() {
        return "Empresa{" + "razonSocial=" + razonSocial + ", cuit=" + cuit + ", empleados=" + empleados + '}';
    }
    
}
