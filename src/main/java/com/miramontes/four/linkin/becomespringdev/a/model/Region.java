package com.miramontes.four.linkin.becomespringdev.a.model;

public enum Region {
    Northern_California("Northern California"),
    Central_Coast("Central Coast"),
    Southern_California("Southern California"),
    Varies("Varies");

    private final String label;

    private Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String byLabel){
        for (Region r : Region.values()){
            if(r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }
}
