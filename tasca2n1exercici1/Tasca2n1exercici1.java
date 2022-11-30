package tasca2n1exercici1;

public class Tasca2n1exercici1 {

	public static void main(String[] args) {

		Producto producto1 = new Producto("chocolate", 3);
		Producto producto2 = new Producto("helado", 2);
		Producto producto3 = new Producto("tarta", 15);

		Venta venta1 = new Venta();

		venta1.agregarProd(producto3);
		venta1.agregarProd(producto1);
		venta1.agregarProd(producto2);

		venta1.mostrarProductos();

		try {
		System.out.println(venta1.calcularTotal());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
