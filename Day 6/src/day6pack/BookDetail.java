package day6pack;

import java.util.ArrayList;

public class BookDetail {
	public static void main(String args[]) 
    {
        ArrayList<BDetail> list=new ArrayList<>();
        System.out.println("---Book details---");
        BDetail b1=new BDetail("book1", "01","Rs 200","jer");
        BDetail b2=new BDetail("book2", "02","Rs 170","abc");
        BDetail b3=new BDetail("book3", "03","Rs 220","mnp");    
        BDetail b4=new BDetail("book4", "04","Rs 400","pqr");
        
          list.add(b1);
          list.add(b2);
          list.add(b3);
          list.add(b4);
          for( BDetail b:list)
          {
              System.out.println(b.name+"  "+b.bid+" "+b.bprice+" "+b.bauthor+" ");
          }
    }
}
class BDetail
{
    String name;
    String bid;
    String bprice;
    String bauthor;
    public BDetail(String name, String bid,String bprice,String bauthor) {
        super();
        this.name = name;
        this.bid = bid;
        this.bprice = bprice;
        this.bauthor=  bauthor;
    }    
}
