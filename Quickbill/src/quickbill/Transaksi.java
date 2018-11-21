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
public class Transaksi {
    private String id;
    private String namapelanggan;
    private int jumlahtransaksi;
    
    
    public Transaksi(String id, String namapelanggan, int jumlahtransaksi)
    {
        this.id=id;
        this.namapelanggan=namapelanggan;
        this.jumlahtransaksi=jumlahtransaksi;
    }
    
    public String getid(){
        return id;
    }
    
    public String getnamapelanggan(){
        return namapelanggan;
    }
    
    public int getjumlahtransaksi(){
        return jumlahtransaksi;
    }
    
}
