/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organigrama;

/**
 *
 * @author delly
 */
public class Main {

    public static void main(String[] args) {
        CompositeCharges despacho = new CompositeCharges("Despacho del ministerio de educacion");

        SimpleCharge oficinaAC = new SimpleCharge("oficina asesora de comunicaciones");
        SimpleCharge oficinaAJ = new SimpleCharge("oficina asesora de juridica");
        SimpleCharge oficinaAP = new SimpleCharge("oficina asesora de planeacion y finanzas");
        SimpleCharge oficinaCAI = new SimpleCharge("oficina de cooperacion y asuntos internacionales");
        SimpleCharge oficinaCI = new SimpleCharge("oficina de control interno");
        SimpleCharge oficinaTSI = new SimpleCharge("oficina de tecnologia y sistemas de informacion");
        SimpleCharge oficinaIET = new SimpleCharge("oficina de innovacion educativa con uso de nuevas tecnologias");

        SimpleCharge programa = new SimpleCharge("programa todos a aprender");

        CompositeCharges viceministerioPBM = new CompositeCharges("viceministerio de educacion preescolar, basica y media");
        CompositeCharges viceministerioES = new CompositeCharges("viceministerio de educacion superior");
        CompositeCharges secretariaG = new CompositeCharges("secretaria general");

        SimpleCharge unidadAC = new SimpleCharge("unidad de atencion al ciudadano");
        SimpleCharge subdireccionGF = new SimpleCharge("subdireccion de gestion financiera");
        SimpleCharge subdireccionDO = new SimpleCharge("subdireccion de desarrollo organizacional");
        SimpleCharge subdireccionTH = new SimpleCharge("subdireccion de talento humano");
        SimpleCharge subdireccionC = new SimpleCharge("subdireccion de contratacion");
        SimpleCharge subdireccionGA = new SimpleCharge("subdireccion de gestion administrativa");

        CompositeCharges direccionCES = new CompositeCharges("Direccion de calidad para la es");
        CompositeCharges subdAC = new CompositeCharges("subd. aseguramiento de la calidad de la ES");
        SimpleCharge subdIV = new SimpleCharge("SubD. de Inspeccion y vigilancia");

        CompositeCharges direccionFES = new CompositeCharges("Direccion de fomento de la educacion superior");
        CompositeCharges subdGES = new CompositeCharges("subd. de apoyo de la gestion de las IES");
        SimpleCharge subdDS = new SimpleCharge("SubD. de desarrollo sociotal");

        CompositeCharges direccionPI = new CompositeCharges("Direccion de primera infancia");
        CompositeCharges subdCPI = new CompositeCharges("subd. de cobertura de P.I");
        SimpleCharge subdCalPI = new SimpleCharge("subd. de calidad de P.I");

        CompositeCharges direccionCE = new CompositeCharges("Direccion de cobertura y equidad");
        CompositeCharges subdA = new CompositeCharges("subd. de acceso");
        SimpleCharge subdSP = new SimpleCharge("subd. subdireccion de permanencia");

        CompositeCharges direccionFGT = new CompositeCharges("Direccion fortalecimiento a la gestion temporal");
        CompositeCharges subdMC = new CompositeCharges("subd. de monitoreo y control");
        CompositeCharges subdFI = new CompositeCharges("subd. de fortalecimiento institucional");
        SimpleCharge subdRHE = new SimpleCharge("subd. recursos humanos sector educativo");

        CompositeCharges direccionCEFB = new CompositeCharges("Direccion de calidad para la educacion FBM");
        CompositeCharges subdRECE = new CompositeCharges("subd. de referencias y evaluacion de la calidad educativa");
        SimpleCharge subdFC = new SimpleCharge("subd. de fomento de competencias");

        despacho.add(oficinaAC);
        despacho.add(oficinaAJ);
        despacho.add(oficinaAP);
        despacho.add(oficinaCAI);
        despacho.add(oficinaCI);
        despacho.add(oficinaTSI);
        despacho.add(oficinaIET);

        despacho.add(programa);

        despacho.add(viceministerioPBM);
        despacho.add(viceministerioES);
        despacho.add(secretariaG);

        secretariaG.add(unidadAC);
        secretariaG.add(subdireccionGF);
        secretariaG.add(subdireccionDO);
        secretariaG.add(subdireccionTH);
        secretariaG.add(subdireccionC);
        secretariaG.add(subdireccionGA);

        viceministerioES.add(direccionCES);
        viceministerioES.add(direccionFES);

        direccionCES.add(subdAC);
        subdAC.add(subdIV);

        direccionFES.add(subdGES);
        subdGES.add(subdDS);

        viceministerioPBM.add(direccionPI);
        viceministerioPBM.add(direccionCE);
        viceministerioPBM.add(direccionFGT);
        viceministerioPBM.add(direccionCEFB);

        direccionPI.add(subdCPI);
        subdCPI.add(subdCalPI);

        direccionCE.add(subdA);
        subdA.add(subdSP);

        direccionFGT.add(subdMC);
        subdMC.add(subdFI);
        subdFI.add(subdRHE);

        direccionCEFB.add(subdRECE);
        subdRECE.add(subdFC);

        System.out.println("--------imprime toda la rama especificada-----");
        direccionCEFB.getName();
        System.out.println("-------saca la oracion mas larga de una rama-----");
        direccionCEFB.determinateHigher();
    }

}
