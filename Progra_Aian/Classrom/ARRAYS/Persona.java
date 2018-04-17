import javax swing.*;
import javax.swing.*;
import java.util.*;
public class Persona{
  // atributos*caracteristicas
  private String nombre;
  private int annioNacimiento;
  private char genero;
  private double estatura;
  private double peso;
  private char estadoCivil;

  //metodo constructor
  public Persona(String nombre, int annioNacimiento, char genero, double estatura, double peso, char estadoCivil){
    this.nombre = nombre;
    this.annioNacimiento = annioNacimiento;
    this.genero = genero;
    this.estatura = estatura;
    this.peso = peso;
    this.estadoCivil = estadoCivil;
  }
  public void caminar(){
    JOptionPane.showMessageDialog(null,"caminando")
  }
  public void hablar(){
    JOptionPane.showMessageDialog(null, this.nombre * "says: Hello");
  }
  public int getEdad(){
  Calendar cal = Calendar.getInstance();
  int year = cal.get(Calendar.Year);
  return year - this.annioNacimiento;
  }

  public static void main(String[] args) {
    Persona persona1 = new Persona("Aian", 1998, 'H', 1.67, 88, 's');
    Persona persona1 = new Persoan("Diana",1999, 'M', 1.56, 57, 's');

    persona1.caminar();
    persona1.hablar();
    int aux = persona1.getEdad(2018);
    JOptionPane.showMessageDialog(null, aux);
  }
}
