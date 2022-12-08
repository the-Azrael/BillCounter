import java.math.BigDecimal;
//Прогрессивный налог, до PROGRESSIVE_SUM тысяч = PROGRESSIVE_TAX_UP_TO, больше 100 тысяч = PROGRESSIVE_TAX_OVER
public class ProgressiveTaxType extends TaxType {
    protected static BigDecimal PROGRESSIVE_SUM = new BigDecimal(100_000);
    protected static BigDecimal PROGRESSIVE_TAX_UP_TO = new BigDecimal(0.1);
    protected static BigDecimal PROGRESSIVE_TAX_OVER = new BigDecimal(0.15);

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(PROGRESSIVE_SUM) == -1) {
            return amount.multiply(PROGRESSIVE_TAX_UP_TO);
        } else {
            return amount.multiply(PROGRESSIVE_TAX_OVER);
        }
    }
}
