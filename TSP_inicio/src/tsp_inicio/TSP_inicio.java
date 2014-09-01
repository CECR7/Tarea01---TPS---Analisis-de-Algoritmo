package tsp_inicio;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TSP_inicio {       
    
    public static class pos_solucion{
        private ArrayList<City> region = new ArrayList<City>();
        private double recorrido=0;
        
        public void distancia_total(){
            this.recorrido=0;
            int largo = this.region.size();
            
            for(int i=0;i<largo-2;i++){
                recorrido=recorrido+this.region.get(i).distanceTo(this.region.get(i+1));                
            }
            recorrido = recorrido + this.region.get(largo-1).distanceTo(this.region.get(0));
        }
    }
    
    public static void Permut(int[] elem,ArrayList<Integer> act, int n, int r) {
        if (n == 0) {       
            System.out.println(act);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) { // Controla que no haya repeticiones
                    act.add(elem[i]);
                    Permut(elem,act, n - 1, r); 
                }
            }
        }
    }
    
    public static long total_perm(int[] elem, String act, int n, int r){
        long total=0;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(Integer.toString(elem[i]))){ 
                    total = total + total_perm(elem, act + elem[i] + ", ", n - 1, r);
                }
            }
        }
        return total;
    }
    
    private static void permutacion(int[] elem, String act, int n, int r) {
        if (n == 0) {
            System.out.println(act);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(Integer.toString(elem[i]))){ 
                    permutacion(elem, act + elem[i] + ", ", n - 1, r);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Random rnd = new Random(111);
        int cantidad_ciudades = 9;
        int[] elementos;
        ArrayList<Integer> orden = new ArrayList<Integer>();
        
        elementos = new int[cantidad_ciudades];
        for(int j=0;j<cantidad_ciudades;j++){
            //elementos[j]=rnd.nextInt(100);
            elementos[j]=j+1;
        }
        int n = elementos.length;                  //Tipos para escoger
        int r = elementos.length;   //Elementos elegidos
        long total_p=0;
        
        //Permut(elementos,orden, n, r);
        total_p = total_perm(elementos,"",n,r);
        //Perm2(elementos,"",n,r);
        System.out.println(total_p);
        
        
        
        //aqui empieza el trabajo
        /*
        List<City> ciudades = new ArrayList<City>();
        int[] permutacion = new int[cantidad_ciudades];
        
        for (int i=1; i <=cantidad_ciudades; i++)
            ciudades.add(new City(i,rnd.nextInt(100),rnd.nextInt(100)));
	
        List<City> respaldo = new ArrayList<City>(ciudades);
        List<City> recorrido = new ArrayList<City>();
        
        int contador_while = cantidad_ciudades;
        while(contador_while>0){
            int alazar = rnd.nextInt(contador_while);
            recorrido.add(new City(respaldo.get(alazar).getID(),respaldo.get(alazar).getX(),respaldo.get(alazar).getY()));
            respaldo.remove(alazar);
            contador_while--;
        }       
        
        double distancia_total=0;
        for (int i=0; i <cantidad_ciudades-1; i++){ 
            distancia_total=distancia_total+recorrido.get(i).distanceTo(recorrido.get(i+1));
            //System.out.println(distancia_total);
        }
        
        distancia_total = distancia_total+recorrido.get(cantidad_ciudades-1).distanceTo(recorrido.get(0));
        System.out.println(ciudades);
        System.out.println(recorrido);
        System.out.println(respaldo);
        System.out.println(distancia_total);
        */
    }
    
}
