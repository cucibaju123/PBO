public class Inti{
	public static void main(String[]args){
		AkunGithub akun = new AkunGithub("Muhammad Nabil", "nabilewako", "cucibaju123@gmail.com", "Cucibaju123", "Katulampa, Bogor, Jawa Barat", "Google, Inc.", "088008780", 2, 1, 2323343 );
		
		System.out.println("Nama: "+akun.getNama());
		System.out.println("Username: "+akun.getUsername());
		System.out.println("Email: "+akun.getEmail());
		System.out.println("Jumlah Repository: "+akun.getJumlahRepository());
		
		
	}
}