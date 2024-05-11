package tugasinterface;

    class Employee implements Payable {
        private Integer registrationNumber;
        private String name;
        private Integer salaryPerMonth;
        private Invoice[] invoices;

        public Employee(int i, String string, int j, Invoice[] invoices2) {
        this.registrationNumber = i;
        this.name = string;
        this.salaryPerMonth = j;
        this.invoices = invoices2;
        }

        @Override
        public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
        totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
        }

        @Override
        public String toString() {
        return "Nomor Registrasi : " + registrationNumber + "\n"
        + "Nama Karyawan : " + name + "\n" + "Gaji : " + salaryPerMonth
        ;
        }

        public void displayInvoices() {
        for (Invoice invoice : invoices) {
        System.out.println(invoice);
        }
    }
}

