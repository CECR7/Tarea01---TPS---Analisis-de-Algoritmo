/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tsp_inicio;

/**
 *
 * @author daniel_echoes
 */
public class City {
        private int id;
	private int x;
	private int y;
        
        
        public City (){
		this.id = 0;
		this.x = 0;
		this.y = 0;
	}
        
        public City (int id, int x, int y){
		this.id = id;
		this.x = x;
		this.y = y;
	}
	
        public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}
        
        public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
        	
	public double distanceTo (City destino){
		return  Math.sqrt(Math.pow(this.x - destino.getX(), 2) + 
				Math.pow(this.y - destino.getY(), 2));
	}
        
        public void delete(){
            this.x =0;
            this.y =0;
            this.id =0;          
        }
        
        @Override
	public String toString() {
		//return id + "";
		return id + " (" + x + ", " + y + ")";
	}
}
