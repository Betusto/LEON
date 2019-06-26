/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementos;

import java.util.Random;
import teclado.TecladoAbeja;
import teclado.TecladoAbuela;
import teclado.TecladoPayaso;
import teclado.TecladoAguacate;
import teclado.TecladoQueso;
import teclado.TecladoArbusto;
import teclado.TecladoPato;
import teclado.TecladoAudifonos;
import teclado.TecladoBombero;
import teclado.TecladoBruja;
import teclado.TecladoCalabaza;
import teclado.TecladoCalavera;
import teclado.TecladoBarco;
import teclado.TecladoCampana;
import teclado.TecladoChef;
import teclado.TecladoCine;
import teclado.TecladoCocodrilo;
import teclado.TecladoMaceta;
import teclado.TecladoMago;
import teclado.TecladoPino;
import teclado.TecladoMarciano;
import teclado.TecladoCohete;
import teclado.TecladoManzana;
import teclado.TecladoConejo;
import teclado.TecladoOso;
import teclado.TecladoDoctor;
import teclado.TecladoDuende;
import teclado.TecladoElote;
import teclado.TecladoFamilia;
import teclado.TecladoGorra;
import teclado.TecladoGusano;
import teclado.TecladoVaca;
import teclado.TecladoLagartija;
import teclado.TecladoLaptop;
import teclado.TecladoLibreta;
import teclado.TecladoLombriz;
import teclado.TecladoMaestra;
import teclado.TecladoManos;
import teclado.TecladoMartillo;
import teclado.TecladoMecedora;
import teclado.TecladoMosca;
import teclado.TecladoNariz;
import teclado.TecladoNube;
import teclado.TecladoNuez;
import teclado.TecladoOjos;
import teclado.TecladoPaloma;
import teclado.TecladoPalomitas;
import teclado.TecladoPantunflas;
import teclado.TecladoPatineta;
import teclado.TecladoPepino;
import teclado.TecladoPie;
import teclado.TecladoPluma;
import teclado.TecladoMuñeca;
import teclado.TecladoPuerta;
import teclado.TecladoReloj;
import teclado.TecladoDurazno;
import teclado.TecladoLobo;
import teclado.TecladoTortuga;
import teclado.TecladoVestido;
import teclado.TecladoZanahoria;

/**
 *
 * @author Alberto Villarreal
 */
public class TrasladadorTeclado {
   public int n;
   
