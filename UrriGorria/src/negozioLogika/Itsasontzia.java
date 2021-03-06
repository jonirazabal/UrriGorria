package negozioLogika;

import java.util.ArrayList;

import negozioLogika.ItsasontziTile;

public abstract class Itsasontzia {
	private int luzera;
	private int prezioa;
	private ItsasontziTile[] tileLista;
	public Itsasontzia(int pLuzera, int pPrezioa){
		luzera = pLuzera;
		prezioa = pPrezioa;
		tileLista= new ItsasontziTile[luzera];
		}
	public void itsasontziaKokatu(int x, int y, char norabidea){
		//Mapan jada itsasontzia kokatu ahal dela begiratu dugu
		for (int i=0;i<luzera;i++){
			tileLista[i] = new ItsasontziTile(x, y, this);
			if(norabidea=='N') y--;
			if(norabidea=='S') y++;
			if(norabidea=='E') x++;
			if(norabidea=='W') x--;
		}
	}
	
	public int getLuzera(){
		return luzera;
	}
	
	public void erasoaJaso(int x, int y){
		for(int i=0;i<luzera;i++){
			if(tileLista[i].kokalekuHauDa(x, y)){
				tileLista[i].jo();
				luzera--;
			}
			if(luzera==0) System.out.println("Hondoratuta!");
		}
	}
	public int getPrezioa(){
		return prezioa;
	}
	
	public abstract void informazioaInprimatu();

}


