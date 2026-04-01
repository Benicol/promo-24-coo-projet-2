package duckcorp.duck;

/**
 * Canard en plastique standard.
 *
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class StandardDuck extends Duck {

    public static final double BASE_PRICE = 25.0;

    /**
     * Constructeur fourni. Génère automatiquement un identifiant unique.
     *
     * @param qualityScore
     */
    public StandardDuck(int qualityScore) {
        super(DuckType.STANDARD, qualityScore);
    }

    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }

    @Override
    public String describe() {
        return "Canard Standard";
    }
}
