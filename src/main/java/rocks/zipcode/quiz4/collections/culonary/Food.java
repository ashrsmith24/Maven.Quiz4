package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private ArrayList<Spice> spices;

    public Food(ArrayList<Spice> spices) {
        this.spices = spices;
    }

    public Food() {
        this(new ArrayList<>());
    }

    public List<Spice> getAllSpices() {
        return spices;
    }


    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return null;
    }


        public void applySpice(Spice spice) {
            spices.add(spice);

        }
}
