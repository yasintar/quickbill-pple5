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
public class Barang {
    private String id;
    private String nama;
    private double hargabarang;
    private int jumlah;

    public Barang(String id, String nama, double hargabarang, int jumlah)
    {
        this.id=id;
        this.nama=nama;
        this.hargabarang=hargabarang;
        this.jumlah=jumlah;
    }
    
    public String getid(){
        return id;
    }
    
    public String getnama(){
        return nama;
    }
    
    public double gethargabarang(){
        return hargabarang;
    }
    
    public int getjumlah(){
        return jumlah;
    }
    
}
