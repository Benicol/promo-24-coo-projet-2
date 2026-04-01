package duckcorp.duck;

/**
 * Canard en plastique miniature.
 *
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class MiniDuck extends Duck {

    public static final double BASE_PRICE = 12.0;

    /**
     * Constructeur fourni. Génère automatiquement un identifiant unique.
     *
     * @param qualityScore
     */
    public MiniDuck(int qualityScore) {
        super(DuckType.MINI, qualityScore);
    }

    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }

    @Override
    public String describe() {
        return "Mini Canard";
    }
}
