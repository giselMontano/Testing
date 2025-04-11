package OopsConcepts;

public class CssSelectors {
    public static void main(String[] args) {


                System.out.println( "Hello world!");

                String emailField = "input[type=' email']";
                String passwordField = "input[type='password']";

                String loginBtn = "button[type='submit']";
                String loginBtnAbsolute = "html body div div div form button[type='submit']" ;


                String koelLogo = "img[alt='Koel\'s logo']";
                //WE USE THE / TO BE ABLE TO FIND THE UNIQUE VALUE SO IT CAN RECOGNIZE THE ' OG KOEl's

        System.out.println("----------------CSS LOCATORS PRACTICE----------------");


        /* TEST #1
         * Create CSS locators for the following web elements on https://qa.koel.app/ (Koel webpage)
         * 1.) email address field
         * 2.) submit button
         * 3.) logout button
         * 4.) Search field
         * 5.) Favorites list (located on the homepage, in Playlist block)
         * ==============================================================
         * Remember to check your locators to meet the following criteria:
         * 1.) It must be unique
         * 2.) It should be short (avoid absolute paths and long locators)
         * 3.) Do not use any plugins to generate locators for you.
         *    The whole point of this HW is to practice finding locators by yourself
         */
        String emailFieldLocator = "input[type='email']";
        //THERE IS NOT SUBMIT BUTTON/ LOG IN BUTTON IS THE LOCATOR I FOUND
        String submitButtonLocator = "button[type='submit']";
        //. is the shortcut for css selector by class and when you have a space like logout control you put them together with a .
        String logoutButtonLocator = ".logout.control";
        String searchFieldLocator = "input[name='q']";
        //found the parent sidebar first and start looking until I found  playlist which is the parent of favorites
        //ALWAYS ADD A SPACE BEFORE THE CHILD AND . IS SHORTCUT FOR CLASS
        String favoritesLocator = "#playlists .favorites";
        //OR
        //String favoritesLocator = "li.playlists .favorites";

        System.out.println("CSS Locator for email field is: " + emailFieldLocator);
        System.out.println("CSS Locator for submit button is: " + submitButtonLocator);
        System.out.println("CSS Locator for logout button is: " + logoutButtonLocator);
        System.out.println("CSS Locator for search field is: " + searchFieldLocator);
        System.out.println("CSS Locator for favorites list is: " + favoritesLocator);


        System.out.println("=====2 TEST========");
        /*
         *  TEST #2 - CSS locators

         * Optional Assignment

         * 1.) For our optional homework (not required), let's try and
             locate additional web elements on https://qa.koel.app/
            (Koel webpage) which we will also use in our next homeworks.
         * 2.) All Songs menu item (located on the homepage,
             in YOUR MUSIC block)
         * 3.) First user playlist element (requires at least one playlist
             to be created by the user, located on the homepage in the Playlist block)
         * 4.) Sound bar icon (requires the user to play a song,
            it is located beside the favorite icon on the lower right of the page)
         */

        String allSongsMenuItemLocator = "#sidebar .songs";
        String firstUserPlaylistLocator = "a[href='#!/playlist/103884']";
        String soundBarPlayIconLocator = "span .play";

        System.out.println("CSS Locator for the All Songs menu item is: " + allSongsMenuItemLocator);
        System.out.println("CSS Locator for the First user playlist is: " + firstUserPlaylistLocator);
        System.out.println("CSS Locator for the Sound bar icon is: " + soundBarPlayIconLocator);

    }
}
