package tugasinterface;

public class main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Sepatu", 1, 2000000);
        Invoice invoice2 = new Invoice("Tas", 1, 500000);
        Invoice[] invoices = {invoice1, invoice2};
        Employee employee = new Employee(954023, "Rafi",
        5000000, invoices);
        System.out.println("--------------------------------------------");
        System.out.println("INFORMASI KARYAWAN \n");
        System.out.println(employee);
        System.out.println("Total gaji setelah dipotong hutang belanjaan di koperasi : " + employee.getPayableAmount());
        System.out.println("--------------------------------------------------------------------- ");
        System.out.println("INVOICE KARYAWAN" );
        employee.displayInvoices();
        System.out.println("---------------------------------------------------------------------");
        }
        }

