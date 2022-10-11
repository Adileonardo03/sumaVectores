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
        double suma,pi=3.141592654,gradosVector1,caVector1 = 0,coVector1 = 0,gradosVector2,caVector2 = 0,coVector2 = 0,coV2Cuadrado,caV2Cuadrado,CAFINAL,COFINAL,HFINAL,COFCUADRADO,CAFCUADRADO,SUMAFINAL; // esto siirve para definir conceptro, los cuales suaremos mas adelante
        boolean caVector1Positivo = false,coVector1Positivo = false,caVector2Positivo = false,coVector2Positivo = false;  // establacer las posibilidades por si algunos de los vectores llega a ser positivo o negativo  
                
        
        JOptionPane.showMessageDialog(null, "Bienvenido al programa de suma de vectores"); //Nos mostrara una ventana para iniciar con la calculadora, dandonos la bienvenida 
        do{
        tipoDeVector1=Integer.parseInt(JOptionPane.showInputDialog("El primer vector tiene?\n1)Una magnitud y un angulo\n2)Dos magnitudes "));// en esta ventana nos dara a elegir para el primer vector, de acierdo con los datos que tengamos del mismo
    }while(2!=tipoDeVector1&&tipoDeVector1!=1); 
    
    if(tipoDeVector1==1){
               
        hVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del vector 1")); // en el caso de ser la primera opcion, es decir el  tener una magintud y un angulo de dicho vector, se ejcutara este
        caVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));
        coVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));// en esta linea establecera el usuario si la direccion de los catetos llega a ser negativa o positiva
        
        do{
        
        gradosVector1=Double.parseDouble(JOptionPane.showInputDialog("Digite los grados del vector 1")); // aqui nos pedira los grados del vector
        
        }while(gradosVector1>90);
        gradosVector1=Math.toRadians(gradosVector1); // esto nos indica como si pasa de los 90 grados, usaremos los radianes
        
        caVector1= (Math.cos(gradosVector1));//aqui usaremos, dependiendo el caso, Coseno
        coVector1= (Math.sin(gradosVector1));// o Seno
        
        
        System.out.println("sen del angulo es "+coVector1); // aqui nos motrará y sacara el valor del seno del angulo
        
        System.out.println("cos del angulo es"+caVector1); // y aqui el valor del coseno
        
        caVector1=caVector1*hVector1; // en esta se hará la respectiva operacion, para cada uno
        coVector1=coVector1*hVector1;
        
        System.out.println("El co del vector 1 es: "+coVector1); // y aqui mostrando sus resultados
        System.out.println("El ca del vector 1 es: "+caVector1);
    }
    
     if(tipoDeVector1==2){ // ahora, utilizaremos la sefunda opcion, es decir, si el vector tiene dos magnitudes
        
        do{
        tipoDeVector1GV=Integer.parseInt(JOptionPane.showInputDialog("El primer vector tiene los catetos\n1) Adyacente y Opuesto\n2)Adyacente e Hipotenusa\n3)Opuesto e Hipotenusa"));
    }while(2!=tipoDeVector1GV&&tipoDeVector1GV!=1&&tipoDeVector1GV!=3);  
       
    if(tipoDeVector1GV==1){ //empezaremos con las lineas del primer vecotr
        
        caVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Adyacente: ")); //ventana emergente donde son muestre dar la magnitud de cada cateto
        caVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false")); // y su respectiva direccion

        coVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Opuesto: "));
        coVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));       
    }   

    if(tipoDeVector1GV==2){
        
        caVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del Cateto Adyacente: "));
        caVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));

        hVector1=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud de la Hipotenusa: ")); // en el caso de tener hipotenusa, la ocuparemos y pediremos su respectivo valor
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
        
        caVector1=(float) Math.sqrt(suma); // Ahora empezaremos con la respectiva suma de vectores 
        caVector1Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));
        System.out.println("el ca del vector es: "+caVector1);
        
    }    
     
    }
     
     
        do{ // aqui es donde nos pedira, junto a cada uno de sus valores, del segundo vector
        tipoDeVector2=Integer.parseInt(JOptionPane.showInputDialog("El segundo vector tiene?\n1)Una magnitud y un angulo\n2)Dos magnitudes "));
    }while(2!=tipoDeVector2&&tipoDeVector2!=1);   
        
    if(tipoDeVector2==1){ // aqui establecremos que tipo de datos tenemos de el
        
        hVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite la magnitud del vector 2")); //primero con su tipo de dato(float) y poner su magnitud
        caVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto adyacente es: \npositiva=true\nnegativa=false"));
        coVector2Positivo=Boolean.parseBoolean(JOptionPane.showInputDialog("La direccion del cateto opuesto es: \npositiva=true\nnegativa=false"));
        do{
        
        gradosVector2=Float.parseFloat(JOptionPane.showInputDialog("Digite los grados del vector 2"));
        
        }while(gradosVector2>90); //repetimos la parte delos grados , si es el caso pasa a radianes
        
        gradosVector2=Math.toRadians(gradosVector2);
        
        caVector2= (Math.cos(gradosVector2));
        coVector2= (Math.sin(gradosVector2));// utilizamos a coseno y seno
        
        
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
     
     if(caVector2Positivo==true){ //aqui confirmamos que los dos vetores queden en positivos
     
         CAFINAL=caVector1+caVector2; //y la operacion final, que sera la suma de ellos
     
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
     
     JOptionPane.showMessageDialog(null, "EL VECTOR RESULTANTE ES: \n"+HFINAL); // una ventana emergente la cual saldra con una con el resultado final, es decir el vector resultante, de la operacion, simplemente con la palabra ya guardada
    }
    
}
