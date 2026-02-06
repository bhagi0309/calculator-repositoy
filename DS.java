package bha;
import java.util.Scanner;
class product{
	private long id;
	private String ProductName;
	private String supplierName;
	
	product(){
	}
	product(long id,String productName,String supplierName){
		this.id=id;
		this.ProductName=productName;
		this.supplierName=supplierName;
	}
	public long getid() {
		return id;
	}
	public void setid(long id) {
		this.id=id;
	}
	public String getproductName() {
		return ProductName;
	}
	public void setproductName(String productName) {
		this.ProductName=productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public String setSupplierName(String suppliername) {
		return supplierName;
	}
	public void display() {
		System.out.println("product id is"+getid());
		System.out.println("product Name is"+getproductName());
		System.out.println("supplier Name is" + getSupplierName());
		
	}
}

public class DS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id");
		long id = sc.nextLong();
		System.out.println("Enter the product name");
		String pname=sc.next();
		System.out.println("is the product supplied by nivas suppliers?type yes or no(not case sensitive)");
	
		String ans = sc.next();
		String supplier = null;
		if(ans.equalsIgnoreCase(Case("yes"))) {
			String suplier = "nivas";
		}else {
			System.out.println("Enter the supplier name");
			supplier = sc.next();
		}
		product p = new product(id,pname,supplier);
			p.display();
		}

	private static String Case(String string) {
		// TODO Auto-generated method stub
		return null;
	}
			

	}


