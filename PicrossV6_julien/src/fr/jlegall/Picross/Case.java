package fr.jlegall.Picross;

public class Case {

	private int X, Y, etat;

	public Case(int x, int y) {
		this.X = x;
		this.Y = y;
		this.etat = 0;
	}

	public int getEtat() {
		return etat;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

}
