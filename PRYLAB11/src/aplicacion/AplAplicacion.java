/**
 * Clase que inicia la aplicacion
 *
 * @author Kevin Robles, Oscar Trejos
 * @version 06/01/2020
 */
package aplicacion;
import util.Ordenacion;
import logicadenegocios.Cliente;
import logicadenegocios.Cuenta;
import logicadenegocios.CuentaAhorro;
import logicadenegocios.CuentaCorriente;

public class AplAplicacion {
  public static void main(String[] args){
    Cliente[] clientes;
    Cuenta[] cuentas;
    
    clientes = new Cliente[2];
    cuentas = new Cuenta[2];
    
    Cliente cliente1 = new Cliente("123","Mario","Hernandez");
    Cliente cliente2 = new Cliente("345","Mateo","Rojas");
    
    clientes[0] = cliente1;
    clientes[1] = cliente2;
    
    Cuenta cuenta1 = new CuentaAhorro(cliente1,3000);
    Cuenta cuenta2 = new CuentaCorriente(cliente2,1500);
    
    cuenta1.depositar(1500);
    cuenta1.depositar(2000);
    cuenta1.retirar(300);
    cuenta2.retirar(200);
    
    cuentas[0] = cuenta1;
    cuentas[1] = cuenta2;
    
    System.out.println(cuenta1.cobrarComisiones());
    System.out.println(cuenta2.cobrarComisiones());
    System.out.println();
    System.out.println(cuenta1.toString());
    System.out.println(cuenta2.toString());
    System.out.println();
    
    //Impresion de todos los clientes ordenador alfabeticamente
    Ordenacion.ordenar(clientes);
    
    System.out.println("Clientes Ordenados");
    for (int i = 0; i < clientes.length; i++) {
      System.out.println(clientes[i].toString());
      System.out.println();
    }
    
    System.out.println();
    //Impresion de todas las cuentas ordenadas en funcion del saldo
    Ordenacion.ordenar(cuentas);
    
    System.out.println("Cuentas Ordenados");
    for (int i = 0; i < cuentas.length; i++) {
      System.out.println( cuentas[i].toString());
      System.out.println();
    }

  }
    
}