   public void CompararTeclado(){
      Random rand1 = new Random();
        n = rand1.nextInt(60);
        switch(n){
            case 0:
                TecladoCampana Campana = new TecladoCampana();
                Campana.setSize(909, 655);
                Campana.setLocationRelativeTo(null);
                Campana.setVisible(true);
                break;
            case 1:
                TecladoQueso Queso = new TecladoQueso();
                Queso.setSize(909, 655);
                Queso.setLocationRelativeTo(null);
                Queso.setVisible(true);
                break;
            case 2:
                TecladoAguacate Aguacate = new TecladoAguacate();
                Aguacate.setSize(909, 655);
                Aguacate.setLocationRelativeTo(null);
                Aguacate.setVisible(true);
                break;
            case 3:
                TecladoPayaso Payaso = new TecladoPayaso();
                Payaso.setSize(909, 655);
                Payaso.setLocationRelativeTo(null);
                Payaso.setVisible(true);
                break;
            case 4:
                TecladoPato Pato = new TecladoPato();
                Pato.setSize(909, 655);
                Pato.setLocationRelativeTo(null);
                Pato.setVisible(true);
                break;                
            case 5:
                TecladoMago Mago = new TecladoMago();
                Mago.setSize(909, 655);
                Mago.setLocationRelativeTo(null);
                Mago.setVisible(true);
                break;
            case 6:
                TecladoPino Pino = new TecladoPino();
                Pino.setSize(909, 655);
                Pino.setLocationRelativeTo(null);
                Pino.setVisible(true);
                break;
            case 7:
                TecladoArbusto Arbusto = new TecladoArbusto();
                Arbusto.setSize(909, 655);
                Arbusto.setLocationRelativeTo(null);
                Arbusto.setVisible(true);
                break;
            case 8:
                TecladoBarco Barco = new TecladoBarco();
                Barco.setSize(909, 655);
                Barco.setLocationRelativeTo(null);
                Barco.setVisible(true);
                break;
            case 9:
                TecladoMaceta Maceta = new TecladoMaceta();
                Maceta.setSize(909, 655);
                Maceta.setLocationRelativeTo(null);
                Maceta.setVisible(true);
                break;
            case 10:
                TecladoCohete Cohete = new TecladoCohete();
                Cohete.setSize(909, 655);
                Cohete.setLocationRelativeTo(null);
                Cohete.setVisible(true);
                break;
            case 11:
                TecladoNube Nube = new TecladoNube();
                Nube.setSize(909, 655);
                Nube.setLocationRelativeTo(null);
                Nube.setVisible(true);
                break;
            case 12:
                TecladoNuez Nuez = new TecladoNuez();
                Nuez.setSize(909, 655);
                Nuez.setLocationRelativeTo(null);
                Nuez.setVisible(true);
                break;
            case 13:
                TecladoLagartija Lagartija = new TecladoLagartija();
                Lagartija.setSize(909, 655);
                Lagartija.setLocationRelativeTo(null);
                Lagartija.setVisible(true);
                break;
            case 14:
                TecladoCocodrilo Cocodrilo = new TecladoCocodrilo();
                Cocodrilo.setSize(909, 655);
                Cocodrilo.setLocationRelativeTo(null);
                Cocodrilo.setVisible(true);
                break;
            case 15:
                TecladoMosca Mosca = new TecladoMosca();
                Mosca.setSize(909, 655);
                Mosca.setLocationRelativeTo(null);
                Mosca.setVisible(true);
                break;
            case 16:
                TecladoAbeja Abeja = new TecladoAbeja();
                Abeja.setSize(909, 655);
                Abeja.setLocationRelativeTo(null);
                Abeja.setVisible(true);
                break;
            case 17:
                TecladoMarciano Marciano = new TecladoMarciano();
                Marciano.setSize(909, 655);
                Marciano.setLocationRelativeTo(null);
                Marciano.setVisible(true);
                break;
            case 18:
                TecladoLibreta Libreta = new TecladoLibreta();
                Libreta.setSize(909, 655);
                Libreta.setLocationRelativeTo(null);
                Libreta.setVisible(true);
                break;
            case 19:
                TecladoPluma Pluma = new TecladoPluma();
                Pluma.setSize(909, 655);
                Pluma.setLocationRelativeTo(null);
                Pluma.setVisible(true);
                break;
            case 20:
                TecladoLaptop Laptop = new TecladoLaptop();
                Laptop.setSize(909, 655);
                Laptop.setLocationRelativeTo(null);
                Laptop.setVisible(true);
                break;
            case 21:
                TecladoAudifonos Audifonos = new TecladoAudifonos();
                Audifonos.setSize(909, 655);
                Audifonos.setLocationRelativeTo(null);
                Audifonos.setVisible(true);
                break;
            case 22:
                TecladoVestido Vestido = new TecladoVestido();
                Vestido.setSize(909, 655);
                Vestido.setLocationRelativeTo(null);
                Vestido.setVisible(true);
                break;
            case 23:
                TecladoManzana Manzana = new TecladoManzana();
                Manzana.setSize(909, 655);
                Manzana.setLocationRelativeTo(null);
                Manzana.setVisible(true);
                break;
            case 24:
                TecladoCine Cine = new TecladoCine();
                Cine.setSize(909, 655);
                Cine.setLocationRelativeTo(null);
                Cine.setVisible(true);
                break;
             case 25:
                TecladoPalomitas Palomitas = new TecladoPalomitas();
                Palomitas.setSize(909, 655);
                Palomitas.setLocationRelativeTo(null);
                Palomitas.setVisible(true);
                break;
            case 26:
                TecladoAbuela Abuela = new TecladoAbuela();
                Abuela.setSize(909, 655);
                Abuela.setLocationRelativeTo(null);
                Abuela.setVisible(true);
                break;
            case 27:
                TecladoPaloma Paloma = new TecladoPaloma();
                Paloma.setSize(909, 655);
                Paloma.setLocationRelativeTo(null);
                Paloma.setVisible(true);
                break;
            case 28:
                TecladoFamilia Familia = new TecladoFamilia();
                Familia.setSize(909, 655);
                Familia.setLocationRelativeTo(null);
                Familia.setVisible(true);
                break;
            case 29:
                TecladoCalavera Calavera = new TecladoCalavera();
                Calavera.setSize(909, 655);
                Calavera.setLocationRelativeTo(null);
                Calavera.setVisible(true);
                break;
            case 30:
                TecladoCalabaza Calabaza = new TecladoCalabaza();
                Calabaza.setSize(909, 655);
                Calabaza.setLocationRelativeTo(null);
                Calabaza.setVisible(true);
                break;
            case 31:
                TecladoBruja Bruja = new TecladoBruja();
                Bruja.setSize(909, 655);
                Bruja.setLocationRelativeTo(null);
                Bruja.setVisible(true);
                break;
            case 32:
                TecladoDuende Duende = new TecladoDuende();
                Duende.setSize(909, 655);
                Duende.setLocationRelativeTo(null);
                Duende.setVisible(true);
                break;
            case 33:
                TecladoNariz Nariz = new TecladoNariz();
                Nariz.setSize(909, 655);
                Nariz.setLocationRelativeTo(null);
                Nariz.setVisible(true);
                break;
             case 34:
                TecladoOjos Ojos = new TecladoOjos();
                Ojos.setSize(909, 655);
                Ojos.setLocationRelativeTo(null);
                Ojos.setVisible(true);
                break;
            case 35:
                TecladoManos Manos = new TecladoManos();
                Manos.setSize(909, 655);
                Manos.setLocationRelativeTo(null);
                Manos.setVisible(true);
                break;
            case 36:
                TecladoLombriz Lombriz = new TecladoLombriz();
                Lombriz.setSize(909, 655);
                Lombriz.setLocationRelativeTo(null);
                Lombriz.setVisible(true);
                break;
            case 37:
                TecladoTortuga Tortuga = new TecladoTortuga();
                Tortuga.setSize(909, 655);
                Tortuga.setLocationRelativeTo(null);
                Tortuga.setVisible(true);
                break;
            case 38:
                TecladoGusano Gusano = new TecladoGusano();
                Gusano.setSize(909, 655);
                Gusano.setLocationRelativeTo(null);
                Gusano.setVisible(true);
                break;
            case 39:
                TecladoConejo Conejo = new TecladoConejo();
                Conejo.setSize(909, 655);
                Conejo.setLocationRelativeTo(null);
                Conejo.setVisible(true);
                break;
            case 40:
                TecladoReloj Reloj = new TecladoReloj();
                Reloj.setSize(909, 655);
                Reloj.setLocationRelativeTo(null);
                Reloj.setVisible(true);
                break;
            case 41:
                TecladoPantunflas Pantunflas = new TecladoPantunflas();
                Pantunflas.setSize(909, 655);
                Pantunflas.setLocationRelativeTo(null);
                Pantunflas.setVisible(true);
                break;
            case 42:
                TecladoPie Pie = new TecladoPie();
                Pie.setSize(909, 655);
                Pie.setLocationRelativeTo(null);
                Pie.setVisible(true);
                break;
             case 43:
                TecladoMecedora Mecedora = new TecladoMecedora();
                Mecedora.setSize(909, 655);
                Mecedora.setLocationRelativeTo(null);
                Mecedora.setVisible(true);
                break;
            case 44:
                TecladoPepino Pepino = new TecladoPepino();
                Pepino.setSize(909, 655);
                Pepino.setLocationRelativeTo(null);
                Pepino.setVisible(true);
                break;
            case 45:
                TecladoZanahoria Zanahoria = new TecladoZanahoria();
                Zanahoria.setSize(909, 655);
                Zanahoria.setLocationRelativeTo(null);
                Zanahoria.setVisible(true);
                break;
            case 46:
                TecladoOso Oso = new TecladoOso();
                Oso.setSize(909, 655);
                Oso.setLocationRelativeTo(null);
                Oso.setVisible(true);
                break;
            case 47:
                TecladoElote Elote = new TecladoElote();
                Elote.setSize(909, 655);
                Elote.setLocationRelativeTo(null);
                Elote.setVisible(true);
                break;
            case 48:
                TecladoPatineta Patineta = new TecladoPatineta();
                Patineta.setSize(909, 655);
                Patineta.setLocationRelativeTo(null);
                Patineta.setVisible(true);
                break;
            case 49:
                TecladoGorra Gorra = new TecladoGorra();
                Gorra.setSize(909, 655);
                Gorra.setLocationRelativeTo(null);
                Gorra.setVisible(true);
                break;
            case 50:
                TecladoVaca Vaca = new TecladoVaca();
                Vaca.setSize(909, 655);
                Vaca.setLocationRelativeTo(null);
                Vaca.setVisible(true);
                break;
            case 51:
                TecladoDoctor Doctor = new TecladoDoctor();
                Doctor.setSize(909, 655);
                Doctor.setLocationRelativeTo(null);
                Doctor.setVisible(true);
                break;
            case 52:
                TecladoMartillo Martillo = new TecladoMartillo();
                Martillo.setSize(909, 655);
                Martillo.setLocationRelativeTo(null);
                Martillo.setVisible(true);
                break;
            case 53:
                TecladoPuerta Puerta = new TecladoPuerta();
                Puerta.setSize(909, 655);
                Puerta.setLocationRelativeTo(null);
                Puerta.setVisible(true);
                break;
            case 54:
                TecladoMuñeca Muñeca = new TecladoMuñeca();
                Muñeca.setSize(909, 655);
                Muñeca.setLocationRelativeTo(null);
                Muñeca.setVisible(true);
                break;
            case 55:
                TecladoBombero Bombero = new TecladoBombero();
                Bombero.setSize(909, 655);
                Bombero.setLocationRelativeTo(null);
                Bombero.setVisible(true);
                break;
            case 56:
                TecladoDurazno Durazno = new TecladoDurazno();
                Durazno.setSize(909, 655);
                Durazno.setLocationRelativeTo(null);
                Durazno.setVisible(true);
                break;
            case 57:
                TecladoMaestra Maestra = new TecladoMaestra();
                Maestra.setSize(909, 655);
                Maestra.setLocationRelativeTo(null);
                Maestra.setVisible(true);
                break;
            case 58:
                TecladoLobo Lobo = new TecladoLobo();
                Lobo.setSize(909, 655);
                Lobo.setLocationRelativeTo(null);
                Lobo.setVisible(true);
                break;
            case 59:
                TecladoChef Chef = new TecladoChef();
                Chef.setSize(909, 655);
                Chef.setLocationRelativeTo(null);
                Chef.setVisible(true);
                break;
        }
       
        
    }
}
