import java.math.BigDecimal;
// Подоходный налог
public class IncomeTaxType extends TaxType {
    private static BigDecimal INCOME_TAX = new BigDecimal(0.13);

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(INCOME_TAX);
    }
}
