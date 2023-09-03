/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TallerJavaNetbeans;

/**
 *
 * @author SirArthur
 */
public class punto9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Decalaracion de variables
       int ne=5,i=0,vta=0,vtb=0,vtc=0,vtd=0,vtca=0,vtcb=0,vtcc=0,vtcd=0,vtce=0;
       double vtm=0;
       
        int [] c = new int [ne];
        int [] ca = new int [ne];
        int [] cb = new int [ne];
        int [] cc = new int [ne];
        int [] cd = new int [ne];
        // imprimir los candidatos,votos y comunas
        c[i]=1; ca[i]=194; cb[i]=48; cc[i]=206; cd[i]=45;
        c[i+1]=2; ca[i+1]=180; cb[i+1]=20; cc[i+1]=320; cd[i+1]=16;
        c[i+2]=3; ca[i+2]=221; cb[i+2]=90; cc[i+2]=140; cd[i+2]=20;
        c[i+3]=4; ca[i+3]=432; cb[i+3]=50; cc[i+3]=821; cd[i+3]=14;
        c[i+4]=5; ca[i+4]=820; cb[i+4]=61; cc[i+4]=946; cd[i+4]=18;
   
        System.out.println("comuna "+" Candidato A "+" Candidato B "+ " Candidato C "+" Candidato D ");
        for(i=0;i<ne;i++){
            System.out.println(c[i]+"          "+ca[i]+"          "+cb[i]+"         "+cc[i]+"         "+cd[i]);
        }
        //calculo para saber el numero de votos por candidato
        for(i=0;i<ne;i++){
            vta=vta+ca[i];
            vtb=vtb+cb[i];
            vtc=vtc+cc[i];
            vtd=vtd+cd[i];}
        
        
        //calculo para saber el numero de votos por columna
         for(i=0;i<ne;i++){
          vtca=(ca[i]+cb[i]+cc[i]+cd[i]);
            for(i=1;i<ne;i++){
              vtcb=(ca[i]+cb[i]+cc[i]+cd[i]);
               for(i=2;i<ne;i++){
                vtcc=(ca[i]+cb[i]+cc[i]+cd[i]);
                    for(i=3;i<ne;i++){
                     vtcd=(ca[i]+cb[i]+cc[i]+cd[i]);
                        for(i=4;i<ne;i++){
                         vtce=(ca[i]+cb[i]+cc[i]+cd[i]);
                        }
                    }
                  }
               }
            }
        
         
         
        
          
        
        
        //calculo de mayo numero de votaciones por columna
        if((vtca>vtcb)&&(vtca>vtcc)&&(vtca>vtcd)&&(vtca>vtce)){
            System.out.println("La mayor cantidad de votos fue en la comuna 1 con: "+vtca);
        }else if((vtcb>vtca)&&(vtcb>vtcc)&&(vtcb>vtcd)&&(vtcb>vtce)){
            System.out.println("La mayor cantidad de votos fue en la comuna 2 con: "+vtcb);
        }else if((vtcc>vtcb)&&(vtcc>vtca)&&(vtcc>vtcd)&&(vtcc>vtce)){
             System.out.println("La mayor cantidad de votos fue en la comuna 3 con: "+vtcc);
        }else if((vtcd>vtcc)&&(vtcd>vtcb)&&(vtcd>vtca)&&(vtcd>vtce)){
             System.out.println("La mayor cantidad de votos fue en la comuna 4 con: "+vtcd);
        }else if((vtce>vtcd)&&(vtce>vtcc)&&(vtce>vtcb)&&(vtce>vtca)){
             System.out.println("La mayor cantidad de votos fue en la comuna 5 con: "+vtce);
        }
        
                //Calculo de mayor votacion por candidato
                if((vta>vtb)&&(vta>vtc)&&(vta>vtd)){
                }else if((vtb>vta)&&(vtb>vtc)&&(vtb>vtd)){                   
                }else if((vtc>vtb)&&(vtc>vta)&&(vtc>vtd)){                    
                }else if((vtd>vtc)&&(vtd>vtb)&&(vtd>vta)){
                }
            //calculo para saber el 50% del total de votaciones
            vtm=(((vta+vtb+vtc+vtd)*50)/100);
           
            //calculo para saber quien gano
            if((vta>vtb)&&(vta>vtc)&&(vta>vtd)){
                System.out.println("El ganador fue el candidato a");
            }else if((vtb>vta)&&(vtb>vtc)&&(vtb>vtd)){
                
                System.out.println("El ganador fue el candidato b");
            }else if((vtc>vta)&&(vtc>vtb)&&(vtc>vtd)){
                
                System.out.println("El ganador fue el candidato c");
            }else if((vtd>vtc)&&(vtd>vtb)&&(vtd>vta)){
                 
                 System.out.println("El ganador fue el candidato d");
            }
        System.out.println("El total de votos fue de: "+(vta+vtb+vtc+vtd));
       
    } 
}
    
