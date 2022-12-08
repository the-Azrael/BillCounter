import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal(1_020_200.23), new IncomeTaxType(), new TaxService()),
                new Bill(new BigDecimal(200_053.12), new VATaxType(), new TaxService()),
                new Bill(new BigDecimal(10_000.234), new ProgressiveTaxType(), new TaxService())
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
