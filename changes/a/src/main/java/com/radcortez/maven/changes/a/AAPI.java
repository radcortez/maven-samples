package com.radcortez.maven.changes.a;

import com.radcortez.maven.changes.b.BAPI;

public class AAPI {
    public static void aOneMethod() {
        BAPI.bOneMethod();
    }

    public static void aTwoMethod() {
        BAPI.bTwoMethod();
    }
}
