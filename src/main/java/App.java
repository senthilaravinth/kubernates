public class App {

    public static void main(String[] args) {
        System.out.println("Delivery System running...");
        try {
            while (true) {
                Thread.sleep(10000); 
            }
        } catch (InterruptedException e) {
            System.err.println("Application interrupted.");
        }
    }

    public static class Order {
        public double totalAmount;

        public Order(double totalAmount) {
            this.totalAmount = totalAmount;
        }
    }

    public boolean isValid(Order order) {
        if (order == null) {
            return false;
        }
        
        // check minimum amount is 10
        if (order.totalAmount >= 10.0) {
            return true;
        } else {
            return false;
        }
    }
}
