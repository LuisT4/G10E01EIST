package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest  " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } if (query.toLowerCase().contains("name")) {
            return "Robert";
        } else if(query.contains("/api?q=2ecb2920:%20what%20is%205%20plus%2015")) {
            return "Luis ";
        } else return "";
    }
}
