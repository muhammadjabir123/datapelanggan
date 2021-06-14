package apl;
import java.util.*; 
public class datapelanggan {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in );
		
		int i, jml_data;
		String[] kode_plg = new String[10];
		String[] nama = new String[10];
		String[] alamat = new String[10];
		String ulang;
		
		//input
		do {
		System.out.print("Masukan Jumlah Data");
		jml_data = input.nextInt ();
		for(i=1;i<=jml_data;i++);
		{
			System.out.println("Data ke-"+i);
			System.out.println("Masukan Kode Pelanggan : ");
			kode_plg[i]=input.next();
			System.out.println("Masukan Nama Pelanggan : ");
			nama[i]=input.next();
			System.out.println("Masukan Alamat Pelanggan : ");
			alamat[i]=input.next();
		}	
	
	//output
		System.out.println("\n\t==DATA PELANGGAN==");
		System.out.println("=======================================");
		for(i=1;i<=jml_data;i++);
		{
			System.out.println("Data ke-"+i);
			System.out.println("Kode Pelanggan : " +kode_plg[i]);
			System.out.println("Nama Pelanggan : " +nama[i]);
			System.out.println("Alamat Pelanggan : " +alamat[i]);

		}
	
		System.out.println("Mau Input Data lagi [y|n] ? : ");
		ulang = input.next();
				
		}
		while(ulang.equals("Y") ||ulang.equals("y"));
	
	}
	
		
}
