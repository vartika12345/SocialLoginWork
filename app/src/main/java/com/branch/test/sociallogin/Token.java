package com.branch.test.sociallogin;

/**
 * Created by vartika on 13/06/2016.
 */
public class Token {
    private static String tokenId;
    private boolean signedIn;

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    public static String getTokenId() {
        return tokenId;
    }

    public static void setTokenId(String tokenId) {
        Token.tokenId = tokenId;
    }
}
