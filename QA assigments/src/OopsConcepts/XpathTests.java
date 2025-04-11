package OopsConcepts;

public class XpathTests {
    public static void main(String[] args) {
        String searchField = "// input[@name='q']";
        String logoutBtn = "//a[@class=' logout control']";
        String favoritesPlaylist = "//section[@id='playlists']//li/a[@href='#!/favorites']";
        String lyricsTab = "//button[@id=' extraTabLyrics']";
        String headingGreetings = "//section[@id='homeWrapper']//div[@class='heading-wrapper' ]//h1";
        String headingMostPlayed = "//div[@class=' two-cols']//section//h1[text()='Most Played' ]";
        String volumeRangeIcon = "//input [@id=' volumeRange]" ;
        String playBtn = "//span[@title='Play or resume' ]/i[@class='fa fa-play']";

        System.out.println("======ANOTHER APPROACH========");
        //sear Bar
        String search = "//input[@type='search']";
        //Logout icon
        String logout = "//a[@class='logout control']";
        //Favorites
        String favorites = "//section[@id='playlists']//li[@class='playlist favorites']";
        //Lyrics tab
        String lyrics = "//*[@id=' extraTabLyrics']";
        //Howdy
        String howdy = "//*[@id='homeWrapper']//header//h1";
        //Most played
        String mostPlayed = "//h1[contains(text(), 'Most Played*)]";
        //Volume range
        String volumeRange = "//*[@id=' volume']";
        //Play button
        String playButton = "//span[@title='Play or resume']";




        System.out.println("===TESTS #13 - Xpath locators====");

        /*
         * TESTS #13 - Xpath locators
         *
         * Create Xpath locators for the following web elements on https://qa.koel.app/ (Koel webpage)
         * 1. email address field
         * 2. submit button
         * 3. logout button
         * 4. Search field
         * 5. Favorites list (located on the homepage in Playlist block)
         * ==============================================================
         * Remember to check your locators to meet the following criteria:
         * 1. It must be unique
         * 2. It should be short (avoid absolute paths and long locators)
         * 3. Do not use any plugins to generate locators for you.
         *    The whole point of this HW is to practice finding locators by yourself
         */

        String emailFieldLocator = "//input[@type='email']";
        String submitButtonLocator = "//button[@type='submit']";
        String logoutButtonLocator = "//a[@class='logout control']";
        String searchFieldLocator = "//input[@name='q']";
        //PARENT  CLASS --> //section[@id='playlists']
        // THEN WE FIND A CHILD CLASS ANYWHERE IN THE BODY WITH DOUBLE SLASH // + THE CHILD
        //IF IS A IMMEDIATE CHILD ONLY ONE SLASH IS NEEDED /

        String favoritesLocator = "//section[@id='playlists']//li[@class='playlist favorites']";

        System.out.println("Xpath Locator for email field is: " + emailFieldLocator);
        System.out.println("Xpath Locator for submit button is: " + submitButtonLocator);
        System.out.println("Xpath Locator for logout button is: " + logoutButtonLocator);
        System.out.println("Xpath Locator for search field is: " + searchFieldLocator);
        System.out.println("Xpath Locator for favorites list is: " + favoritesLocator);
    }
} // Closing brace for the Main class
