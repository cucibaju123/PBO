public class AkunGithub{
	private String nama;
	private String username;
	private String email;
	private String password;
	private String lokasi;
	private String namaPerusahaan;
	private String telepon;
	private int jumlahRepository;
	private int jumlahTeman;
	private double noPaypal;
	
	public AkunGithub(String nama, String username, String email, String password, String lokasi, String namaPerusahaan, String telepon, int jumlahRepository, int jumlahTeman, double noPaypal){
		this.nama = nama;
		this.username = username;
		this.email = email;
		this.password = password;
		this.lokasi = lokasi;
		this.namaPerusahaan = namaPerusahaan;
		this.telepon = telepon;
		this.jumlahRepository = jumlahRepository;
		this.jumlahTeman = jumlahTeman;
		this.noPaypal = noPaypal;
	}
	
	public int getJumlahRepository(){
		return jumlahRepository;
	}
	
	public int getJumlahTeman(){
		return jumlahTeman;
	}
	
	public double getnoPaypal(){
		return noPaypal;
	}
	
	public String getNama(){
		return nama;
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getEmail(){
		return email;
	}
	
	
	
	
	


}