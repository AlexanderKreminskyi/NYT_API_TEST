package core.search;

public class Link {
    private static final String linkToApiSearch = "https://api.nytimes.com/svc/search/v2/articlesearch.json?";

    public static String getLinkSearch() {
        return linkToApiSearch;
    }
}
