package tasca2n1exercici1;

import java.util.ArrayList;

public class Venta {

	private ArrayList<Producto> prod = new ArrayList<Producto>();
	private int totalVenta;

	public Venta() {
		this.prod = new ArrayList<>();
	}

	public int getTotalVenta() {
		return totalVenta;
	}

	public void agregarProd(Producto pr) {
		this.prod.add(pr);
	}

	public int calcularTotal() throws VentaVaciaException {
		int total = 0;
		int precio;
		if(prod.isEmpty()) {
			throw new VentaVaciaException("no hay productos en la cesta");
		}
		else {
		for (Producto p : prod) {
			precio = p.getPrecio();
			total += precio;
		}
		totalVenta = total;
		return total;
		}
	}

	public void mostrarProductos() {
		try {
			for (int i = -1; i < prod.size(); i++)
				System.out.println(prod.get(i));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("outOfBoundsMr");
		}
	}

}
