package elec;

public class Elec {
		   
		public static void main (String args[]){
			int elec=120;
			if(elec<=50)
			{
			System.out.println("Bill : Rs 0");
			}
			else if(elec>50 && elec<=100)
			{
			elec=(elec-50)*6;
			System.out.println(elec);
			}
			else if(elec>100 && elec<=150)
			{
			elec=(elec-100)*8+(50*6);
			System.out.println(elec);
			}
			else {
			elec=(elec-150)*9+(50*6)+(50*8);
			System.out.println(elec);
			}
		}
	}
