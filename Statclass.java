class MotherBoard {

   // static nested class
   static class USB{
       int usb2 = 2; // usb2 = 2
       int usb3 = 1; // usb3 = 1
       int getTotalPorts(){
           return usb2 + usb3;
       }
   }

}
public class Statclass {
   public static void main(String[] args) {
      
       MotherBoard.USB usb = new MotherBoard.USB();
       System.out.println("Total Ports = " + usb.getTotalPorts()); // getTotalPorts = usb2 + usb3 (2+1)
   }
}