package com.java24hours;

class Credits {
    public static void main(String[] arguments) {
        System.out.println("Anthony Ferrante directed \"Sharknado\" in 2013");
        // \' = single quotation  \" = double quotation \\ = backslash \t = tab
        // \b = backspace \r = carriage return \f = formfeed /n = newline
        System.out.println("Script by\nThunder Levin");
        System.out.println("\"'Sharknado\' is an hour and a half of your " 
        + "life that you'll never get back. \nAnd you won't want to.\"\n" 
        + "\t-- David Hinckley, New York Daily News");
        int length = 86;
        char rating = 'R';
        System.out.println("Running time: " + length + " minutes");
        System.out.println("Rated: " + rating);
        String searchKeywords = "";
        searchKeywords += "sharks ";
        searchKeywords += "hurricane ";
        searchKeywords += "danger";
        System.out.println(searchKeywords);
        // test if strings are equal to each other with equals method
        String favorite = "chainsaw";
        String guess = "chainsaw";
        System.out.println("Is Fin's favorite a weapon a " + guess + "?");
        System.out.println("Answer: " + favorite.equals(guess));
        
        // find string length 
        String cinematographer = "Gurparsad Thind";
        int nameLength = cinematographer.length();
        System.out.println("The length of the cinematographers name is " + nameLength);
        // to uppercase
        String fin = "Ian Zuckerberg";
        String change = fin.toUpperCase();
        // to lowercase
        String change2 = fin.toLowerCase();
        System.out.println(change.equalsIgnoreCase(change2)); // this returns true 
        // looking for a string via index
//        int position = script.indexOf("We're gonna need a bigger chopper");
        // looking for a string via contains
//        if (script.contains("There's a shark in your pool")) {
//            int stars = 4;
//        }
        
    }
}