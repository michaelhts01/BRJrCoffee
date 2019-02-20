public class bookSystem {
    private String nama, alamat, email;
    private long telepon;
    bookSystem(){
        nama="Tidak didefinisi";
        alamat="Tidak didefinisi";
        email="Tidak didefinisi";
        telepon=0;
    }
bookSystem(String nama,String alamat,String email,long telepon){
        this.nama=nama;
        this.alamat=alamat;
        setEmail(email);
        this.telepon=telepon;
    }
    void setNama(String nama) {
        this.nama = nama;
    }
 
    void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Email Tidak Valid");
        }
    }
 
    void setTelepon(long Telepon) {
       this.telepon=Telepon;
        
    }
 
    void setAlamat(String alamat) {
        this.alamat = alamat;
    }
 
    String getNama() {
        return nama;
    }
 
    String getAlamat() {
        return alamat;
    }
 
    Long getTelepon() {
        return telepon;
    }
 
    String getEmail() {
        return email;
    }
}