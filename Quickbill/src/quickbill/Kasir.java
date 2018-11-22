/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quickbill;

/**
 *
 * @author Korporasi 3
 */
public class Kasir {
    private String id;
    private String nama;
    private int notelp;
    private String alamat;
    private String email;
    private String password;
    
    public Kasir(String id, String nama, int notelp, String alamat, String email, String password)
    {
        this.id=id;
        this.nama=nama;
        this.notelp=notelp;
        this.alamat=alamat;
        this.email=email;
        this.password=password;
    }
    
    public String getid(){
        return id;
    }
    
    public String getnama(){
        return nama;
    }
    
    public int getnotelp(){
        return notelp;
    }
    
    public String getalamat(){
        return alamat;
    }
    
    public String getemail(){
        return email;
    }
    
    public String getpass(){
        return password;
    }
    
}
