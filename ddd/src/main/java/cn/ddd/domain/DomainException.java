package cn.ddd.domain;

class DomainException extends RuntimeException {
    DomainException(final String message) {
        super(message);
    }
}
