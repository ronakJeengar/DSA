package com.ronak.strings;

public class MinimumTimeToCollectGarbage {

    public static void main(String[] args) {
        String[] garbage = {"G", "P", "GP", "GG"};
        int[] travel = {2, 4, 3};

        int result = garbageCollection(garbage, travel);
        System.out.println("Total time required: " + result);
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        int pickP = 0, travelP = 0, lastHouseP = 0;
        int pickM = 0, travelM = 0, lastHouseM = 0;
        int pickG = 0, travelG = 0, lastHouseG = 0;

        for (int i = 0; i < garbage.length; i++) {
            String currHouse = garbage[i];

            for (int j = 0; j < currHouse.length(); j++) {
                char garbageType = currHouse.charAt(j);
                if (garbageType == 'P') {
                    pickP++;
                    lastHouseP = i;
                }
                if (garbageType == 'M') {
                    pickM++;
                    lastHouseM = i;
                }
                if (garbageType == 'G') {
                    pickG++;
                    lastHouseG = i;
                }
            }
        }

        for (int i = 0; i < lastHouseP; i++) {
            travelP += travel[i];
        }
        for (int i = 0; i < lastHouseM; i++) {
            travelM += travel[i];
        }
        for (int i = 0; i < lastHouseG; i++) {
            travelG += travel[i];
        }

        int totalPickingTime = pickP + pickM + pickG;
        int totalTravelTime = travelP + travelM + travelG;

        return totalPickingTime + totalTravelTime;
    }
}
