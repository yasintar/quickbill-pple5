package MyFrames;

public class StockItem {

    private String id;
    private String pname;
    private int available;
    private int mrp;
    
    public StockItem(String id,String pname,int available, int mrp)
    {
        this.id=id;
        this.pname=pname;
        this.available=available;
        this.mrp=mrp;   
    }
            
    public String getid()
    {
        return id;
    }
    public String getpname()
    {
        return pname;
    }
    public int getavailable()
    {
        return available;
    }
    public int getmrp()
    {
        return mrp;
    }
  }
