package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        final SportSocialNetworkUserImpl<User> mRossi = new SportSocialNetworkUserImpl<>("Mario", "Rossi", "mRossi");
        
        mRossi.addSport(Sport.BASKET);
  
        System.out.println("Mario Rossi practices Basket: " + mRossi.hasSport(Sport.BASKET));
        System.out.println("Mario Rossi does not like Bike: " + !mRossi.hasSport(Sport.BIKE));
    }
}
