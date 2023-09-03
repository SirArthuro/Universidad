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
       int ne=5,i=0,vta=0,vtb=0,vtc=0,vtd=0,vtm=0;
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
            vta=ca[i];
            vtb=cb[i];
            vtc=cc[i];
            vtd=cd[i];}
                //Calculo de mayor votacion por comuna
                if((vta>vtb)&&(vta>vtc)&&(vta>vtd)){
                    System.out.println("La mayor cantidad de votos fue en la comuna 1 con: "+vta);
                }else if((vtb>vta)&&(vtb>vtc)&&(vtb>vtd)){
                    System.out.println("La mayor cantidad de votos fue en la comuna 2 con: "+vtb);
                }else if((vtc>vtb)&&(vtc>vta)&&(vtc>vtd)){
                    System.out.println("La mayor cantidad de votos fue en la comuna 3 con: "+vtc);
                }else if((vtd>vtc)&&(vtd>vtb)&&(vtd>vta)){
                    System.out.println("La mayor cantidad de votos fue en la comuna 4 con: "+vtd);
                }
            //calculo para saber el 50% del total de votaciones
            vtm=((vta+vtb+vtc+vtd)*50)/100;
           
            //calculo para saber quien gano
            if(vta>vtm){
                System.out.println("El ganador fue el candidato a");
            }else if(vtb>vtm){
                System.out.println("El ganador fue el candidato b");
            }else if(vtc>vtm){
                System.out.println("El ganador fue el candidato c");
            }else if(vtd>vtm){
                 System.out.println("El ganador fue el candidato a");
            }
        System.out.println("El total de votos fue de: "+(vta+vtb+vtc+vtd));
       
    } 
}
    

