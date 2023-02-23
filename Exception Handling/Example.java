import javax.swing.JOptionPane;

public class Example {
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer(10);
        StringBuffer buffer3 = new StringBuffer("Hello");

        String output = "buffer="+buffer1.toString()+"\n"+
        "buffer2=\""+buffer2.toString()+"\n"+ "buffer3=\""+buffer3.toString()+"\n";

        JOptionPane.showMessageDialog(null, output, "StringClass",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}