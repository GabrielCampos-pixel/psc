package EstruturaSequencial;
import javax.swing.JOptionPane;
public class Sequencial11P {
	public static void main(String[] args) {
      String numero;
      numero=JOptionPane.showInputDialog("Informe um numero para ser tabuado: ");
      int num=Integer.parseInt(numero);
      String mensagem = "A tabuada é: " + "\n" + 
      num+"x0= " +num*0+ "\n"+
      num+"x1= " +num*1+ "\n"+
      num+"x2= " +num*2+ "\n"+
      num+"x3= " +num*3+ "\n"+
      num+"x4= " +num*4+ "\n"+
      num+"x5= " +num*5+ "\n"+
      num+"x6= " +num*6+ "\n"+
      num+"x7= " +num*7+ "\n"+
      num+"x8= " +num*8+ "\n"+
      num+"x9= " +num*9+ "\n"+
      num+"x10= " +num*10+ "\n";
      JOptionPane.showMessageDialog(null, mensagem);
	}
}