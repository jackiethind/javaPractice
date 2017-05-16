package com.java24hours;

class Arrays {
    public static void main(String[] arguments) {
        String[] naughtyChild;
        int[] reindeerWeight;
        boolean[] hostileAirTravelNations;
        int[] elfSeniority = new int[250];
        String[] reindeerNames = { "Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid",
        "Donder", "Blitzen"};
        System.out.println("there are " + reindeerNames.length + " reindeer.");
        String[] reindeerNames2 = new String[8];
        reindeerNames2[0] = "Dasher";
        reindeerNames2[1] = "Dancer";
        reindeerNames2[2] = "Prancer";
        reindeerNames2[3] = "Vixen";
        reindeerNames2[4] = "Comet";
        reindeerNames2[5] = "Cupid";
        reindeerNames2[6] = "Donder";
        reindeerNames2[7] = "Blitzen";
        boolean[][] selectedPoint = new boolean[50][50];
        selectedPoint[4][13] = true;
        selectedPoint[7][6] = true;
        selectedPoint[11][22] = true;
        for(int i = 0; i < selectedPoint.length; i++) {
            System.out.print(i);
        }
    }
}