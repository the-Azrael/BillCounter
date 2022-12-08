import java.math.BigDecimal;
// НДС
public class VATaxType extends TaxType {
    private static BigDecimal VALUE_ADDED_TAX = new BigDecimal(0.2);

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(VALUE_ADDED_TAX);
    }
}
