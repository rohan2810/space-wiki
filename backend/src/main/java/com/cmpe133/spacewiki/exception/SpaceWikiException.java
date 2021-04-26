package com.cmpe133.spacewiki.exception;

public class SpaceWikiException extends RuntimeException {
    public SpaceWikiException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpaceWikiException(String exMessage) {
        super(exMessage);
    }
}
