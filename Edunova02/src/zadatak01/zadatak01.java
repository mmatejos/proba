package zadatak01;

import javax.swing.JOptionPane;

public class zadatak01 {

		public static void main(String[] args) {
			
			int broj1 = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 1"));
			int broj2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 2"));
			int broj3 = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 3"));
			
			
			
		
		if (broj1 >= broj2 && broj1>=broj3) {
			System.out.println(broj1);
		}else if (broj2 >= broj1 && broj2>=broj3) {
			System.out.println(broj2);
		
		}else if (broj3 >= broj1 && broj3>=broj2) {
			System.out.println(broj3);
		}
		
		}
}
		
