import javax.swing.JOptionPane;

/**
 *
 * @author ikero, gpancardo, adi.leonardo
 */
public class ProgramaSumaDeVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tipoDeVector1,tipoDeVector1GV,tipoDeVector2,tipoDeVector2GV;
        float hVector1,hV1Cuadrado,coV1Cuadrado,caV1Cuadrado,hVector2,hV2Cuadrado;
        double suma,pi=3.141592654,gradosVector1,caVector1 = 0,coVector1 = 0,gradosVector2,caVector2 = 0,coVector2 = 0,coV2Cuadrado,caV2Cuadrado,CAFINAL,COFINAL,HFINAL,COFCUADRADO,CAFCUADRADO,SUMAFINAL;
        boolean caVector1Positivo = false,coVector1Positivo = false,caVector2Positivo = false,coVector2Positivo = false;
                
        
        JOptionPane.showMessageDialog(null, "Bienvenido al programa de suma de vectores");
        do{
        tipoDeVector1=Integer.parseInt(JOptionPane.showInputDialog("El primer vector tiene?\n1)Una magnitud y un angulo\n2)Dos magnitudes "));
    }while(2!=tipoDeVector1&&tipoDeVector1!=1);
    
    if(tipoDeVector1==1){
               
        hVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del vector 1"));
        caVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));
        coVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));
        
        do{
        
        gradosVector1=Double.parseDouble(JOptionPane.showInputDialog("Digite los grados del vector 1"));
        
        }while(gradosVector1>90);
        gradosVector1=Math.toRadians(gradosVector1);
        
        caVector1= (Math.cos(gradosVector1));
        coVector1= (Math.sin(gradosVector1));
        
        
        System.out.println("sen del angulo es "+coVector1);
        
        System.out.println("cos del angulo es"+caVector1);
        
        caVector1=caVector1*hVector1;
        coVector1=coVector1*hVector1;
        
        System.out.println("El co del vector 1 es: "+coVector1);
        System.out.println("El ca del vector 1 es: "+caVector1);
    }
    
     if(tipoDeVector1==2){
        
        do{
        tipoDeVector1GV=Integer.parseInt(JOptionPane.showInputDialog("El primer vector tiene los catetos\n1) Adyacente y Opuesto\n2)Adyacente e Hipotenusa\n3)Opuesto e Hipotenusa"));
    }while(2!=tipoDeVector1GV&&tipoDeVector1GV!=1&&tipoDeVector1GV!=3);  
       
    if(tipoDeVector1GV==1){
        
        caVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Adyacente: "));
        caVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));

        coVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Opuesto: "));
        coVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));       
    }   

    if(tipoDeVector1GV==2){
        
        caVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Adyacente: "));
        caVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));

        hVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud de la Hipotenusa: "));
        hV1Cuadrado=hVector1*hVector1;
        caV1Cuadrado=(float) (caVector1*caVector1);
        suma=hV1Cuadrado-caV1Cuadrado;
        
        
        coVector1=(float) Math.sqrt(suma);
        coVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));
        System.out.println("el co del vector es: "+coVector1);
        
    }

    if(tipoDeVector1GV==3){
        
        coVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Opuesto: "));
        coVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));
        hVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud de la Hipotenusa: "));
        hV1Cuadrado=hVector1*hVector1;
        coV1Cuadrado=(float) (coVector1*coVector1);
        suma=hV1Cuadrado-coV1Cuadrado;
        
        caVector1=(float) Math.sqrt(suma);
        caVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));
        System.out.println("el ca del vector es: "+caVector1);
        
    }    
     
    }
     
     
        do{
        tipoDeVector2=Integer.parseInt(JOptionPane.showInputDialog("El segundo vector tiene?\n1)Una magnitud y un angulo\n2)Dos magnitudes "));
    }while(2!=tipoDeVector2&&tipoDeVector2!=1);   
        
    if(tipoDeVector2==1){
        
        hVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del vector 2"));
        caVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));
        coVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));
        do{
        
        gradosVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite los grados del vector 2"));
        
        }while(gradosVector2>90);
        
        gradosVector2=Math.toRadians(gradosVector2);
        
        caVector2= (Math.cos(gradosVector2));
        coVector2= (Math.sin(gradosVector2));
        
        
        System.out.println("sen del angulo es "+coVector2);
        
        System.out.println("cos del angulo es"+caVector2);
        
        caVector2=caVector2*hVector2;
        coVector2=coVector2*hVector2;
        
        System.out.println("El co del vector 1 es: "+coVector2);
        System.out.println("El ca del vector 1 es: "+caVector2);
    }

     if(tipoDeVector2==2){
        
        do{
        tipoDeVector2GV=Integer.parseInt(JOptionPane.showInputDialog("El segundo vector tiene los catetos\n1) Adyacente y Opuesto\n2)Adyacente e Hipotenusa\n3)Opuesto e Hipotenusa"));
    }while(2!=tipoDeVector2GV&&tipoDeVector2GV!=1&&tipoDeVector2GV!=3);  
       
    if(tipoDeVector2GV==1){
        
        caVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Adyacente: "));
        caVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));

        coVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Opuesto: "));
        coVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));        
    }   

    if(tipoDeVector2GV==2){
        
        caVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Adyacente: "));
        caVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));
        
        hVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud de la Hipotenusa: "));
        hV2Cuadrado=hVector2*hVector2;
        caV2Cuadrado=caVector2*caVector2;
        suma=hV2Cuadrado-caV2Cuadrado;
        
        
        coVector2=(float) Math.sqrt(suma);
        coVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));
        System.out.println("el co del vector es: "+coVector2);
        
    }

    if(tipoDeVector2GV==3){
        
        coVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Opuesto: "));
        coVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));
        hVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud de la Hipotenusa: "));
        hV2Cuadrado=hVector2*hVector2;
        coV2Cuadrado=coVector2*coVector2;
        suma=hV2Cuadrado-coV2Cuadrado;
        
        caVector2=(float) Math.sqrt(suma);
        caVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));
        System.out.println("el ca del vector es: "+caVector2);
        
    }    
     
    }
     
     if(caVector1Positivo==true){
     
     if(caVector2Positivo==true){
     
         CAFINAL=caVector1+caVector2;
     
     }else{
     
         CAFINAL=caVector1-caVector2;
         
     }
     
     }else{
    
     if(caVector2Positivo==true){
     
         CAFINAL=-caVector1+caVector2;
     
     }else{
     
         CAFINAL=-caVector1-caVector2;
         
     }
     
     }
        
 
     
     
     if(coVector1Positivo==true){
     
     if(coVector2Positivo==true){
     
         COFINAL=coVector1+coVector2;
     
     }else{
     
         COFINAL=coVector1-coVector2;
         
     }
     
     }else{
    
     if(coVector2Positivo==true){
     
         COFINAL=-coVector1+coVector2;
     
     }else{
     
         COFINAL=-coVector1-coVector2;
         
     }
     
     }


     COFCUADRADO=COFINAL*COFINAL;
     CAFCUADRADO=CAFINAL*CAFINAL;
     SUMAFINAL=COFCUADRADO+CAFCUADRADO;
     HFINAL=Math.sqrt(SUMAFINAL);
     
     JOptionPane.showMessageDialog(null, "EL VECTOR RESULTANTE ES: \n"+HFINAL);
    }
    
}
