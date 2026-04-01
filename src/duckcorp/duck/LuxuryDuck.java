package duckcorp.duck;

/**
 * Canard en plastique de luxe.
 *
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class LuxuryDuck extends Duck {

    public static final double BASE_PRICE = 80.0;

    /**
     * Constructeur fourni. Génère automatiquement un identifiant unique.
     *
     * @param qualityScore
     */
    public LuxuryDuck(int qualityScore) {
        super(DuckType.LUXURY, qualityScore);
    }

    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }

    @Override
    public String describe() {
        return "Canard de Luxe";
    }
}
